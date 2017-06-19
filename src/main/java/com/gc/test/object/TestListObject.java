package com.gc.test.object;

import java.util.ArrayList;
import java.util.List;

public class TestListObject {
	public static void main(String[] args) {
		List<String> objs = new ArrayList<String>();
		objs.add("张三");
		objs.add("李四");
		objs.add("王五");
		objs.add("小六");
		
		System.out.println(objs.toString());
		//输出结果： [张三, 李四, 王五, 小六]
	}
}	
