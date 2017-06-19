package com.gc.test.cmd;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.SequenceInputStream;

/**
 * @author gongchang
 * 描述：dos调用打印机 执行打印作业
 * 时间：2015年8月25日 上午10:02:57
 */
public class Processing{
	public static void main ( String[] args ) throws InterruptedException{
		try{
			Process process = Runtime.getRuntime ().exec ("cmd");
			SequenceInputStream sis = new SequenceInputStream (process.getInputStream (), process.getErrorStream ());
			InputStreamReader isr = new InputStreamReader (sis, "GBK");
			BufferedReader br = new BufferedReader (isr);
			// next command
			OutputStreamWriter osw = new OutputStreamWriter (process.getOutputStream ());
			BufferedWriter bw = new BufferedWriter (osw);
			bw.write ("cd C:/");
			bw.newLine ();
			bw.write ("c:");
			bw.newLine ();
			bw.write ("lpr -S 192.168.0.218 -P d1prn 1.txt");
			bw.newLine ();
			bw.flush ();
			bw.close ();
			osw.close ();
			// read
			String line = null;
			while (null != ( line = br.readLine () )){
				System.out.println (line);
			}
			process.destroy ();
			br.close ();
			isr.close ();
		}catch (IOException e){
			e.printStackTrace ();
		}
	}
}
