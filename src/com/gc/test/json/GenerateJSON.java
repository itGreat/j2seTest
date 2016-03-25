package com.gc.test.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.alibaba.fastjson.JSONArray;

public class GenerateJSON {

	public static String generate(String[] columns,Integer num){
		num = null == num ? 5 : num;
		Random r = new Random();
		List<Object> list = new ArrayList<Object>();
		for (int i = 0; i < num; i++) {
 
			Map<String, Object> map = new HashMap<String, Object>();
			for (String key : columns) {
				map.put(key, r.nextInt(1000));
			}
			list.add(map);
		}
		
		return JSONArray.toJSONString(list);
	}
	
	public static void main(String[] args) {
		System.out.println( generate(new String[]{"inspDevice","inspNum","bugNum","mainBug","bugRate","mainBugRate","sampleName","selfNum","entrustNum","total"},6) );
	}
	
}
