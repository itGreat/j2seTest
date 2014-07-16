package com.gc.test;


public class Test {
	
	/* 帖子状态 */
	public final static Integer SHIELD = Integer.valueOf(0);//屏蔽
	public final static Integer NORMAL = Integer.valueOf(1);//正常
	
	public static void main(String[] args) {
		//System.out.println(CommentState.normal);
		
		//
		Boolean flag = Test.NORMAL.equals(null);
		System.out.println(flag);
	}
}
