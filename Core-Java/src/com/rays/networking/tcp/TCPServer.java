package com.rays.networking.tcp;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        
        ServerSocket server = new ServerSocket(1235);

        System.out.println("server started waitng for client");

        Socket client = server.accept();

        System.out.println("client connected");

        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        DataOutputStream out = new DataOutputStream(client.getOutputStream());

        out.writeBytes("hello client\n");

        String line = in.readLine();
        System.out.println("received from client; " + line);

        client.close();
        server.close();
        System.out.println("server closed");

    }

}
