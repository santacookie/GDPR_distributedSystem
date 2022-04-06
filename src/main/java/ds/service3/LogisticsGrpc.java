package ds.service3;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: logistic.proto")
public final class LogisticsGrpc {

  private LogisticsGrpc() {}

  public static final String SERVICE_NAME = "ds.service3.Logistics";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.service3.Request,
      ds.service3.Response> getServerStreamingLogiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "serverStreamingLogi",
      requestType = ds.service3.Request.class,
      responseType = ds.service3.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service3.Request,
      ds.service3.Response> getServerStreamingLogiMethod() {
    io.grpc.MethodDescriptor<ds.service3.Request, ds.service3.Response> getServerStreamingLogiMethod;
    if ((getServerStreamingLogiMethod = LogisticsGrpc.getServerStreamingLogiMethod) == null) {
      synchronized (LogisticsGrpc.class) {
        if ((getServerStreamingLogiMethod = LogisticsGrpc.getServerStreamingLogiMethod) == null) {
          LogisticsGrpc.getServerStreamingLogiMethod = getServerStreamingLogiMethod = 
              io.grpc.MethodDescriptor.<ds.service3.Request, ds.service3.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ds.service3.Logistics", "serverStreamingLogi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new LogisticsMethodDescriptorSupplier("serverStreamingLogi"))
                  .build();
          }
        }
     }
     return getServerStreamingLogiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service3.Request,
      ds.service3.Response> getClientStreamingLogiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clientStreamingLogi",
      requestType = ds.service3.Request.class,
      responseType = ds.service3.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service3.Request,
      ds.service3.Response> getClientStreamingLogiMethod() {
    io.grpc.MethodDescriptor<ds.service3.Request, ds.service3.Response> getClientStreamingLogiMethod;
    if ((getClientStreamingLogiMethod = LogisticsGrpc.getClientStreamingLogiMethod) == null) {
      synchronized (LogisticsGrpc.class) {
        if ((getClientStreamingLogiMethod = LogisticsGrpc.getClientStreamingLogiMethod) == null) {
          LogisticsGrpc.getClientStreamingLogiMethod = getClientStreamingLogiMethod = 
              io.grpc.MethodDescriptor.<ds.service3.Request, ds.service3.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ds.service3.Logistics", "clientStreamingLogi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new LogisticsMethodDescriptorSupplier("clientStreamingLogi"))
                  .build();
          }
        }
     }
     return getClientStreamingLogiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service3.Request,
      ds.service3.Response> getBiStreamingLogiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "biStreamingLogi",
      requestType = ds.service3.Request.class,
      responseType = ds.service3.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service3.Request,
      ds.service3.Response> getBiStreamingLogiMethod() {
    io.grpc.MethodDescriptor<ds.service3.Request, ds.service3.Response> getBiStreamingLogiMethod;
    if ((getBiStreamingLogiMethod = LogisticsGrpc.getBiStreamingLogiMethod) == null) {
      synchronized (LogisticsGrpc.class) {
        if ((getBiStreamingLogiMethod = LogisticsGrpc.getBiStreamingLogiMethod) == null) {
          LogisticsGrpc.getBiStreamingLogiMethod = getBiStreamingLogiMethod = 
              io.grpc.MethodDescriptor.<ds.service3.Request, ds.service3.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ds.service3.Logistics", "biStreamingLogi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new LogisticsMethodDescriptorSupplier("biStreamingLogi"))
                  .build();
          }
        }
     }
     return getBiStreamingLogiMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogisticsStub newStub(io.grpc.Channel channel) {
    return new LogisticsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogisticsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LogisticsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogisticsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LogisticsFutureStub(channel);
  }

  /**
   */
  public static abstract class LogisticsImplBase implements io.grpc.BindableService {

    /**
     */
    public void serverStreamingLogi(ds.service3.Request request,
        io.grpc.stub.StreamObserver<ds.service3.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getServerStreamingLogiMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.service3.Request> clientStreamingLogi(
        io.grpc.stub.StreamObserver<ds.service3.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getClientStreamingLogiMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.service3.Request> biStreamingLogi(
        io.grpc.stub.StreamObserver<ds.service3.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getBiStreamingLogiMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getServerStreamingLogiMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.service3.Request,
                ds.service3.Response>(
                  this, METHODID_SERVER_STREAMING_LOGI)))
          .addMethod(
            getClientStreamingLogiMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ds.service3.Request,
                ds.service3.Response>(
                  this, METHODID_CLIENT_STREAMING_LOGI)))
          .addMethod(
            getBiStreamingLogiMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.service3.Request,
                ds.service3.Response>(
                  this, METHODID_BI_STREAMING_LOGI)))
          .build();
    }
  }

  /**
   */
  public static final class LogisticsStub extends io.grpc.stub.AbstractStub<LogisticsStub> {
    private LogisticsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LogisticsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogisticsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LogisticsStub(channel, callOptions);
    }

    /**
     */
    public void serverStreamingLogi(ds.service3.Request request,
        io.grpc.stub.StreamObserver<ds.service3.Response> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getServerStreamingLogiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.service3.Request> clientStreamingLogi(
        io.grpc.stub.StreamObserver<ds.service3.Response> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getClientStreamingLogiMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.service3.Request> biStreamingLogi(
        io.grpc.stub.StreamObserver<ds.service3.Response> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBiStreamingLogiMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class LogisticsBlockingStub extends io.grpc.stub.AbstractStub<LogisticsBlockingStub> {
    private LogisticsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LogisticsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogisticsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LogisticsBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<ds.service3.Response> serverStreamingLogi(
        ds.service3.Request request) {
      return blockingServerStreamingCall(
          getChannel(), getServerStreamingLogiMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LogisticsFutureStub extends io.grpc.stub.AbstractStub<LogisticsFutureStub> {
    private LogisticsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LogisticsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogisticsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LogisticsFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SERVER_STREAMING_LOGI = 0;
  private static final int METHODID_CLIENT_STREAMING_LOGI = 1;
  private static final int METHODID_BI_STREAMING_LOGI = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LogisticsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LogisticsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SERVER_STREAMING_LOGI:
          serviceImpl.serverStreamingLogi((ds.service3.Request) request,
              (io.grpc.stub.StreamObserver<ds.service3.Response>) responseObserver);
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
        case METHODID_CLIENT_STREAMING_LOGI:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientStreamingLogi(
              (io.grpc.stub.StreamObserver<ds.service3.Response>) responseObserver);
        case METHODID_BI_STREAMING_LOGI:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.biStreamingLogi(
              (io.grpc.stub.StreamObserver<ds.service3.Response>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LogisticsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogisticsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.service3.GrpcProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Logistics");
    }
  }

  private static final class LogisticsFileDescriptorSupplier
      extends LogisticsBaseDescriptorSupplier {
    LogisticsFileDescriptorSupplier() {}
  }

  private static final class LogisticsMethodDescriptorSupplier
      extends LogisticsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LogisticsMethodDescriptorSupplier(String methodName) {
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
      synchronized (LogisticsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogisticsFileDescriptorSupplier())
              .addMethod(getServerStreamingLogiMethod())
              .addMethod(getClientStreamingLogiMethod())
              .addMethod(getBiStreamingLogiMethod())
              .build();
        }
      }
    }
    return result;
  }
}
