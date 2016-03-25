package com.gc.test.cmd;
import java.io.*;

public class TestDos {
    public static void main(String[] args) throws IOException {
        String command = "ipconfig";
        Runtime r = Runtime.getRuntime();
        Process p = r.exec(command);
    //    System.out.println(p.getClass().getName());
        BufferedReader br = new BufferedReader(new InputStreamReader(
                p.getInputStream()));
        StringBuffer sb = new StringBuffer();
        String inline;
        while (null != (inline = br.readLine())) {
            sb.append(inline).append("\n");
        }
        System.out.println(sb.toString());
    }

}