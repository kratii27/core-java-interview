package com.rays.string;

public class CountNumOfIntFromString {
	
	public static void main(String[] args) {
		
		String name = "herm0in3";
		int count = 0;
		
		for (int i = 0; i < name.length(); i++) {
			if (Character.isDigit(name.charAt(i))) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
