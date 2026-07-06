package com.rays.networking.tcp;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

    public static void main(String[] args) throws UnknownHostException, IOException {

        Socket client = new Socket("localhost", 1235);

        System.out.println("connected to server");

        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        DataOutputStream out = new DataOutputStream(client.getOutputStream());

        out.writeBytes("Hello Server");

        String greeting = in.readLine();
        System.out.println("Received from server: " + greeting);

        client.close();
        System.out.println("Client closed.");

    }

}
