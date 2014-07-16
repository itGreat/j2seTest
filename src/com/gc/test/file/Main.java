package com.gc.test.file;

import java.io.File;

public class Main {

	public void renameFile(String file, String toFile) {

		File toBeRenamed = new File(file);
		// 检查要重命名的文件是否存在，是否是文件
		if (!toBeRenamed.exists() || toBeRenamed.isDirectory()) {

			System.out.println("File does not exist: " + file);
			return;
		}

		File newFile = new File(toFile);

		// 修改文件名
		if (toBeRenamed.renameTo(newFile)) {
			System.out.println("File has been renamed.");
		} else {
			System.out.println("Error renmaing file");
		}

	}

	public static void main(String[] args) {
		new Main().renameFile("d:\\temp\\demo03.html", "d:\\temp\\demo033333.html");
	}
}