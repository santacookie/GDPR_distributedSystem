package ds.service2;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
* gRPC server for productInfo service
*/
public class ProductInfoServer {
    public static void main(String[] args)
            throws IOException, InterruptedException {
        int port = 214;    ////////server port number 
        Server server = ServerBuilder.forPort(port)
            .addService(new ProductInfoImpl())
            .build()
            .start();
        System.out.println("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("Shutting down gRPC server since JVM is " +
                "shutting down");
            if (server != null) {
                server.shutdown();
            }
            System.err.println("Server shut down");
        }));
        server.awaitTermination();
    }
}