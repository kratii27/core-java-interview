package com.rays.string;

import java.util.Arrays;

public class CountIntFromStringArraytoIntArray {
	
	public static void main(String[] args) {
		
		String[] str = { "Harry67P0tter" };
		
		String num = "";
		int count = 0;
		
		for (String s : str) {
			char[] ch = s.toCharArray();
	
			for (int i = 0; i < ch.length; i++) {
				if (Character.isDigit(ch[i])) {
					num = num + ch[i];
					System.out.println("index: " + i);
					count++;
				}
			}
			System.out.println("length: " + num.length());
			System.out.println("count: " + count);
			
			int[] intArray = new int[num.length()];
			
			for (int i = 0; i < num.length(); i++) {
				intArray[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
			}
			
			System.out.println(Arrays.toString(intArray));
		}
		
	}

}
