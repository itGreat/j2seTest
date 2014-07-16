package com.gc.test.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCompare {
	public static void main(String[] args) throws ParseException {
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		String b = "2011-08-27";
		String e = "2014-04-03";
		
		Date beginDate = fmt.parse(b);
		Date endDate = fmt.parse(e);
		
		System.out.println(beginDate.compareTo(endDate));
		System.out.println(beginDate.getTime() > endDate.getTime());
	}
}
