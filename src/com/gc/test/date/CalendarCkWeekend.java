package com.gc.test.date;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.DateFormat;

public class CalendarCkWeekend {

	public static void main(String args[]) {
		Date date = new Date();
		String dateStr = "";
		String weekStr = "";
		Calendar calendar = Calendar.getInstance();
		int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		switch (week) {
		case 0:
			weekStr = "星期日";
			break;
		case 1:
			weekStr = "星期一";
			break;
		case 2:
			weekStr = "星期二";
			break;
		case 3:
			weekStr = "星期三";
			break;
		case 4:
			weekStr = "星期四";
			break;
		case 5:
			weekStr = "星期五";
			break;
		case 6:
			weekStr = "星期六";
			break;
		}
		Date dateBegin = new Date();
		Date dateEnd = new Date();
		DateFormat shortDateFormat = DateFormat.getDateInstance(0);
		dateStr = shortDateFormat.format(date);
		dateBegin.setTime(date.getTime() - (long) (week) * 24 * 60 * 60 * 1000);
		String dateBeginStr = shortDateFormat.format(dateBegin);
		dateEnd.setTime(date.getTime() + (long) (7 - week - 1) * 24 * 60 * 60
				* 1000);
		String dateEndStr = shortDateFormat.format(dateEnd);
		System.out.println("今天是当年的第" + calendar.get(Calendar.WEEK_OF_YEAR)
				+ "周");
		System.out.println("今天是当月的"
				+ calendar.get(calendar.DAY_OF_WEEK_IN_MONTH) + "周");
		System.out.println("今天是" + weekStr);
		System.out.println("本周的开始时间是" + dateBeginStr);
		System.out.println("本周的结束时间是" + dateEndStr);
		calendar.set(Calendar.DAY_OF_WEEK, 1);
		System.out.println("本周的开始时间是" + (calendar.get(Calendar.MONTH) + 1)
				+ "月" + calendar.get(Calendar.DATE) + "日");
		calendar.set(Calendar.DAY_OF_WEEK, 7);
		System.out.println("本周的开始结束时间是" + (calendar.get(Calendar.MONTH) + 1)
				+ "月" + calendar.get(Calendar.DATE) + "日");
	}
}