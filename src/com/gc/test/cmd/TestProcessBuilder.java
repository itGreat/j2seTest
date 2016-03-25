package com.gc.test.cmd;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class TestProcessBuilder {
	public static void main(String[] args) throws Exception {
		ProcessBuilder builder = new ProcessBuilder("cmd", "/c",
				"ipconfig /all");
		// builder.directory (new File ("C:\\WINDOWS\\audio"));
		Process process = builder.start();
		InputStream is = process.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "GBK");
		BufferedReader br = new BufferedReader(isr);
		LinkedList<String> list = new LinkedList<String>();
		String line;
		String regex = ".*Ethernet adapter(.*)\\:.*";
		while (null != (line = br.readLine())) {
			if (!"".equals(line)) {
				if (line.matches(regex)) {
					list.add(line.replaceAll(regex, "$1"));
				}
				System.out.println(line);
			}
		}
		br.close();
		isr.close();
		is.close();
		process.destroy();
		System.out.println(list);
	}
}