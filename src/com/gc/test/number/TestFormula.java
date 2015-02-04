package com.gc.test.number;

import java.math.BigDecimal;

/**
 * @author gongchang
 * 描述：
 * 时间：2015年2月3日 下午2:24:12
 */
public class TestFormula {
	public static void main(String[] args) {
		jydz();
	}

	private static void jydz() {
		Double R1 = new Double(String.valueOf("1500"));
		Double t1 = new Double(String.valueOf("30"));
		Double t2 = Double.valueOf(20);
		Double R2 = R1*Math.pow(1.5, (t1 - t2)/10);
		System.out.println(Math.round(R2));
	}
}
