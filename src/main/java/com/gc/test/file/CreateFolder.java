package com.gc.test.file;

import java.io.File;

public class CreateFolder {
	public static void main(String[] args) {
		String path = "e:\\f1\\f\\f.txt";
		File folder = new File(path);
		if( !folder.getParentFile().exists() ){
			folder.getParentFile().mkdir();
		}
	}
}
