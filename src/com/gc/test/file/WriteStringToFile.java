package com.gc.test.file;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;



public class WriteStringToFile {
	
	public static void main(String[] args) throws IOException {
		FileUtils.writeStringToFile(new File("D:\\2.xml"), "<xml>aaaaaaaaaa</xml>");
	}
}
