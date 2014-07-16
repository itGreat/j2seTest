package com.gc.test.encoding;

import java.io.UnsupportedEncodingException;


public class UTF8 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "%E6%96%87%E4%BB%B6%E5%A4%A7%E4%BA%8E100M";
		String s2 = new String(str.getBytes("ISO-8859-1"),"UTF-8");
		System.out.println(s2);
		
		String s3 = new String(str.getBytes(),"UTF-8");
		System.out.println(s3);
		
		String msg = "文件大于100M";
		String s3_ = new String(msg.getBytes(),"UTF-8");
		System.out.println(s3_);
		
	}
}
