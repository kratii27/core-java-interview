package com.rays.string;

public class ReverseSamePlace {

	public static void main(String[] args) {
		
		String str = "Ajay Pratap";
		String[] parts = str.split(" ");
		StringBuffer name = new StringBuffer();
		String reverse = "";
		
		for (String s : parts) {
			for (int i = s.length() - 1; i >= 0; i--) {
				name.append(s.charAt(i));
			}
			name.append(" ");
		}
		
		System.out.println(name);
		
		// using string buffer
		
		for (String s : parts) {
			for (int i = s.length() - 1; i >= 0; i--) {
				reverse = reverse + s.charAt(i); 
			}
			reverse = reverse + " ";
		}
		
		System.out.println("Without using String buffer "+reverse);		
		
	}

}
