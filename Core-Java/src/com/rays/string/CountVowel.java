package com.rays.string;

public class CountVowel {
	public static void main(String[] args) {

		String str = "harry potter";
		int vowelCount = 0;
		int vowelCount2 = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			}
		}
		System.out.println(vowelCount);
		
		// using char array
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (str.charAt(i) == vowels[j]) {
					vowelCount2++;
				}
			}
		}
		System.out.println(vowelCount2);
	}

}
