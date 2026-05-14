package com.rays.string;

public class CountIntFromString {
	
	public static void main(String[] args) {
		
		String str = "Summer786";
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
		
	}

}
