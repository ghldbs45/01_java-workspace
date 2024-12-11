package com.kh.chap06_method.controller;

import java.util.Scanner;

public class NonStaticMethod {
	
	
	/*
	 * 
	 * * 메소드
	 *   한 기능을 처리하기 위한 용도
	 * 
	 *  패키지명 : 소문자로 시작
	 * ** 클래스명 : 대문자로 시작
	 *  변수명 : 소문자로 시작
	 *  메소드명 : 소문자로 시작
	 *  
	 *  공통 : 낙타표기법 (새로운 단어가 이어질때 대문자로 표기해주기)
	 *  
	 *  [표현법]
	 *  접근제한자 [예약어(static)] 반환형(반환할 값의 자료형) 메소드명([매개변수1,매개변수2,..]){
	 *                  수행내용;
	 *        [return 결과값;]
	 *   }
	 */
	
	// 1. 매개변수 없고 반환값도 없는 메소드
	
	public void method1() {
		// return 0; > 반환할 값이 없어야 한다.
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드 입니다.");
	}
		
	// 2. 매개변수 없고 반환값은 있는 메소드
	
	public String method2() {
		System.out.println("매개변수는 없고 반환값은 있는 메소드 입니다.");
		return "아 집에가고 싶다...";
	}
	
	// 3. 매개변수 있고 반환값은 없는 메소드
	public void method3(int num1,int num2) {
		System.out.println("매개변수 있고 반환값은 없는 메소드 입니다.");
		
		if(num2 !=0) {
			System.out.println("num1 / num2 : " + (num1/num2));
		}else {
			System.out.println("0으로는 나눌 수 없습니다!");
		}
	}
	
	// 4. 매개변수 있고 반환값도 있는 메소드
	
	public char method4(String str,int index) {
		
		System.out.println("매개변수와 반환값 둘 다 있는 메소드 입니다");
		
		/*
		if(index >= 0 && index < str.length()) {
			return str.charAt(index);
		}else {
			return ' ';
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("입력해보세여");
		String str1 = sc.nextLine();
		
		System.out.println("인덱스도 해보세여");
		int index1 = sc.nextInt();
		// 유효성 검사 해보기
		// index가 0 이상이고 문자열 길이보다 작을떄만 method4 수행
		
		if(index >= 0 && index < str1.length()) {
			System.out.println("결과 : "+ m1.me);
		}else {
			System.out.println("인덱스 값 이상한데여");
		
		
		return str.charAt(index);
		
		
	}
	
	
}
}
