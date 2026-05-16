package com.rays.string;

public class AlternateUpperLowerCase {
	
	public static void main(String[] args) {
		
		String str = "i hate everyone";
		
		for (int i = 0; i < str.length(); i++) {
			String ss = "";
			if (i % 2 == 0) {
				ss = String.valueOf(str.charAt(i));
				System.out.print(ss.toUpperCase());
			} else {
				ss = String.valueOf(str.charAt(i));
				System.out.print(ss.toLowerCase());
			}
		}
		
	}

}
 