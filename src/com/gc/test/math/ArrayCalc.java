package com.gc.test.math;

import java.math.BigDecimal;

import com.gc.test.math.util.MathUtils;

/**
 * @author gongchang
 * 描述：数组计算对象
 * 时间：2015年2月4日 上午11:21:28
 */
public class ArrayCalc {

	private BigDecimal min;
	private BigDecimal max;

	private BigDecimal[] array;

	public ArrayCalc(BigDecimal[] array_) {
		array = array_;
	}

	/**
	 * @author gongchang
	 * 功能：获得最小值
	 * 时间：2015年2月4日 上午11:21:23
	 */
	public BigDecimal min(){
		if(null == min){
			minmax();
		}
		return min;
	}
	
	/**
	 * @author gongchang
	 * 功能：获得最大值
	 * 时间：2015年2月4日 上午11:23:42
	 */
	public BigDecimal max(){
		if(null == max){
			minmax();
		}
		return max;
	}
	
	/**
	 * @author gongchang
	 * 功能：
	 * 时间：2015年2月4日 下午12:05:35
	 */
	public BigDecimal sum(){
		BigDecimal sum = BigDecimal.valueOf(0);
		for (int i = 0; i < array.length; i++) {
			sum = sum.add(array[i]);
		}
		return sum;
	}
	
	/**
	 * @author gongchang
	 * 功能：
	 * 时间：2015年2月4日 下午12:05:33
	 */
	public BigDecimal avg(){
		return sum().divide(new BigDecimal(array.length),3,BigDecimal.ROUND_HALF_UP);
	}
	
	/**
	 * @author gongchang 
	 * 功能：最大值 , 最小值 
	 * 时间：2015年2月4日 上午11:16:23
	 */
	public void minmax() {
		Double min = Double.MAX_VALUE;
		Double max = Double.MIN_VALUE;
		for (BigDecimal e : array) {
			Double v = e.doubleValue();
			if (min > v)
				min = v;
			if (max < v)
				max = v;
		}
		this.min = BigDecimal.valueOf(min);
		this.max = BigDecimal.valueOf(max);
	}
	
	/**
	 * @author gongchang
	 * 功能：获取 最大值 - 最小值 差值
	 * 时间：2015年2月4日 上午11:24:41
	 */
	public BigDecimal diff() {
		BigDecimal diff = max().subtract(min());
//		return MathUtils.round(diff,3);
		return diff.setScale(3,BigDecimal.ROUND_HALF_UP);
//		return max() - min();
	}

	/**
	 * @author gongchang
	 * 功能：电阻不平衡率（%)
	 * 时间：2015年2月4日 上午11:56:31
	 */
	public BigDecimal unbalanceRate() {//.multiply(BigDecimal.valueOf(1))
		BigDecimal rate = diff().divide(avg(),3,BigDecimal.ROUND_HALF_UP).multiply(BigDecimal.valueOf(100));
//		return rate;
		return rate.setScale(3,BigDecimal.ROUND_HALF_UP);
	}
	
	public static void main(String[] args) {
		ArrayCalc arrayCalc = new ArrayCalc(new BigDecimal[]{BigDecimal.valueOf(6.271),BigDecimal.valueOf(6.262),BigDecimal.valueOf(6.267)});
//		System.out.println(arrayCalc.diff());
		System.out.println(arrayCalc.unbalanceRate().doubleValue());
		
		ArrayCalc arrayCalc2 = new ArrayCalc(new BigDecimal[]{BigDecimal.valueOf(5.800),BigDecimal.valueOf(5.790),BigDecimal.valueOf(5.802)});
//		System.out.println(arrayCalc2.diff());
//		System.out.println(arrayCalc2.unbalanceRate());
	}
}