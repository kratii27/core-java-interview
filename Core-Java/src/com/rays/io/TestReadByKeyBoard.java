package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestReadByKeyBoard {

    public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		FileWriter out = new FileWriter("F:\\io\\keyboard.txt", true);

		System.out.println("enter: ");

		String line = in.readLine();
		while (!(line.equals("bye"))) {
			out.write(line);
			line = in.readLine();
		}

		in.close();
		out.close();

	}


}
