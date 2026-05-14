package com.rays.string;

public class PrintCharacterThatAreNotInString {
	
	public static void main(String[] args) {
		
		String str = "harry potter";
		String s = "";
		
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (str.indexOf(ch) == -1) {
				System.out.print(ch);
			}
		}
    }
}
