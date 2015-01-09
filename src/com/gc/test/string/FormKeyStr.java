package com.gc.test.string;

public class FormKeyStr {
	
	private static void column(int num,int size) {
		for (int i = 0; i < size; i++) {
			System.out.println(FormKeyConstants.COIL_GB+(num+=2));
		}
	}
	
	private static void row(int num,int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(FormKeyConstants.COIL_GB+(num+=1)+"\t");
		}
	}
	
	private static void row2(int num,int col,int row) {
		int size = (col*row);
		for (int i = 1; i <= size; i++) {
			System.out.print(FormKeyConstants.COIL_GB+(num+=1)+"\t");
			if(i%col==0){
				System.out.println();
			}
		}
	}
	
	
	public static void main(String[] args) {
//		column(49,3);
//		row(80,5);
		
//		row2(389,5,2);
		row2(652,6,20);
	}

	
}
