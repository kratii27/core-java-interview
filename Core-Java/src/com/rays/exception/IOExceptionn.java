package com.rays.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionn {
	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("FileNotExixts.txt");

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}