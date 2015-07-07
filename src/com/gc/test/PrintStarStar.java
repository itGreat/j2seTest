package com.gc.test;


public class PrintStarStar {
	
	
/*		
   *      *
  ***    ***
 *****  *****
 
 
 1 3 5
*/
	public static void main(String[] args) {
		 int r = 8;
		
		for (int i = 0; i < r; i++) {// 0 1 2
			//空格
			for (int j = i; j < r - 1; j++) {
				System.out.print(" ");
			}
			//*
			for (int k = 0; k < (i * 2) + 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		

	}
}
