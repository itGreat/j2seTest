package com.gc.test.string;

import java.util.Random;

public class RandomString {
	public static String getRandomString(int length) {
	    String base = "abcdefghijklmnopqrstuvwxyz0123456789";   
	    Random random = new Random();   
	    StringBuffer sb = new StringBuffer();   
	    for (int i = 0; i < length; i++) {   
	        int number = random.nextInt(base.length());   
	        sb.append(base.charAt(number));   
	    }   
	    return sb.toString();   
	 } 
	
	
	public static String getRandomModel(int length) {
	    String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";   
	    Random random = new Random();   
	    StringBuffer sb = new StringBuffer();
	    int half = length/2;
	    for (int i = 0; i < half - 1 ; i++) {   
	        int number = random.nextInt(base.length());
	        sb.append(base.charAt(number));   
	    }
	    sb.append("-");
	    for (int i = 0; i < (length - half) ; i++) {   
	        int number = random.nextInt(base.length());
	        sb.append(base.charAt(number));   
	    } 
	    return sb.toString();   
	 }
	
	public static void main(String[] args) {
		System.out.println(getRandomModel(8));
	}
}
