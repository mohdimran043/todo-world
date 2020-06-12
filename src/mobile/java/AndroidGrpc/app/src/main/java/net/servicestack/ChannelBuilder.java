/*
 * Copyright 2016 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.servicestack;

import android.util.Log;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.okhttp.OkHttpChannelBuilder;

import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import javax.annotation.Nullable;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.security.auth.x500.X500Principal;

import static com.squareup.okhttp.ConnectionSpec.MODERN_TLS;

/**
 * A helper class to create a OkHttp based channel.
 */
public class ChannelBuilder {
    public static ManagedChannel buildTls(String host, int port, InputStream caStream, InputStream clientStream)
    {
        return build(host, port, null, true, caStream,clientStream);
    }

    public static ManagedChannel buildTls(
        String host, int port, InputStream caStream,InputStream clientStream, @Nullable String serverHostOverride)
    {
        return build(host, port, serverHostOverride, true, caStream,clientStream);
    }

    public static ManagedChannel build(
            String host,
            int port,
            @Nullable String serverHostOverride,
            boolean useTls,
            @Nullable InputStream caStream,
            @Nullable InputStream clientStream) {
        ManagedChannelBuilder<?> channelBuilder = ManagedChannelBuilder
                .forAddress(host, port)
                .maxInboundMessageSize(16 * 1024 * 1024);
        if (serverHostOverride != null) {
            // Force the hostname to match the cert the server uses.
            channelBuilder.overrideAuthority(serverHostOverride);
        }
        if (useTls) {
            try {

                ((OkHttpChannelBuilder) channelBuilder).useTransportSecurity();
                ((OkHttpChannelBuilder) channelBuilder).connectionSpec(MODERN_TLS);
                ((OkHttpChannelBuilder) channelBuilder).sslSocketFactory(getSslSocketFactory(caStream,clientStream));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            channelBuilder.usePlaintext();
        }
        return channelBuilder.build();
    }

    private static SSLSocketFactory getSslSocketFactory(@Nullable InputStream testCa,@Nullable InputStream clientcert)
            throws Exception {
        if (testCa == null) {
            return (SSLSocketFactory) SSLSocketFactory.getDefault();
        }
        SSLContext context = SSLContext.getInstance("TLSv1.3");

        context.init(getKeyManagers(clientcert), getTrustManagers(testCa) , null);
        String[] mylist= context.createSSLEngine().getEnabledProtocols();
        for(int i =0 ;i< mylist.length;i++){
            Log.d("GRPC DEMO",mylist[i]);
        }

       // return new TLSSocketFactory(context.getSocketFactory());
        return context.getSocketFactory();

    }
    private static KeyManager[] getKeyManagers(InputStream testCa) throws Exception {
        KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
        ks.load(null);
        CertificateFactory cf = CertificateFactory.getInstance("X.509");
        X509Certificate cert = (X509Certificate) cf.generateCertificate(testCa);
        X500Principal principal = cert.getSubjectX500Principal();
        ks.setCertificateEntry(principal.getName("RFC2253"), cert);
        KeyManagerFactory kmf =
                KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        String password = "";
        kmf.init(ks, password.toCharArray());
        return kmf.getKeyManagers();
    }
    private static TrustManager[] getTrustManagers(InputStream testCa) throws Exception {
        KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
        ks.load(null);
        CertificateFactory cf = CertificateFactory.getInstance("X.509");
        X509Certificate cert = (X509Certificate) cf.generateCertificate(testCa);
        X500Principal principal = cert.getSubjectX500Principal();
        ks.setCertificateEntry(principal.getName("RFC2253"), cert);
        // Set up trust manager factory to use our key store.
        TrustManagerFactory trustManagerFactory =
                TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(ks);
        return trustManagerFactory.getTrustManagers();
    }
}
