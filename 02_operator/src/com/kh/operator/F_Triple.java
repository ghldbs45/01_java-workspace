package com.kh.operator;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class F_Triple {
	
	/*
	 * * 삼항 연산자 (항을 3개를 가지고 연산해주는 연산자 )
	 * [표현법] 
	 * 조건식 ? 조건식이 참일 경우 돌려줄 결과값 : 조건식이 거짓일 경우 돌려줄 결과 값
	 * 
	 * 조건식은 반드시 true 또는 false 가 나오도록 작성해야 함 !_!
	 * 주로 비교 , 논리 연산자를 통해 작성함
	 */
	public void method1() {
		//입력받은 정수 값이 양수인지 아닌디 판별 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		// xx는 Y/N
		String result = (num > 0) ? "양수입니다" : "양수가 아닙니다";
		
		System.out.println(num + "은" + result);
	}

	public void method2 () {
		// 입력받은 정수값이 짝수인지 홀수인지 판별 후 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수입니다" : "홀수입니다";
		System.out.println(num + "은" + result);
	}
	public void method3 () {
		// 양수이다 음수이다 0이다
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수" : (num == 0) ? "0이다" : "음수";
		System.out.println(num + "은" + result);
		
		
		
		
	}
}
