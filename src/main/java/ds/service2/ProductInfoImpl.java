package ds.service2;

import io.grpc.Status;
import io.grpc.StatusException;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ProductInfoImpl extends ProductInfoGrpc.ProductInfoImplBase {
    private Map productMap = new HashMap<String, ProductInfoOuterClass.Product>();

    @Override
    public void addProduct(
        ProductInfoOuterClass.Product request,
        io.grpc.stub.StreamObserver
            <ProductInfoOuterClass.ProductID> responseObserver) {
        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        request = request.toBuilder().setEmployedId(randomUUIDString).build();
        productMap.put(randomUUIDString, request);
        ProductInfoOuterClass.ProductID Employedid =
            ProductInfoOuterClass.ProductID.newBuilder()
            .setOrderCode(randomUUIDString).build();
            responseObserver.onNext(Employedid);
        responseObserver.onCompleted();
    }

    @Override
    public void getProduct(
        ProductInfoOuterClass.ProductID request,
        io.grpc.stub.StreamObserver
            <ProductInfoOuterClass.Product> responseObserver) {
        String Employedid = request.getOrderCode();
        if (productMap.containsKey(Employedid)) {
            responseObserver.onNext(
                (ProductInfoOuterClass.Product) productMap.get(Employedid));
            responseObserver.onCompleted();
        } else {
            responseObserver.onError(new StatusException(Status.NOT_FOUND));
        }
    }
}