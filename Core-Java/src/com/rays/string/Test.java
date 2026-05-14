package com.rays.string;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		
		String[] str = { "Harry67P0tter" };
		String num = "";
		
		for (String s : str) {
			char[] ch = s.toCharArray();
			
			for (int i = 0; i < ch.length; i++) {
				if (Character.isDigit(ch[i])) {
					num = num + ch[i];
				}
			}
			
		}
		
		int[] intArray = new int[num.length()];
		
		for (int i = 0; i < num.length(); i++) {
			intArray[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
		}
		
		System.out.println(Arrays.toString(intArray));
	}

}
