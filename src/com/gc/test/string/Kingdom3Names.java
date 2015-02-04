package com.gc.test.string;

import java.util.Random;

public class Kingdom3Names {
	public static void main(String[] args) {
//		String[] names = new String[]{"刘备","关羽","韩遂","刘岱","甘宁","黄忠","贾诩","司马懿","孙策","孙权","郭嘉","曹仁","曹操","李典","孙坚","陈武","陈登","崔琰","丁谧","邓飏"};
//		System.out.println(names.length);
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			System.out.println(random.nextInt(2));
		}
	}
}
