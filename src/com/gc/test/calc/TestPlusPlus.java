package com.gc.test.calc;

/**
 * @author gongchang
 * 描述：测试i++,++i的不同
 * 时间：2015年4月25日 上午11:39:15
 */
public class TestPlusPlus {
	
	public static void main(String[] args) {
		plusPlusVar();
		varPlusPlus();
	}
	
	/**
	 * @author gongchang
	 * 功能：输出 ++i => i = i + 1
	 * 时间：2015年4月25日 上午11:40:39
	 */
	private static void plusPlusVar() {
		int i = 0;
		System.out.println("Demo : ++i");
		System.out.println("++i = "+ (++i));
		System.out.println("i = "+ (i));
	}

	/**
	 * @author gongchang
	 * 功能：i++ => i + 1
	 * 时间：2015年4月25日 上午11:41:58
	 */
	private static void varPlusPlus() {
		int i = 0;
		System.out.println(" ----------------------- ");
		System.out.println("Demo : i++");
		System.out.println("i++ = "+ (i++));
		System.out.println("i = "+ (i));
	}

}
