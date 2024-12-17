package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {}
	
	/*
	 * +afterToken(str:String):String
		+firstCap(input:String):String
		+findChar(input:String, one:char):int
	 */
	
	public String afterToken(String str) {
		
		// 매개변수로 받아온 str을 StringTokenizer를 이용하여
		
		
		StringTokenizer stn = new StringTokenizer(str, " ");
		String newStr= " " ;
		
		// 띄어쓰기를 없애고 없앤 문자열 반환
		
		while(stn.hasMoreTokens()) {
			newStr += stn.nextToken();
		}
		return newStr;
		
		
	}
	public String firstCap(String input) {
		
		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
		// apple > Apple
		
		// char ch = input.toUpperCase().charAt(0); // 첫글자
		// input = input.substring(1); // 나머지글자
		// return ch + input;
		
		return input.toUpperCase().charAt(0) + input.substring(1);
	}
	public int findChar(String input , char one) {
		
		// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
		int count = 0;
		for(int i =0; i<input.length();i++) {
			if(input.charAt(i) == one) {
				count++;
			}
		}
		
		return count;
		
	}
	

}
