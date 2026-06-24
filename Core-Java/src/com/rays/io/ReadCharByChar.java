package com.rays.io;


import java.io.FileReader;
import java.io.IOException;

public class ReadCharByChar {

    public static void main (String[] args) throws IOException {

        FileReader reader = new FileReader("F:\\io\\hello.txt");
        int ch = reader.read();

        while (ch != -1){
            System.out.print((char) ch);
            ch = reader.read();
        }

        reader.close();

    }
}
