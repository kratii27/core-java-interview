package com.rays.io;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadByScanner {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("F:\\io\\hello.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
        file.close();
        sc.close();

    }
}
