package com.rays.string;

import java.util.Arrays;

public class CountAlphabetsFromStringToCharArray {
	
	public static void main(String[] args) {
		
		String[] str = { "Harry54" };
		String alpha = "";
		int count = 0;
		
		for (String s : str) {
			char[] ch = s.toCharArray();
			
			for (int i = 0; i < ch.length; i++) {
				if (Character.isAlphabetic(ch[i])) {
					alpha = alpha + ch[i];
					count++;
				}
			}
		}
		
		char[] charArray = alpha.toCharArray();
		System.out.println(Arrays.toString(charArray));
		
	}

}
