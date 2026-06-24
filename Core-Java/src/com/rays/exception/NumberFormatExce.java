package com.rays.exception;

public class NumberFormatExce {
	
    public static void main(String[] args) {
	        String s="abc12";
	        try {
				System.out.println(Integer.parseInt(s));
	        } catch (NumberFormatException e){
	            System.out.println(e);
	        }
	    }
	}
