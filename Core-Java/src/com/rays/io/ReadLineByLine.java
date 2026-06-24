package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("F:\\io\\hello.txt");
        BufferedReader bf = new BufferedReader(reader);
        String line = bf.readLine();

        while (line != null){
            System.out.println(line);
            line = bf.readLine();
        }

        reader.close();
        bf.close();

    }
}
