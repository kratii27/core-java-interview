package com.rays.string;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String name = "anna";
		String reverse = "";
		
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		
		System.out.println(reverse.toString());
		
		if (name.equals(reverse.toString())) {
			System.out.println("it is palindrome string");
		} else {
			System.out.println("it is not palindrome string");
		}
	}

}
