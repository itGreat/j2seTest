package com.gc.test.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegEx {
	public static void main(String[] args) {
		String s = "03-02";
		String m = "02";
		String regEx = "^"+m+"-[0-9][0-9]$"; //表示a或F
		System.out.println(regEx);
		Pattern pat = Pattern.compile(regEx);  
		Matcher mat = pat.matcher(s);  
		boolean rs = mat.find();  

		System.out.println(rs);
	}
}
