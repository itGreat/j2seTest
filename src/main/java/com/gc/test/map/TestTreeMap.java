package com.gc.test.map;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		Map<Integer,String> needCheckTypes = new TreeMap<Integer,String>();
		needCheckTypes.put(1,"常规模式");
		needCheckTypes.put(12,"自有模式");
		//2014/8/8 新增
		needCheckTypes.put(0,"校园宽带-驻地网合作"); //同“常规模式”
		needCheckTypes.put(11,"校园宽带-常规模式"); //同“常规模式”
		
		System.out.println(needCheckTypes.get(3));
	}
}