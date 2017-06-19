package com.gc.test.string;

import java.util.HashSet;
import java.util.Set;

public class FormKeyStr {
	
	private static void column(int num,int size) {
		for (int i = 0; i < size; i++) {
			System.out.println(FormKeyConstants.COIL_GB+(num+=2));
		}
	}
	
	private static void row(int num,int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(FormKeyConstants.COIL_GB+(num+=1)+"\t");
		}
	}
	
	/**
	 * @author gongchang
	 * 功能：生成表单key
	 * 参数：
	 * 		num ：上一个key编号数
	 * 		col : 生成列数
	 * 		row : 生成行数
	 * 时间：2015年3月26日 上午11:57:05
	 */
	private static void row2(int num,int col,int row) {
		int size = (col*row);
		for (int i = 1; i <= size; i++) {
			System.out.print(FormKeyConstants.CABLE_DX+(num+=1)+"\t");
			if(i%col==0){
				System.out.println();
			}
		}
	}
	
	
	public static void main(String[] args) {
//		column(49,3);
//		row(80,5);
		
		row2(197,10,10);
//		row2(127,6,1);
		
		Set<Integer> set = new HashSet<Integer>();
//		set.add(376);
//		set.add(377);
//		set.add(378);
//		key$(340,354,1,set);
		
//		calcResultKey$(25,36,3,set);
		
//		keyCode(148,153,3,set);
	}

	private static void calcResultKey$(Integer begin,Integer end,Integer col,Set<Integer> set) {
		int count = 1;
		for (int i = begin; i <= end; i++) {
			if(set.contains(i)){
				continue;
			}
			System.out.print("${"+"calc"+(i)+"} \t");
			if(count%col==0){
				System.out.println();
			}
			count++;
		}
		
	}

	private static void key$(Integer begin,Integer end,Integer col,Set<Integer> set) {
		int count = 1;
		for (int i = begin; i <= end; i++) {
			if(set.contains(i)){
				continue;
			}
			System.out.print("${"+FormKeyConstants.COIL_GB+(i)+"} \t");
			if(count%col==0){
				System.out.println();
			}
			count++;
		}
	}

	private static void keyCode(Integer begin,Integer end,Integer col,Set<Integer> set) {
		int count = 7;
		for (int i = begin; i <= end; i+=col) {
			if(set.contains(i)){
				continue;
			}
//			System.out.print((i) +" " + (i+1) +" " + (i+2));
			System.out.print("\"coil_gb"+(i)+"\",\"coil_gb"+(i+1)+"\",\"coil_gb"+(i+2)+"\"");
			
//			if(count%col==0){
				System.out.println();
//			}
			count++;
		}
	}
}
