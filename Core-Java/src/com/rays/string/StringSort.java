package com.rays.string;

import java.util.Arrays;

public class StringSort {
	
	public static void main(String[] args) {
		
		String str = "dabc";
		char[] ch = str.toCharArray();
		String sorted = "";
		
		Arrays.sort(ch);
		
		for (char c : ch) {
			sorted = sorted + c;
		}
		
		System.out.println(sorted);
		
	}

}
