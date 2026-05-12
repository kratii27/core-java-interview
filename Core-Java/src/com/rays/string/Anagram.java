package com.rays.string;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String str1 = "evil";
		String str2 = "live";
		
		char[] ar1 = str1.toCharArray();
		char[] ar2 = str2.toCharArray();
		
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		if (Arrays.equals(ar1, ar2)) {
			System.out.println(str1 + " and " + str2 + " is an anagram");
		} else {
			System.out.println(str1 + " and " + str2 + " is not an anagram");
		}
		
		
	}

}
