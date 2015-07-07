package com.gc.en;

import java.util.Scanner;

import org.junit.Test;

public class TestEn {
	 
	@Test
	public void testVerbToPastParticiple(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("动词转过去分词:");
		System.out.print(">");
		String word = scanner.next();
		word = verbToPastParticiple(word);
		System.out.println("过去分词: " + word);
	}

	private String verbToPastParticiple(String word) {
//		1) 一般情况下，在动词原形后直接加ed
//		如：wanted，played
		word = word + "ed";
//
//		2) 以不发音的字母e结尾的动词，直接加d
//		如：hoped，lived
		if(isAbsOpenSyllable(word)){
			word = word + "d";
		}
//
//		3) 重读闭音节单词需双写最后一个辅音字母，再加ed。
//		如：stopped, shipped
//
//		4)以辅音字母+y结尾的动词变y为i，再加ed
//		如：studied，worried
//
//		5) 有些动词不符合上面的规则，需要特殊记忆
//		如：am(is)-was, are-were, go-went, 等
		 
		return null;
	}

	private boolean isAbsOpenSyllable(String word) {
		// TODO Auto-generated method stub
		return false;
	}
}
