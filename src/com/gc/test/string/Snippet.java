package com.gc.test.string;

public class Snippet {
	public static void main(String[] args) {
			String str = "姓名由测试1237变为大卫，性别由女变为男，出生日期由19880101变为19880110，证件号由111221198801011237变为11122119880101，地址由1变为中国陕西省咸阳市长安南街解放路北金色小区1单元1号楼20层" ;
			str = new String(str.getBytes(),0,100) ;
			str =  new String(str.toCharArray(),0,str.length()-1) ;
			System.out.println(str);
		}
}

