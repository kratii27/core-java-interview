package com.rays.string;

public class TestStringBuffer {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("abc");
		
		//abcd
		sb.append("d");
		System.out.println(sb);
		
		//abcxyzd
		sb.insert(2, "xyz");
		System.out.println(sb);
		
		//abcd
		sb.delete(2, 5);
		System.out.println(sb);
		
		//dcba
		sb.reverse();
		System.out.println(sb);
		
		//19
		System.out.println(sb.capacity());
	}

}
