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
		System.out.println( generate(new String[]{"deviceUse","selfNum","outNum","totalNum","selfCompleteRate","outCompleteRate"},3) );
		
		/*for (int i = 1; i <= 12; i++) {
//			System.out.println("{field: 'month"+i+"', title: '"+i+"月', width: 100,sortable: true,align:'center' },");
//			System.out.print("\"month"+i+"\",");
		}*/
		
	}
	
}
