package com.gc.test.date.util;

import java.util.Calendar;
import java.util.Date;

public class CalendarUtil {
	
	public static Date firstMonthDay(){
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date(System.currentTimeMillis()));
		cal.add(Calendar.MONTH, 0);
		cal.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天 
		return cal.getTime();
	}
	
	public static Date beforeThirtyDay(){
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date(System.currentTimeMillis()));
		cal.add(Calendar.MONTH, -1);
		return cal.getTime();
	}

	public static void main(String[] args) {
		
		System.out.println(DateUtil.fmt(beforeThirtyDay()));
	}
}
