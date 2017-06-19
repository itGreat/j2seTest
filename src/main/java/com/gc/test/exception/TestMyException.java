package com.gc.test.exception;

public class TestMyException {
	public static void main(String[] args) {
		MyException ex = new MyException();
		try{
			ex.f();
		}catch(MyException e){
			System.out.println("Caught it!");
		}finally{
			System.out.println("finally...");
		}
	}
}
