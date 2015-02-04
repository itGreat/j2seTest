package com.gc.test.cmd;

import java.io.IOException;

public class TestCmd {
	public static void main(String[] args) throws IOException {
		Runtime rt = Runtime.getRuntime();
//		String cmd = "cmd.exe /c notepad.exe";
//		String cmd = "cmd /c del c:\\1.txt";
		String cmd = "cmd /c del D:\\project\\inspectSys\\pages\\upload\\report\\20150128115901435.doc";
		
		Process p = rt.exec(cmd);
//		if (p != null) {
//			p.destroy();
//			p = null;
//		}
	}
}
