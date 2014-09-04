package com.gc.test.encoding;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;


public class UTF8 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		/*String str = "%E6%96%87%E4%BB%B6%E5%A4%A7%E4%BA%8E100M";
		String s2 = new String(str.getBytes("ISO-8859-1"),"UTF-8");
		System.out.println(s2);
		
		String s3 = new String(str.getBytes(),"UTF-8");
		System.out.println(s3);
		
		String msg = "文件大于100M";
		String s3_ = new String(msg.getBytes(),"UTF-8");
		System.out.println(s3_);*/
		
		String str = "%e9%80%9a%e4%bf%a1%e8%ae%be%e5%a4%87%e6%9d%90%e6%96%99%e8%a1%a8";
		/*String s2 = new String(str.getBytes("ISO-8859-1"),"UTF-8");
		System.out.println(s2);*/
		
		String decode = URLDecoder.decode(str, "UTF-8");
		System.out.println(decode);
		
	}
}
