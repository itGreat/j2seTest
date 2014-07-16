package com.gc.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;

public class GcDateUtil extends StringUtils{
	/**
	 * 2014-3-2,gongchang
	 * 功能： 拼接时间html元素
	 * 逻辑描述： 
	 * 参数：无
	 * 返回结果：无
	 */
	public String getBookDateInfo(Date date) {
		String f = "yyyy-MM-dd-HH";
	    java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(f);
	    date = null == date ? new Date(System.currentTimeMillis()) : date;
        String dateString = formatter.format(date);
        String[] fields = dateString.split("-");
        StringBuffer buf = new StringBuffer();
        int y = Integer.valueOf(fields[0]);
        int m = Integer.valueOf(fields[1]);
        int d = Integer.valueOf(fields[2]);
        int h = Integer.valueOf(fields[3]);
        //拼接年
        buf.append("<select name='bookDates'>");
        buf.append("<option>"+ y +"</option>");
        buf.append("<option>"+(y+1)+"</option>");
        buf.append("</select>年");
        //拼接月
        buf.append("<select name='bookDates'>");
        for (int i = 1; i <= 12; i++) {
        	if(i == m) {
        		buf.append("<option value='"+i+"' selected='selected'>"+i+"</option>");
        	}else {
        		buf.append("<option value='"+i+"'>"+i+"</option>");
        	}
		}
        buf.append("</select>月");
        //拼接日
        buf.append("<select name='bookDates'>");
        for (int i = 1; i <= 31; i++) {
        	if(i == d) {
        		buf.append("<option value='"+i+"' selected='selected'>"+i+"</option>");
        	}else {
        		buf.append("<option value='"+i+"'>"+i+"</option>");
        	}
		}
        buf.append("</select>日");
        //拼接小时
        buf.append("<select name='bookDates'>");
        for (int i = 0; i <= 23; i++) {
        	if(i == h) {
        		buf.append("<option value='"+i+"' selected='selected'>"+i+"</option>");
        	}else {
        		buf.append("<option value='"+i+"'>"+i+"</option>");
        	}
		}
        buf.append("</select>时");
		return buf.toString();
	}

	public Date parseBookDate(String[] values) throws ParseException{
		Date date = null;
		//解析提交预定安装时间
		if(null !=values && values.length > 0) {
			DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd-HH");
			date = fmt.parse(StringUtils.join(values, "-"));
		}else{
			date = new Date();
		}
		return date;
	}

}
