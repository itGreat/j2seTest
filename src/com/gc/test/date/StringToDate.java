package com.gc.test.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
	public static void main(String argsp[]) throws Exception {
		String time = "2010-11-20 11:10:10";

		Date date = null;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		date = formatter.parse(time);
		System.out.println(date);
	}
}