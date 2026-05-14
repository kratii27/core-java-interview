package com.rays.string;

public class CountSpaceFromString {
	
	public static void main(String[] args) {
		
		String str = "harry potter draco malfoy";
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				System.out.println("space at index of  : "+i);
				count++;
			}
		}
	
		System.out.println("Number of space in  string " + count);
	}

}