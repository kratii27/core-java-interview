package com.rays.string;

public class CountAlphabetsFromStringArray {
	
	public static void main(String[] args) {
		
		String[] str = { "Harry67P0tter" };
		
		int count = 0;
		
		for (String s : str) {
			char[] ch = s.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if (Character.isAlphabetic(ch[i])) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		
	}

}
