package ds.service3;

import io.grpc.stub.StreamObserver;

import java.util.logging.Level;
import java.util.logging.Logger;

import ds.service3.LogisticsGrpc.LogisticsImplBase;


public class GrpcServerService extends LogisticsImplBase {

    private final Logger logger = Logger.getLogger(GrpcServerService.class.getName());


    //Serverside streaming
    @Override
    public void serverStreamingLogi(Request request, StreamObserver<Response> responseObserver) {
        logger.info("Server Streaming message check : " + request.getProductName());

        // Assume it responds after processing business logic for 1 second
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }

        Response response =
                Response.newBuilder()
                        .setProcessMessage("The product name: " + request.getProductName() + "payment confirm. Thank you so much.")
                        .build();

        // Server Streaming, Then responseObserver.onNext() It can be called more than once.
        responseObserver.onNext(response);
        responseObserver.onNext(response);
        responseObserver.onNext(response);

        // Assume that the response is completed 1 second after starting the response
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }

        // Answer finish
        responseObserver.onCompleted();
    }

    //client side
    @Override
    public StreamObserver<Request> clientStreamingLogi(StreamObserver<Response> responseObserver) {
        return new StreamObserver<Request>() {
            StringBuilder sb = new StringBuilder();
            @Override
            public void onNext(Request request) {
                logger.info("Client Streaming Message check: " + request.getProductName());

                sb.append("The product name : " + request.getProductName() + "shipping soon. Thank you.")
                  .append("\n============================\n");

                // Assume it responds after processing business logic for 1 second
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
            }

            @Override
            public void onError(Throwable t) {
                logger.log(Level.SEVERE, "Client Streaming requestObserver.onError() recall");
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(Response.newBuilder().setProcessMessage(sb.toString()).build());
                // server is not Streaming so It is not possible to call 2 times about 'responseObserver.onNext()'.
                // If you call more than 2 times as below : responseObserver.onError().
//                responseObserver.onNext(HelloResponse.newBuilder().setWelcomeMessage(sb.toString()).build());

                // Assume it responds after processing business logic for 1 second
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
                responseObserver.onCompleted();
            }
        };
    }

    //bidirectional streaming
    @Override
    public StreamObserver<Request> biStreamingLogi(StreamObserver<Response> responseObserver) {
        return new StreamObserver<Request>() {
            StringBuilder sb = new StringBuilder();

            @Override
            public void onNext(Request request) {
                logger.info("The product name : " + request.getProductName() + "inquiry message.");

                sb.append("The product name : " + request.getProductName() + "inquiry message")
                  .append("\n============================\n");

                // Assume it responds after processing business logic for 1 second
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }

                responseObserver.onNext(Response.newBuilder().setProcessMessage(sb.toString()).build());
                // BiDirectional Streaming, So we can recall over 2times 'responseObserver.onNext()'.
//                responseObserver.onNext(HelloResponse.newBuilder().setWelcomeMessage(sb.toString()).build());
            }

            @Override
            public void onError(Throwable t) {
                logger.log(Level.SEVERE, "BiDirectional Streaming requestObserver.onError() recall");
            }

            @Override
            public void onCompleted() {
                // Assume that the response is completed 1 second after starting the response
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
                responseObserver.onCompleted();
            }
        };
    }
    }