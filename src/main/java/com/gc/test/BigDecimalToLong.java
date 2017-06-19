package com.gc.test;

import java.math.BigDecimal;

public class BigDecimalToLong {
	public static void main(String[] args) {
		BigDecimal b = new BigDecimal(3);
		Long l = Long.valueOf(b.toString());
		System.out.println(l);
	}
}
