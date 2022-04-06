package ds.service2;

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
    comments = "Source: product_info.proto")
public final class ProductInfoGrpc {

  private ProductInfoGrpc() {}

  public static final String SERVICE_NAME = "ds.service2.ProductInfo";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.service2.ProductInfoOuterClass.Product,
      ds.service2.ProductInfoOuterClass.ProductID> getAddProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addProduct",
      requestType = ds.service2.ProductInfoOuterClass.Product.class,
      responseType = ds.service2.ProductInfoOuterClass.ProductID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.service2.ProductInfoOuterClass.Product,
      ds.service2.ProductInfoOuterClass.ProductID> getAddProductMethod() {
    io.grpc.MethodDescriptor<ds.service2.ProductInfoOuterClass.Product, ds.service2.ProductInfoOuterClass.ProductID> getAddProductMethod;
    if ((getAddProductMethod = ProductInfoGrpc.getAddProductMethod) == null) {
      synchronized (ProductInfoGrpc.class) {
        if ((getAddProductMethod = ProductInfoGrpc.getAddProductMethod) == null) {
          ProductInfoGrpc.getAddProductMethod = getAddProductMethod = 
              io.grpc.MethodDescriptor.<ds.service2.ProductInfoOuterClass.Product, ds.service2.ProductInfoOuterClass.ProductID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ds.service2.ProductInfo", "addProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.ProductInfoOuterClass.Product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.ProductInfoOuterClass.ProductID.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductInfoMethodDescriptorSupplier("addProduct"))
                  .build();
          }
        }
     }
     return getAddProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service2.ProductInfoOuterClass.ProductID,
      ds.service2.ProductInfoOuterClass.Product> getGetProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProduct",
      requestType = ds.service2.ProductInfoOuterClass.ProductID.class,
      responseType = ds.service2.ProductInfoOuterClass.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.service2.ProductInfoOuterClass.ProductID,
      ds.service2.ProductInfoOuterClass.Product> getGetProductMethod() {
    io.grpc.MethodDescriptor<ds.service2.ProductInfoOuterClass.ProductID, ds.service2.ProductInfoOuterClass.Product> getGetProductMethod;
    if ((getGetProductMethod = ProductInfoGrpc.getGetProductMethod) == null) {
      synchronized (ProductInfoGrpc.class) {
        if ((getGetProductMethod = ProductInfoGrpc.getGetProductMethod) == null) {
          ProductInfoGrpc.getGetProductMethod = getGetProductMethod = 
              io.grpc.MethodDescriptor.<ds.service2.ProductInfoOuterClass.ProductID, ds.service2.ProductInfoOuterClass.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ds.service2.ProductInfo", "getProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.ProductInfoOuterClass.ProductID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.ProductInfoOuterClass.Product.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductInfoMethodDescriptorSupplier("getProduct"))
                  .build();
          }
        }
     }
     return getGetProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductInfoStub newStub(io.grpc.Channel channel) {
    return new ProductInfoStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductInfoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProductInfoBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductInfoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProductInfoFutureStub(channel);
  }

  /**
   */
  public static abstract class ProductInfoImplBase implements io.grpc.BindableService {

    /**
     */
    public void addProduct(ds.service2.ProductInfoOuterClass.Product request,
        io.grpc.stub.StreamObserver<ds.service2.ProductInfoOuterClass.ProductID> responseObserver) {
      asyncUnimplementedUnaryCall(getAddProductMethod(), responseObserver);
    }

    /**
     */
    public void getProduct(ds.service2.ProductInfoOuterClass.ProductID request,
        io.grpc.stub.StreamObserver<ds.service2.ProductInfoOuterClass.Product> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProductMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.service2.ProductInfoOuterClass.Product,
                ds.service2.ProductInfoOuterClass.ProductID>(
                  this, METHODID_ADD_PRODUCT)))
          .addMethod(
            getGetProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.service2.ProductInfoOuterClass.ProductID,
                ds.service2.ProductInfoOuterClass.Product>(
                  this, METHODID_GET_PRODUCT)))
          .build();
    }
  }

  /**
   */
  public static final class ProductInfoStub extends io.grpc.stub.AbstractStub<ProductInfoStub> {
    private ProductInfoStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductInfoStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductInfoStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductInfoStub(channel, callOptions);
    }

    /**
     */
    public void addProduct(ds.service2.ProductInfoOuterClass.Product request,
        io.grpc.stub.StreamObserver<ds.service2.ProductInfoOuterClass.ProductID> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProduct(ds.service2.ProductInfoOuterClass.ProductID request,
        io.grpc.stub.StreamObserver<ds.service2.ProductInfoOuterClass.Product> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductInfoBlockingStub extends io.grpc.stub.AbstractStub<ProductInfoBlockingStub> {
    private ProductInfoBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductInfoBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductInfoBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductInfoBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.service2.ProductInfoOuterClass.ProductID addProduct(ds.service2.ProductInfoOuterClass.Product request) {
      return blockingUnaryCall(
          getChannel(), getAddProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public ds.service2.ProductInfoOuterClass.Product getProduct(ds.service2.ProductInfoOuterClass.ProductID request) {
      return blockingUnaryCall(
          getChannel(), getGetProductMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductInfoFutureStub extends io.grpc.stub.AbstractStub<ProductInfoFutureStub> {
    private ProductInfoFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductInfoFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductInfoFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductInfoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.service2.ProductInfoOuterClass.ProductID> addProduct(
        ds.service2.ProductInfoOuterClass.Product request) {
      return futureUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.service2.ProductInfoOuterClass.Product> getProduct(
        ds.service2.ProductInfoOuterClass.ProductID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_PRODUCT = 0;
  private static final int METHODID_GET_PRODUCT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductInfoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductInfoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_PRODUCT:
          serviceImpl.addProduct((ds.service2.ProductInfoOuterClass.Product) request,
              (io.grpc.stub.StreamObserver<ds.service2.ProductInfoOuterClass.ProductID>) responseObserver);
          break;
        case METHODID_GET_PRODUCT:
          serviceImpl.getProduct((ds.service2.ProductInfoOuterClass.ProductID) request,
              (io.grpc.stub.StreamObserver<ds.service2.ProductInfoOuterClass.Product>) responseObserver);
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

  private static abstract class ProductInfoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductInfoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.service2.ProductInfoOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductInfo");
    }
  }

  private static final class ProductInfoFileDescriptorSupplier
      extends ProductInfoBaseDescriptorSupplier {
    ProductInfoFileDescriptorSupplier() {}
  }

  private static final class ProductInfoMethodDescriptorSupplier
      extends ProductInfoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductInfoMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductInfoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductInfoFileDescriptorSupplier())
              .addMethod(getAddProductMethod())
              .addMethod(getGetProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
