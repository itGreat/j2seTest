package com.gc.test.math;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @author gongchang
 * 描述：获得小数精度的方法
 * 时间：2015年2月5日 上午10:39:17
 */
public class Scale {
	public static void main(String[] args) {
		// 1 
		Double diff = 3340.000022000000;
		BigDecimal.valueOf(diff).setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();

		//2
		String format = new DecimalFormat("#.###").format(diff);

		//3
		String stringFormat = String.format("%.3f", diff);
		System.out.println(stringFormat);

		// 4
		Double.valueOf(Math.round(diff*1000)/1000.0);

		// 5
		String diffString = String.valueOf(diff);
		String.valueOf(diff).substring(0, diffString.indexOf(".")+4);
	}
}
