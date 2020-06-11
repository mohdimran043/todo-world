package net.servicestack.androidgrpc;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import net.servicestack.ChannelBuilder;

import java.io.InputStream;

import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;
import pttserver_pb.Ptt;

public class MainActivity extends AppCompatActivity {

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ManagedChannel channel = null;
        InputStream is = null;
           InputStream clientis = null;
        try {
            is = getResources().getAssets().open("root.crt");
            clientis = getResources().getAssets().open("client2.crt");
            channel = ChannelBuilder.buildTls(
                "ptt.do7a.io", 2000, is,clientis);
            is.close();
            clientis.close();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        final GrpcServicesGrpc.GrpcServicesStub client =
            GrpcServicesGrpc.newStub(channel);
           final pttserver_pb.PttGRPCServiceGrpc.PttGRPCServiceStub client2 =
                   pttserver_pb.PttGRPCServiceGrpc.newStub(channel);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {

//            client.getHello(Services.Hello.newBuilder()
//                .setName("gRPC SSL").build(),
//                new StreamObserver<Services.HelloResponse>() {
//                    @Override
//                    public void onNext(Services.HelloResponse value) {
//                        Snackbar.make(view, value.getResult(), Snackbar.LENGTH_LONG)
//                                .setAction("Action", null).show();
//                    }
//                    @Override public void onError(Throwable t) {}
//                    @Override public void onCompleted() {}
//                });

                client2.hello(Ptt.HelloReq.newBuilder().
                                setInterface(Ptt.ConnectionInterface.newBuilder().setInterfaceType(Ptt.ConnectionInterface.InterfaceEnum.ANDROID).setInterfaceVersion("1.0").build())
                                .build(),
                        new StreamObserver<Ptt.HelloRes>() {

                            @Override
                            public void onNext(Ptt.HelloRes value) {
                                Snackbar.make(view, value.getChannelNameAr(), Snackbar.LENGTH_LONG)
                                        .setAction("Action", null).show();
                            }

                            @Override public void onError(Throwable t) {}
                            @Override public void onCompleted() {}
                        });
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
