package com.rays.string;

public class StringArrayToIntArray {
	
	public static void main(String[] args) {
		
		String[] strinAr = { "k56sfd", "jsg52k" };
		
		String integers = "";
		
		for (String string : strinAr) {
			for (int i = 0; i < string.length(); i++) {
				if (Character.isDigit(string.charAt(i))) {
					integers = integers + Integer.parseInt(String.valueOf(string.charAt(i)));
				}
			}
		}
		
		char[] ch = integers.toCharArray();
		int[] intAr = new int[ch.length];
		
		for (int i = 0; i < intAr.length; i++) {
			intAr[i] = Integer.parseInt(String.valueOf(ch[i]));
			
			System.out.print(intAr[i]);
		}
	}

}
