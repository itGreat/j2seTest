package com.gc.test.cmd;

import java.io.IOException;

/**
 * @author gongchang
 * 描述：测试执行cmd命令
 * 时间：2015年4月25日 上午11:50:29
 */
public class TestCmd {
	
	public static void main(String[] args) throws IOException {
		Runtime rt = Runtime.getRuntime();
		//删除在D盘下的新建文本文档.txt
//		String cmd = "cmd /c del D:\\新建文本文档.txt";
		
		String cmd = "cmd /c notepad";//打开记事本
//		String cmd = "cmd /c sysdm.cpl";//打开系统属性
 
		Process p = rt.exec(cmd);
		System.out.println("run over..............");
	}
}
