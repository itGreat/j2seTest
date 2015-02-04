package com.gc.test.list;

import java.util.ArrayList;
import java.util.List;

public class ForList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < 100 ; i++) {
			list.add(""+i);
//			System.out.println(list.get(i));
		}
		
		for (int i = 0,idx = 0,s = 1; i < list.size(); i+=5) {
//			System.out.println(list.get(i));
			System.out.print(s++);
			System.out.print(" : \t");
			System.out.print(idx++);
			System.out.print("\t");
			System.out.print(idx++);
			System.out.print("\t");
			System.out.print(idx++);
			System.out.print("\t");
			System.out.print(idx++);
			System.out.print("\t");
			System.out.print(idx++);
			
			System.out.println();
		}
	}
}
