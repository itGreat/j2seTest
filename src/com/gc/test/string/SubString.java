package com.gc.test.string;

/**
 * 2013-12-25,gongchang
 *
 * 实现功能：
 */
public class SubString {
	public static void main(String[] args) {
		String str = "3,xxxx";
		int i = str.indexOf(str);
		String substring = str.substring(i+1, str.length());
		System.out.println(substring);
		if("".equals(substring)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}	
