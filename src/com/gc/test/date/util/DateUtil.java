package com.gc.test.date.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author gongchang
 * 描述：
 * 时间：2014年12月18日 下午5:03:18
 */
public class DateUtil {
	
	private static DateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");
	
	/**
	 * @author gongchang
	 * 功能：获得 yyyy-MM-dd 格式日期
	 * 时间：2015年1月9日 下午4:24:17
	 */
	public static String fmt(Date date){
		return ymd.format(date);
	}
}
