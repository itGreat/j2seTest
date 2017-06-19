package com.gc.test.date.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
	public static void main(String[] args) {
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Calendar first = Calendar.getInstance();
		first.set(Calendar.DATE, 1);
		//first.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天 
		Date time = first.getTime();
		String format = fmt.format(time);
		System.out.println(format);
		
		
		Date date=new Date();//取时间
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(calendar.DATE,1);//把日期往后增加一天.整数往后推,负数往前移动
        date=calendar.getTime(); //这个时间就是日期往后推一天的结果        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(date);
          
        System.out.println(dateString);
        
        
        System.out.println(null == null ? 3 : 23);
	}
}
