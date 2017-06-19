package com.gc.test.date.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author gongchang
 * 描述：加天数，排除周末
 * 时间：2014-7-29 上午9:31:43
 */
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
	
	public static void main(String[] args) throws ParseException {
		final String dayNames[] = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		String d = "2014-07-01";
		Date date = fmt.parse(d);
		
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		System.out.println(fmt.format(calendar.getTime()) + " " +dayNames[week]);//今天的日期
		
		/*calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH)+30);//让日期加1 
		System.out.println(fmt.format(calendar.getTime()));//加1之后的日期Top 
		 */		
		for (int i = 0; i < 10; i++) {
			calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH)+1);
			int w = calendar.get(Calendar.DAY_OF_WEEK) - 1;
			if(w == 6){
				calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH)+2);
			}else if(w == 0){
				calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH)+1);
			}
		}
		
		System.out.println("加10个工作日");
		System.out.println(fmt.format(calendar.getTime()) + " " +dayNames[week]);//今天的日期
		
	}
}
