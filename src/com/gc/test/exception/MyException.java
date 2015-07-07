package com.gc.test.exception;

/**
 * @author gongchang
 * 描述：自定义异常
 * 时间：2014年12月16日 下午10:41:24
 */
@SuppressWarnings("serial")
public class MyException extends Exception{
	
	public MyException() {

	}
	
	public MyException(String msg){
		System.out.println(msg);
	}
	
	public void f()throws MyException{
		throw new MyException("diy exception");
	}
}
