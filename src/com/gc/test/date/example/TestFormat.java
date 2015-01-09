package com.gc.test.date.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFormat {
	
	public final static SimpleDateFormat LONG_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static void main(String[] args) {
		Date curDate = new Date(System.currentTimeMillis());
	}
}
