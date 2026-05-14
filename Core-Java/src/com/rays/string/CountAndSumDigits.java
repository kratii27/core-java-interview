package com.rays.string;

import java.util.Arrays;

public class CountAndSumDigits {
	
	public static void main(String[] args) {
		
		String[] str = { "harry123" };
		String digit = "";
		int sum = 0;
		
		for (String s : str) {
			for (int i = 0; i < s.length(); i++) {
				if (Character.isDigit(s.charAt(i))) {
					digit = digit + s.charAt(i);
				}
			}
		}
		
		int[] intArr = new int[digit.length()];
		
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = Character.getNumericValue(digit.charAt(i));
			sum = sum + intArr[i];
		}
		
		System.out.println("sum of integer; " + sum);
		System.out.println("integer array; " + Arrays.toString(intArr));
		System.out.println("digit count; " + digit.length());
	}

}
