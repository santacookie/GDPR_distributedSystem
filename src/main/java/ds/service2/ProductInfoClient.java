package ds.service2;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.logging.Logger;

/**
* gRPC client for productInfo service
*/
public class ProductInfoClient {
    public static void main(String[] args) throws InterruptedException {
    ManagedChannel channel = ManagedChannelBuilder
        .forAddress("localhost", 214) /////Server port number
        .usePlaintext()
        .build();

    ProductInfoGrpc.ProductInfoBlockingStub stub =
        ProductInfoGrpc.newBlockingStub(channel);

    ProductInfoOuterClass.ProductID productID = stub.addProduct(
        ProductInfoOuterClass.Product.newBuilder()
        .setName("NoteFile")
        .setDescription("for March workshop")
        .setQuantity("3")
        .build());
    System.out.println(productID.getOrderCode());

    ProductInfoOuterClass.Product product = stub.getProduct(productID);
    System.out.println(product.toString());
    channel.shutdown();
    }
}