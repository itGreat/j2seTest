package com.gc.test.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentUtilDate {
	public static void main(String[] args) {
		Date date = new Date();
		DateFormat fmt = new SimpleDateFormat("yyyyMMddHHssSS");
		String format = fmt.format(date);
		System.out.println(format);
	}
}
