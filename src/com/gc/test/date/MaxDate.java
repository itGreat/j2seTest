package com.gc.test.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MaxDate {
	public static void main(String[] args) {
		//System.g
		//long t = System.currentTimeMillis();
		String date="2099-12-12";
		  DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd"); 
		  Date d1;
		  try {
			   d1 = dateformat.parse(date);
			   System.out.println(d1);
		  } catch (ParseException e) {
			   e.printStackTrace();
		  }
	}
}
