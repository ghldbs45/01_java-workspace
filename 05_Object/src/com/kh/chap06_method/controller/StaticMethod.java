package com.kh.chap06_method.controller;

public class StaticMethod {
	
	// 1. 매개변수 없고 반환값도 없는 static 메소드
	
	public static void method1() {
		System.out.println("이 녀석은 매개변수와 반환값이 둘 다 없는 메소드 입니다.");
	}
	
	// 2. 매개변수는 없고 반환값은 있는 static 메소드
	
	public static int method2() {
		System.out.println("매개변수는 없고 반환값은 있는 static 메소드 입니다.");
		// 1부터 랜덤값 (1~100) 까지의 총 합계
		
		int random = (int)(Math.random()*100+1);
		int sum = 0 ;
		for(int i=1 ; i <= random; i++) {
			sum += i;
		}
		return sum;
	}
	
}
