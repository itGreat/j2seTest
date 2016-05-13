package com.gc.test.string;

import org.apache.commons.lang3.StringUtils;

public class TestLeftPad {
	public static void main(String[] args) {
		String leftPad = StringUtils.leftPad("2", 3,"0");
		System.out.println(leftPad);
	}
}
