package ds.service3;

import io.grpc.BindableService;
import io.grpc.Server;

import java.io.IOException;

public class GrpcServerRunner {

    public static void main(String[] args) throws IOException, InterruptedException {

        final int port = 414;
        final BindableService Service = new GrpcServerService();

        GrpcServer server = new GrpcServer(port, Service);

        server.start();

        Runtime.getRuntime().addShutdownHook(
                new Thread(() -> server.shutdown())
        );
    }
}