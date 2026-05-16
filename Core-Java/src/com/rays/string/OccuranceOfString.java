package com.rays.string;

public class OccuranceOfString {
	
	public static void main(String[] args) {
		
		String str = "kriti";
		int count = 0;
		
		for (char ch ='a'; ch <= 'z'; ch++) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ch) {
					count++;
				}
			}
			if (count>0) {
				System.out.println(ch + " repeats " + count + " times");
			}
			count = 0;
		}
		
	}

}
