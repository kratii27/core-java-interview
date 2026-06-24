package com.rays.io;

import java.io.*;

public class FileMerger {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("F:\\io\\pw.txt");

        for (int i = 1; i <=3; i++){
            FileReader reader = new FileReader("F:\\io\\file" + i + ".txt");
            BufferedReader bf = new BufferedReader(reader);

            String line = bf.readLine();

            while (line != null){
                pw.println(line);
                line = bf.readLine();
            }
            reader.close();
            bf.close();
        }
        pw.close();
        System.out.println("check folder");
    }
}
