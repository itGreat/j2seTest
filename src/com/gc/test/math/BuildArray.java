package com.gc.test.math;

import java.util.Arrays;
import java.util.Map;
import java.util.Random;

public class BuildArray {
	
	private static Double[] buildArray(String... keys) {
		Double[] array =  new Double[keys.length];
		Random r = new Random();
		for (int i = 0; i < keys.length; i++) {
			array[i] = Double.valueOf(keys[i]);
        }
		return array;
	}
	
	public static void main(String[] args) {
//		System.out.println(Arrays.toString(buildArray("333","4444","897")));
//		System.out.println(6.271 - 6.262);
		Double f = 0.0090000000043;
	  System.out.println(String.format("%.3f", f));
	}
}
