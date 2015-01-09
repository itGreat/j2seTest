package com.gc.test.date.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
	public static void main(String[] args) {
		String s = "2014-03-06";
		String substring = s.substring(8, s.length());
		System.out.println(substring);
		Date date = new Date();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(fmt.format(date));
		
		Date date2 = new Date(System.currentTimeMillis());
		System.out.println(fmt.format(date2));
	}
}
