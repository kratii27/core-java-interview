package com.rays.string;

public class TestCapacity {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("krati trivedi trivedi");
		
		sb.append("trivedi trivedi k");
		
		System.out.println(sb.capacity());
		
	}
}
