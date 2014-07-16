package com.gc.test.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class AddDay {
	
/*	@Test
	public void addDays(){
		System.out.println("sssssss");
		Calendar calendar=Calendar.getInstance();  
		calendar.setTime(new Date());
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//今天的日期
		calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH)+1);//让日期加1  
		System.out.println(calendar.get(Calendar.DATE));//加1之后的日期Top 
	}*/
	
	public static void main(String[] args) {
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar=Calendar.getInstance();  
		calendar.setTime(new Date());
		System.out.println(fmt.format(calendar.getTime()));//今天的日期
		calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH)+30);//让日期加1 
		System.out.println(fmt.format(calendar.getTime()));//加1之后的日期Top 
	}
}
