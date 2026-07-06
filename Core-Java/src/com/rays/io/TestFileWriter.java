package com.rays.io;

import java.io.FileWriter;
import java.io.PrintWriter;

public class TestFileWriter {

    public static void main(String[] args) throws Exception {
		
		FileWriter out = new FileWriter("F:\\io\\fileWriter.txt");
		// PrintWriter out = new PrintWriter(new FileWriter("F:\\io\\fileWriter.txt"));
		
		out.write("hello\n");
		out.write("how are you?");
		// out.println("hi");
		// out.println("lmao");
		
		out.close();
	}

}
