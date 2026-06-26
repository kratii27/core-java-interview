package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class SplitAndWrite {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader("F://io/3lines.txt"));

		int count = 1;
		int noLines = 2;

		String line = br.readLine();

		while (line != null) {
			String output = "F://io/file" + count + ".txt";
			BufferedWriter bw = new BufferedWriter(new FileWriter(output));

			for (int i = 0; i < noLines && line != null; i++) {
				bw.write(line);
				line = br.readLine();
				bw.newLine();
			}

			bw.close();
			System.out.println("file written successfully: " + count);
			count++;
		}

		br.close();
	}

}
