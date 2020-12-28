package com.example.main;

import com.example.main.services.UserService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GRPCServer {

    public static void main(String[] args) throws IOException {

        Server server = ServerBuilder.forPort(9090)
                .addService(new UserService())
                .build();

        server.start();

        System.out.println("Server start at " + server.getPort());
    }

}
