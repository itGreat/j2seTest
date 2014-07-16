package com.gc.test.string;

public class TestIndexOf {
	public static void main(String[] args) {
		String string = "select * from Order t order by t.state,t.createDate desc";
		int indexOf = string.indexOf("order by");
		System.out.println(indexOf);
		
		String substring = string.substring(indexOf, string.length());
		System.out.println("substring : " + substring);
		
		String replace = string.replace(substring, "order by t.compactNum desc");
		System.out.println("replace : " + replace);
	}
}
