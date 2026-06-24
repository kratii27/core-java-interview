package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyValidEmails {

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new FileReader("F:\\io\\emails.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("F:\\io\\validEmails.txt"));

		String emailReg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+" + "(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		String line = in.readLine();

		while (line != null) {
			if (line.matches(emailReg)) {
				out.println(line);
			}
			line = in.readLine();
		}
		System.out.println("done");

		in.close();
		out.close();
    }

}
