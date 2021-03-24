package blog.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class BlogClient {

    public static void main(String[] args) {
        System.out.println("Hello I'm a gRPC client for Blog");

        BlogClient main = new BlogClient();
        main.run();
    }

    private void run() {

    }
}
