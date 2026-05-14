package com.rays.string;

public class CountAFromString {
	
	public static void main(String[] args) {
		
		String str = "Ananya";
		int count = 0;
		
		
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
//				count++;
//			}
//		}
		
		str = str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
		
	}

}
