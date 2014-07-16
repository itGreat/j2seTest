package com.gc.test.string;

/**
 * 2013-11-23,gongchang
 * 将字符串中正斜杠/  转换为反斜杠
 * 实现功能：
 */
public class ReplaceSprit {
	public static void main(String[] args) {
		replaceSprit();
	}

	private static void replaceSprit() {
		String str = " ";
		System.out.println(str.replace('/','\\'));
		
		String str2 = "content\\govern\\jop\\select_date.jsp";
		System.out.println(str2.replace('\\','.'));
	}
}
