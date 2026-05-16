package com.rays.string;

public class CountOccuranceOfStringArray {
	
	public static void main(String[] args) {
		
		String[] str = { "harry", "potter" };
		
		for (char ch = 'a'; ch <= 'z'; ch++) {
			int count = 0;
			for (String s : str) {
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(i) == ch) {
						count++;
					}
				}
			}
			if (count>0) {
				System.out.println(ch + " repeats " + count + "times");
			}
		}
		
	}

}
