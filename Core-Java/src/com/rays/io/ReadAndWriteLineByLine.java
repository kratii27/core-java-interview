package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteLineByLine {


    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new FileReader("F:\\io\\hello.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("F:\\io\\hell.txt"));

        String line = in.readLine();

        while (line != null) {
            out.write(line);
            line = in.readLine();
        }

        System.out.println("done");
        in.close();
        out.close();

    }

}
