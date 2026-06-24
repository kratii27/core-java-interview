package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestBinary {

	public static void main(String[] args) throws Exception {

		FileInputStream in = new FileInputStream("F:\\io\\doraemon.png");

		FileOutputStream out = new FileOutputStream("F:\\io\\doraemonNew.png");

		int ch = in.read();

		while (ch != -1) {
			out.write(ch);
			ch = in.read();
		}
		in.close();
		out.close();
	}
}