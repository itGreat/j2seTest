package com.gc.test.string;

import org.apache.commons.lang3.StringUtils;

public class TestStringUtilsContains {
	public static void main(String[] args) {
		boolean contains = StringUtils.contains("送检入库","2送检");
		System.out.println(contains);
	}
}
