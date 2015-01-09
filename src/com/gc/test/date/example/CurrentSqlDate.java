package com.gc.test.date.example;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class CurrentSqlDate {
	public static void main(String[] args) {
		Date date2 = new Date(System.currentTimeMillis());
		System.out.println(date2);
		//java.util.Date d = (java.util.Date)date2;
		//SimpleDateFormat fmt =new SimpleDateFormat("yyyy-MM-dd HH:mm");
		//System.out.println(fmt.format(d));
		//java.util.Date date = new java.util.Date(System.currentTimeMillis());
		
		//System.out.println(new Date(date.getTime()));
	}
}
