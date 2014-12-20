package com.gc.test.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author gongchang
 * 描述：
 * 时间：2014年12月18日 下午5:03:18
 */
public class DateUtil {
	
	public static String fmt(Date date){
		return new SimpleDateFormat("yyyy-MM-dd").format(date);
	}
}
