package com.gc.test.exception;

public class ExerciseNullException {
	public static void main(String[] args) {
		String str = null;
		try {
			str.length();
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}
}
