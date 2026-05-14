package com.rays.string;

public class Concat {
	
	public static void main(String[] args) {
		
		String a = "Harry ";
		String b = "Styles";
	
		System.out.println(a.concat(b));
		
		System.out.println(a);
		System.out.println(b);
		
		//Using string buffer;
		
		System.out.println("-----------------------------------");
		
		StringBuffer c = new StringBuffer("Harry ");
		c.append("Potter");
		
		System.out.println(c);
	}

}
