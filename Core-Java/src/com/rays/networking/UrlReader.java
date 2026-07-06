package com.rays.networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class UrlReader {

    public static void main(String[] args) throws IOException {

        URL u = new URL("https://erp.sunilos.com/NCSA/#/Test");

        System.out.println("protocol: " + u.getProtocol());
        System.out.println("port; " + u.getPort());
        System.out.println("file; " + u.getFile());
        System.out.println("host; " + u.getHost());

        InputStream iStr = u.openStream();

        Scanner in = new Scanner(iStr);

        while (in.hasNext()) {
            System.out.println(in.nextLine());
        }

        in.close();
    }

}
