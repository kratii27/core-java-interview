package com.rays.string;

public class CountCharFromString {
	
	public static void main(String[] args) {
		
		String str = "Harry54";
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
