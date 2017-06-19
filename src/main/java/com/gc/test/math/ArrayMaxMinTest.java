package com.gc.test.math;


public class ArrayMaxMinTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double[] d = new Double[5];
		d[0] = -1.4;
		d[1] = 331.9;
		d[2] = 562.0;
		d[3] = 3.8;
		d[4] = 665.7;
		ArryAlg.Pair p= ArryAlg.minmax(d);
		System.out.println("最小值"+p.getMin());
		System.out.println("最大值:"+p.getMax());
	}

}

class ArryAlg {
	public static class Pair {
		
		private Double min;
		private Double max;
		
		public Pair(Double n1, Double n2) {
			min = n1;
			max = n2;
		}

		public Double getMin() {
			return min;
		}

		public Double getMax() {
			return max;
		}
	}

	public static Pair minmax(Double[] values) {
		Double min = Double.MAX_VALUE;
		Double max = Double.MIN_VALUE;
		for (Double v : values) {
			if (min > v)
				min = v;
			if (max < v)
				max = v;
		}
		return new Pair(min, max);
	}
}
