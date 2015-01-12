package com.gc.test.date.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Test2 {
	public static void main(String[] args) {
//		String s = "2014-03-06";
//		String substring = s.substring(8, s.length());
//		System.out.println(substring);
//		Date date = new Date();
//		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		System.out.println(fmt.format(date));
//		
//		Date date2 = new Date(System.currentTimeMillis());
//		System.out.println(fmt.format(date2));
		
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		long l = System.currentTimeMillis();
		System.out.println(l);
		
		Random r = new Random();
		
		for (int i = 0; i < 10000; i++) {
			long time = (r.nextInt(Integer.MAX_VALUE)*100);
			Date d = new Date();
			d.setTime(time);
			System.out.println(fmt.format(d));
		}
	}
}
