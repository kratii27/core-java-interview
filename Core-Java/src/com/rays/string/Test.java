package com.rays.string;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		
		String str = "Harry potter";
		for (int i = 0; i< str.length(); i++){
			char ch = str.charAt(i);
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (ch == str.charAt(j)  && str.indexOf(ch) == i){
					count++;
				}

			}
			if (count > 1){
				System.out.println(ch + " " + count);
			}

		}
	}

}
