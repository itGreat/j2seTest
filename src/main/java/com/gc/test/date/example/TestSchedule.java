package com.gc.test.date.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class TestSchedule {
	public static void main(String[] args) throws ParseException {
		
		String date = "2014-4";
		DateFormat fmtym = new SimpleDateFormat("yyyy-MM");
		Date _date = fmtym.parse(date);
		Set<Integer> set = new HashSet<Integer>();
		DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Calendar first = Calendar.getInstance();
		first.setTime(_date);
		first.add(Calendar.MONTH, 0);
		first.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天 
		long firstTime = first.getTimeInMillis();
		String f = fmt.format(first.getTime());
		firstTime = fmt.parse(f).getTime();
		System.out.println(firstTime);
        //获取当前月最后一天
       Calendar last = Calendar.getInstance();
       last.setTime(_date);
        last.set(Calendar.DAY_OF_MONTH, last.getActualMaximum(Calendar.DAY_OF_MONTH));
        //Calendar last2 = Calendar.getInstance().set(last.YEAR, last.MONTH, Calendar.DAY_OF_MONTH);
		long lastTime = last.getTimeInMillis();
		String f2 = fmt.format(last.getTime());
		lastTime = fmt.parse(f2).getTime();
		
		System.out.println(lastTime);
		int lastDay = last.get(Calendar.DAY_OF_MONTH);
		int lastDayPuls = lastDay + 1; 
		System.out.println("当月最后一天: " + lastDay);
        
		List<Object[]> coll = new ArrayList<Object[]>();
		coll.add(new Object[] {"2014-03-29","2014-04-05"});
		coll.add(new Object[] {"2013-11-25","2013-11-30"});
		coll.add(new Object[] {"2014-03-04","2014-03-14"});
		coll.add(new Object[] {"2014-02-27","2014-03-03"});
		//
//		coll.add(new Object[] {"2014-02-09","2014-03-31"});
//		coll.add(new Object[] {"2014-03-01","2014-04-05"});
		
		int maxEnd = 0;
		int minBegin = lastDayPuls;
		boolean notCase1 = true;
		
		//分析日程，并分类处理
		for (Object[] objects : coll) {
			String b = String.valueOf(objects[0]);
			String e = String.valueOf(objects[1]);
			Date beginDate = fmt.parse(b);
			Date endDate = fmt.parse(e);
			long beginTime = beginDate.getTime();
			long endTime = endDate.getTime();
			//排除不需要处理的情况
 			//日程结束时间小于当月 或者 日程开始时间大于当月
			Boolean caseA = (endTime < firstTime) || (beginTime > lastTime);
			if(caseA) {
				continue;
			}
			//模拟情况，假如当前时间为2014-03-19
			//情况1：日程开始时间和结束时间包括当前月  如：2014-02-01 到 2014-04-01，包括3月
			
			Boolean case1 = (beginTime < firstTime) && (endTime > lastTime);
			if(case1) {
				//生成1到最后一天
				for (int i = 1; i <= lastDay; i++) {
					set.add(i);
				}
				notCase1 = false;
				break;
			}
			//情况2：日程结束时间在该月范围内 如：2014-02-05 到 2014-03-05
			Boolean case2 = (beginTime < firstTime) && (endTime >= firstTime && endTime <= lastTime); 
			if(case2) {
				//生成1 到最大的结束日期
				int day = Integer.valueOf(e.substring(8, e.length()));
				maxEnd = day > maxEnd ? day : maxEnd;
				continue;
			}
			//情况3：日程结束时间在该月范围内 如：2014-03-25 到 2014-04-05
			Boolean case3 = (beginTime >= firstTime && beginTime <= lastTime) && (endTime > lastTime); 
			if(case3) {
				//生产最小的开始日期到该月最后一天
				int day = Integer.valueOf(b.substring(8, b.length()));
				minBegin = day < minBegin ? day : minBegin;
				continue;
			}
			//情况4：日程开始、结束时间在该月范围内 如：2014-03-11 到 2014-03-23等
			int bday = Integer.valueOf(b.substring(8, b.length()));
			int eday = Integer.valueOf(e.substring(8, e.length()));
			for (int i = bday; i <= eday; i++) {
				set.add(i);
			}
		}
		//如果不是情况1
		if(notCase1) {
			//情况2，生成day
			System.out.println("最大结束时间: " + maxEnd);
			if(0 != maxEnd) {
				for (int i = 1; i <= maxEnd; i++) {
					set.add(i);
				}
			}
			//情况3，生成day
			System.out.println("最小开始时间: " + minBegin);
			if(minBegin != lastDayPuls) {
				for (int i = minBegin; i <= lastDay; i++) {
					set.add(i);
				}
			}
		}
		System.out.println("有日程的天数:" + set.size());
		System.out.println(set);
	}
}
