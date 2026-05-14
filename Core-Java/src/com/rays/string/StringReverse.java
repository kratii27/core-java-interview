package com.rays.string;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String str = "abc";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			String newString = String.valueOf(ch);
			System.out.print(newString);
		}
		
	}

}
