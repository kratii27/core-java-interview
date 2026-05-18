package com.rays.string;

public class TestString {
	public static void main(String[] args) {
		
		String str = "harry";
		
		
		// 5
		System.out.println(str.length());
		
		//h
		System.out.println(str.charAt(0));
		
		//-1
		System.out.println(str.indexOf('u'));

		//3
		System.out.println(str.lastIndexOf('r'));
		
		//rry
		System.out.println(str.substring(2));
		
		//har
		System.out.println(str.substring(0, 3));
		
		//haiiy
		System.out.println(str.replace('r', 'i'));
		
		//harry potter
		System.out.println(str.concat(" potter"));
		
		//HARRY
		System.out.println(str.toUpperCase());
		
		//harry
		System.out.println(str.toLowerCase());
		
		//harry potter
		System.out.println(str.concat(" potter"));
		
		//true
		System.out.println(str.startsWith("ha"));
		
		//true
		System.out.println(str.endsWith("ry"));
		
		System.out.println(str);
	}

}
