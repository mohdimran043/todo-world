package pttserver_pb;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.31.0-SNAPSHOT)",
    comments = "Source: ptt.proto")
public final class PttGRPCServiceGrpc {

  private PttGRPCServiceGrpc() {}

  public static final String SERVICE_NAME = "pttserver_pb.PttGRPCService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pttserver_pb.Ptt.HelloReq,
      pttserver_pb.Ptt.HelloRes> getHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Hello",
      requestType = pttserver_pb.Ptt.HelloReq.class,
      responseType = pttserver_pb.Ptt.HelloRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pttserver_pb.Ptt.HelloReq,
      pttserver_pb.Ptt.HelloRes> getHelloMethod() {
    io.grpc.MethodDescriptor<pttserver_pb.Ptt.HelloReq, pttserver_pb.Ptt.HelloRes> getHelloMethod;
    if ((getHelloMethod = PttGRPCServiceGrpc.getHelloMethod) == null) {
      synchronized (PttGRPCServiceGrpc.class) {
        if ((getHelloMethod = PttGRPCServiceGrpc.getHelloMethod) == null) {
          PttGRPCServiceGrpc.getHelloMethod = getHelloMethod =
              io.grpc.MethodDescriptor.<pttserver_pb.Ptt.HelloReq, pttserver_pb.Ptt.HelloRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pttserver_pb.Ptt.HelloReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pttserver_pb.Ptt.HelloRes.getDefaultInstance()))
              .setSchemaDescriptor(new PttGRPCServiceMethodDescriptorSupplier("Hello"))
              .build();
        }
      }
    }
    return getHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pttserver_pb.Ptt.StartTalkReq,
      pttserver_pb.Ptt.StartTalkRes> getStartTalkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartTalk",
      requestType = pttserver_pb.Ptt.StartTalkReq.class,
      responseType = pttserver_pb.Ptt.StartTalkRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pttserver_pb.Ptt.StartTalkReq,
      pttserver_pb.Ptt.StartTalkRes> getStartTalkMethod() {
    io.grpc.MethodDescriptor<pttserver_pb.Ptt.StartTalkReq, pttserver_pb.Ptt.StartTalkRes> getStartTalkMethod;
    if ((getStartTalkMethod = PttGRPCServiceGrpc.getStartTalkMethod) == null) {
      synchronized (PttGRPCServiceGrpc.class) {
        if ((getStartTalkMethod = PttGRPCServiceGrpc.getStartTalkMethod) == null) {
          PttGRPCServiceGrpc.getStartTalkMethod = getStartTalkMethod =
              io.grpc.MethodDescriptor.<pttserver_pb.Ptt.StartTalkReq, pttserver_pb.Ptt.StartTalkRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartTalk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pttserver_pb.Ptt.StartTalkReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pttserver_pb.Ptt.StartTalkRes.getDefaultInstance()))
              .setSchemaDescriptor(new PttGRPCServiceMethodDescriptorSupplier("StartTalk"))
              .build();
        }
      }
    }
    return getStartTalkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pttserver_pb.Ptt.EndTalkReq,
      pttserver_pb.Ptt.EndTalkRes> getEndTalkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EndTalk",
      requestType = pttserver_pb.Ptt.EndTalkReq.class,
      responseType = pttserver_pb.Ptt.EndTalkRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pttserver_pb.Ptt.EndTalkReq,
      pttserver_pb.Ptt.EndTalkRes> getEndTalkMethod() {
    io.grpc.MethodDescriptor<pttserver_pb.Ptt.EndTalkReq, pttserver_pb.Ptt.EndTalkRes> getEndTalkMethod;
    if ((getEndTalkMethod = PttGRPCServiceGrpc.getEndTalkMethod) == null) {
      synchronized (PttGRPCServiceGrpc.class) {
        if ((getEndTalkMethod = PttGRPCServiceGrpc.getEndTalkMethod) == null) {
          PttGRPCServiceGrpc.getEndTalkMethod = getEndTalkMethod =
              io.grpc.MethodDescriptor.<pttserver_pb.Ptt.EndTalkReq, pttserver_pb.Ptt.EndTalkRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EndTalk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pttserver_pb.Ptt.EndTalkReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pttserver_pb.Ptt.EndTalkRes.getDefaultInstance()))
              .setSchemaDescriptor(new PttGRPCServiceMethodDescriptorSupplier("EndTalk"))
              .build();
        }
      }
    }
    return getEndTalkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pttserver_pb.Ptt.BroadcastNotificationMessageReq,
      pttserver_pb.Ptt.BroadcastNotificationMessageRes> getBroadcastNotificationMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BroadcastNotificationMessage",
      requestType = pttserver_pb.Ptt.BroadcastNotificationMessageReq.class,
      responseType = pttserver_pb.Ptt.BroadcastNotificationMessageRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pttserver_pb.Ptt.BroadcastNotificationMessageReq,
      pttserver_pb.Ptt.BroadcastNotificationMessageRes> getBroadcastNotificationMessageMethod() {
    io.grpc.MethodDescriptor<pttserver_pb.Ptt.BroadcastNotificationMessageReq, pttserver_pb.Ptt.BroadcastNotificationMessageRes> getBroadcastNotificationMessageMethod;
    if ((getBroadcastNotificationMessageMethod = PttGRPCServiceGrpc.getBroadcastNotificationMessageMethod) == null) {
      synchronized (PttGRPCServiceGrpc.class) {
        if ((getBroadcastNotificationMessageMethod = PttGRPCServiceGrpc.getBroadcastNotificationMessageMethod) == null) {
          PttGRPCServiceGrpc.getBroadcastNotificationMessageMethod = getBroadcastNotificationMessageMethod =
              io.grpc.MethodDescriptor.<pttserver_pb.Ptt.BroadcastNotificationMessageReq, pttserver_pb.Ptt.BroadcastNotificationMessageRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BroadcastNotificationMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pttserver_pb.Ptt.BroadcastNotificationMessageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pttserver_pb.Ptt.BroadcastNotificationMessageRes.getDefaultInstance()))
              .setSchemaDescriptor(new PttGRPCServiceMethodDescriptorSupplier("BroadcastNotificationMessage"))
              .build();
        }
      }
    }
    return getBroadcastNotificationMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pttserver_pb.Ptt.PrivateNotificationMessageReq,
      pttserver_pb.Ptt.PrivateNotificationMessageRes> getPrivateNotificationMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrivateNotificationMessage",
      requestType = pttserver_pb.Ptt.PrivateNotificationMessageReq.class,
      responseType = pttserver_pb.Ptt.PrivateNotificationMessageRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pttserver_pb.Ptt.PrivateNotificationMessageReq,
      pttserver_pb.Ptt.PrivateNotificationMessageRes> getPrivateNotificationMessageMethod() {
    io.grpc.MethodDescriptor<pttserver_pb.Ptt.PrivateNotificationMessageReq, pttserver_pb.Ptt.PrivateNotificationMessageRes> getPrivateNotificationMessageMethod;
    if ((getPrivateNotificationMessageMethod = PttGRPCServiceGrpc.getPrivateNotificationMessageMethod) == null) {
      synchronized (PttGRPCServiceGrpc.class) {
        if ((getPrivateNotificationMessageMethod = PttGRPCServiceGrpc.getPrivateNotificationMessageMethod) == null) {
          PttGRPCServiceGrpc.getPrivateNotificationMessageMethod = getPrivateNotificationMessageMethod =
              io.grpc.MethodDescriptor.<pttserver_pb.Ptt.PrivateNotificationMessageReq, pttserver_pb.Ptt.PrivateNotificationMessageRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PrivateNotificationMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pttserver_pb.Ptt.PrivateNotificationMessageReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pttserver_pb.Ptt.PrivateNotificationMessageRes.getDefaultInstance()))
              .setSchemaDescriptor(new PttGRPCServiceMethodDescriptorSupplier("PrivateNotificationMessage"))
              .build();
        }
      }
    }
    return getPrivateNotificationMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pttserver_pb.Ptt.SubscribeToNotificationStreamReq,
      pttserver_pb.Ptt.SubscribeToNotificationStreamRes> getSubscribeToNotificationStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeToNotificationStream",
      requestType = pttserver_pb.Ptt.SubscribeToNotificationStreamReq.class,
      responseType = pttserver_pb.Ptt.SubscribeToNotificationStreamRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<pttserver_pb.Ptt.SubscribeToNotificationStreamReq,
      pttserver_pb.Ptt.SubscribeToNotificationStreamRes> getSubscribeToNotificationStreamMethod() {
    io.grpc.MethodDescriptor<pttserver_pb.Ptt.SubscribeToNotificationStreamReq, pttserver_pb.Ptt.SubscribeToNotificationStreamRes> getSubscribeToNotificationStreamMethod;
    if ((getSubscribeToNotificationStreamMethod = PttGRPCServiceGrpc.getSubscribeToNotificationStreamMethod) == null) {
      synchronized (PttGRPCServiceGrpc.class) {
        if ((getSubscribeToNotificationStreamMethod = PttGRPCServiceGrpc.getSubscribeToNotificationStreamMethod) == null) {
          PttGRPCServiceGrpc.getSubscribeToNotificationStreamMethod = getSubscribeToNotificationStreamMethod =
              io.grpc.MethodDescriptor.<pttserver_pb.Ptt.SubscribeToNotificationStreamReq, pttserver_pb.Ptt.SubscribeToNotificationStreamRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeToNotificationStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pttserver_pb.Ptt.SubscribeToNotificationStreamReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pttserver_pb.Ptt.SubscribeToNotificationStreamRes.getDefaultInstance()))
              .setSchemaDescriptor(new PttGRPCServiceMethodDescriptorSupplier("SubscribeToNotificationStream"))
              .build();
        }
      }
    }
    return getSubscribeToNotificationStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PttGRPCServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PttGRPCServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PttGRPCServiceStub>() {
        @java.lang.Override
        public PttGRPCServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PttGRPCServiceStub(channel, callOptions);
        }
      };
    return PttGRPCServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PttGRPCServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PttGRPCServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PttGRPCServiceBlockingStub>() {
        @java.lang.Override
        public PttGRPCServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PttGRPCServiceBlockingStub(channel, callOptions);
        }
      };
    return PttGRPCServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PttGRPCServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PttGRPCServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PttGRPCServiceFutureStub>() {
        @java.lang.Override
        public PttGRPCServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PttGRPCServiceFutureStub(channel, callOptions);
        }
      };
    return PttGRPCServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class PttGRPCServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void hello(pttserver_pb.Ptt.HelloReq request,
        io.grpc.stub.StreamObserver<pttserver_pb.Ptt.HelloRes> responseObserver) {
      asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }

    /**
     */
    public void startTalk(pttserver_pb.Ptt.StartTalkReq request,
        io.grpc.stub.StreamObserver<pttserver_pb.Ptt.StartTalkRes> responseObserver) {
      asyncUnimplementedUnaryCall(getStartTalkMethod(), responseObserver);
    }

    /**
     */
    public void endTalk(pttserver_pb.Ptt.EndTalkReq request,
        io.grpc.stub.StreamObserver<pttserver_pb.Ptt.EndTalkRes> responseObserver) {
      asyncUnimplementedUnaryCall(getEndTalkMethod(), responseObserver);
    }

    /**
     */
    public void broadcastNotificationMessage(pttserver_pb.Ptt.BroadcastNotificationMessageReq request,
        io.grpc.stub.StreamObserver<pttserver_pb.Ptt.BroadcastNotificationMessageRes> responseObserver) {
      asyncUnimplementedUnaryCall(getBroadcastNotificationMessageMethod(), responseObserver);
    }

    /**
     */
    public void privateNotificationMessage(pttserver_pb.Ptt.PrivateNotificationMessageReq request,
        io.grpc.stub.StreamObserver<pttserver_pb.Ptt.PrivateNotificationMessageRes> responseObserver) {
      asyncUnimplementedUnaryCall(getPrivateNotificationMessageMethod(), responseObserver);
    }

    /**
     */
    public void subscribeToNotificationStream(pttserver_pb.Ptt.SubscribeToNotificationStreamReq request,
        io.grpc.stub.StreamObserver<pttserver_pb.Ptt.SubscribeToNotificationStreamRes> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeToNotificationStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pttserver_pb.Ptt.HelloReq,
                pttserver_pb.Ptt.HelloRes>(
                  this, METHODID_HELLO)))
          .addMethod(
            getStartTalkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pttserver_pb.Ptt.StartTalkReq,
                pttserver_pb.Ptt.StartTalkRes>(
                  this, METHODID_START_TALK)))
          .addMethod(
            getEndTalkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pttserver_pb.Ptt.EndTalkReq,
                pttserver_pb.Ptt.EndTalkRes>(
                  this, METHODID_END_TALK)))
          .addMethod(
            getBroadcastNotificationMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pttserver_pb.Ptt.BroadcastNotificationMessageReq,
                pttserver_pb.Ptt.BroadcastNotificationMessageRes>(
                  this, METHODID_BROADCAST_NOTIFICATION_MESSAGE)))
          .addMethod(
            getPrivateNotificationMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pttserver_pb.Ptt.PrivateNotificationMessageReq,
                pttserver_pb.Ptt.PrivateNotificationMessageRes>(
                  this, METHODID_PRIVATE_NOTIFICATION_MESSAGE)))
          .addMethod(
            getSubscribeToNotificationStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                pttserver_pb.Ptt.SubscribeToNotificationStreamReq,
                pttserver_pb.Ptt.SubscribeToNotificationStreamRes>(
                  this, METHODID_SUBSCRIBE_TO_NOTIFICATION_STREAM)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class PttGRPCServiceStub extends io.grpc.stub.AbstractAsyncStub<PttGRPCServiceStub> {
    private PttGRPCServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PttGRPCServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PttGRPCServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void hello(pttserver_pb.Ptt.HelloReq request,
        io.grpc.stub.StreamObserver<pttserver_pb.Ptt.HelloRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startTalk(pttserver_pb.Ptt.StartTalkReq request,
        io.grpc.stub.StreamObserver<pttserver_pb.Ptt.StartTalkRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartTalkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void endTalk(pttserver_pb.Ptt.EndTalkReq request,
        io.grpc.stub.StreamObserver<pttserver_pb.Ptt.EndTalkRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEndTalkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void broadcastNotificationMessage(pttserver_pb.Ptt.BroadcastNotificationMessageReq request,
        io.grpc.stub.StreamObserver<pttserver_pb.Ptt.BroadcastNotificationMessageRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBroadcastNotificationMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void privateNotificationMessage(pttserver_pb.Ptt.PrivateNotificationMessageReq request,
        io.grpc.stub.StreamObserver<pttserver_pb.Ptt.PrivateNotificationMessageRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPrivateNotificationMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeToNotificationStream(pttserver_pb.Ptt.SubscribeToNotificationStreamReq request,
        io.grpc.stub.StreamObserver<pttserver_pb.Ptt.SubscribeToNotificationStreamRes> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeToNotificationStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class PttGRPCServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PttGRPCServiceBlockingStub> {
    private PttGRPCServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PttGRPCServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PttGRPCServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public pttserver_pb.Ptt.HelloRes hello(pttserver_pb.Ptt.HelloReq request) {
      return blockingUnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public pttserver_pb.Ptt.StartTalkRes startTalk(pttserver_pb.Ptt.StartTalkReq request) {
      return blockingUnaryCall(
          getChannel(), getStartTalkMethod(), getCallOptions(), request);
    }

    /**
     */
    public pttserver_pb.Ptt.EndTalkRes endTalk(pttserver_pb.Ptt.EndTalkReq request) {
      return blockingUnaryCall(
          getChannel(), getEndTalkMethod(), getCallOptions(), request);
    }

    /**
     */
    public pttserver_pb.Ptt.BroadcastNotificationMessageRes broadcastNotificationMessage(pttserver_pb.Ptt.BroadcastNotificationMessageReq request) {
      return blockingUnaryCall(
          getChannel(), getBroadcastNotificationMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public pttserver_pb.Ptt.PrivateNotificationMessageRes privateNotificationMessage(pttserver_pb.Ptt.PrivateNotificationMessageReq request) {
      return blockingUnaryCall(
          getChannel(), getPrivateNotificationMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<pttserver_pb.Ptt.SubscribeToNotificationStreamRes> subscribeToNotificationStream(
        pttserver_pb.Ptt.SubscribeToNotificationStreamReq request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeToNotificationStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class PttGRPCServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PttGRPCServiceFutureStub> {
    private PttGRPCServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PttGRPCServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PttGRPCServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<pttserver_pb.Ptt.HelloRes> hello(
        pttserver_pb.Ptt.HelloReq request) {
      return futureUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pttserver_pb.Ptt.StartTalkRes> startTalk(
        pttserver_pb.Ptt.StartTalkReq request) {
      return futureUnaryCall(
          getChannel().newCall(getStartTalkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pttserver_pb.Ptt.EndTalkRes> endTalk(
        pttserver_pb.Ptt.EndTalkReq request) {
      return futureUnaryCall(
          getChannel().newCall(getEndTalkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pttserver_pb.Ptt.BroadcastNotificationMessageRes> broadcastNotificationMessage(
        pttserver_pb.Ptt.BroadcastNotificationMessageReq request) {
      return futureUnaryCall(
          getChannel().newCall(getBroadcastNotificationMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pttserver_pb.Ptt.PrivateNotificationMessageRes> privateNotificationMessage(
        pttserver_pb.Ptt.PrivateNotificationMessageReq request) {
      return futureUnaryCall(
          getChannel().newCall(getPrivateNotificationMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;
  private static final int METHODID_START_TALK = 1;
  private static final int METHODID_END_TALK = 2;
  private static final int METHODID_BROADCAST_NOTIFICATION_MESSAGE = 3;
  private static final int METHODID_PRIVATE_NOTIFICATION_MESSAGE = 4;
  private static final int METHODID_SUBSCRIBE_TO_NOTIFICATION_STREAM = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PttGRPCServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PttGRPCServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((pttserver_pb.Ptt.HelloReq) request,
              (io.grpc.stub.StreamObserver<pttserver_pb.Ptt.HelloRes>) responseObserver);
          break;
        case METHODID_START_TALK:
          serviceImpl.startTalk((pttserver_pb.Ptt.StartTalkReq) request,
              (io.grpc.stub.StreamObserver<pttserver_pb.Ptt.StartTalkRes>) responseObserver);
          break;
        case METHODID_END_TALK:
          serviceImpl.endTalk((pttserver_pb.Ptt.EndTalkReq) request,
              (io.grpc.stub.StreamObserver<pttserver_pb.Ptt.EndTalkRes>) responseObserver);
          break;
        case METHODID_BROADCAST_NOTIFICATION_MESSAGE:
          serviceImpl.broadcastNotificationMessage((pttserver_pb.Ptt.BroadcastNotificationMessageReq) request,
              (io.grpc.stub.StreamObserver<pttserver_pb.Ptt.BroadcastNotificationMessageRes>) responseObserver);
          break;
        case METHODID_PRIVATE_NOTIFICATION_MESSAGE:
          serviceImpl.privateNotificationMessage((pttserver_pb.Ptt.PrivateNotificationMessageReq) request,
              (io.grpc.stub.StreamObserver<pttserver_pb.Ptt.PrivateNotificationMessageRes>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_TO_NOTIFICATION_STREAM:
          serviceImpl.subscribeToNotificationStream((pttserver_pb.Ptt.SubscribeToNotificationStreamReq) request,
              (io.grpc.stub.StreamObserver<pttserver_pb.Ptt.SubscribeToNotificationStreamRes>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PttGRPCServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PttGRPCServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pttserver_pb.Ptt.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PttGRPCService");
    }
  }

  private static final class PttGRPCServiceFileDescriptorSupplier
      extends PttGRPCServiceBaseDescriptorSupplier {
    PttGRPCServiceFileDescriptorSupplier() {}
  }

  private static final class PttGRPCServiceMethodDescriptorSupplier
      extends PttGRPCServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PttGRPCServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PttGRPCServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PttGRPCServiceFileDescriptorSupplier())
              .addMethod(getHelloMethod())
              .addMethod(getStartTalkMethod())
              .addMethod(getEndTalkMethod())
              .addMethod(getBroadcastNotificationMessageMethod())
              .addMethod(getPrivateNotificationMessageMethod())
              .addMethod(getSubscribeToNotificationStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
