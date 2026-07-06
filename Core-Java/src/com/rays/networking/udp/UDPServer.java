package com.rays.networking.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {

    public static void main(String[] args) throws IOException {
        
        DatagramSocket server = new DatagramSocket(1235);

        System.out.println("server is up and waiting for client");

        byte[] bt = new byte[256];

        DatagramPacket packet = new DatagramPacket(bt, bt.length);

        server.receive(packet);

        String received = new String(packet.getData(), 0, packet.getLength());

        System.out.println("received: " + received);

        String response = "hi server";

        bt = received.getBytes();

        packet = new DatagramPacket(bt, bt.length, packet.getAddress(), packet.getPort());

        server.send(packet);
        server.close();
        System.out.println("server closed");
    }

}
