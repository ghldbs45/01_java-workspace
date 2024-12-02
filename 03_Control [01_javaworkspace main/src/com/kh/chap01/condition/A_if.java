package com.kh.chap01.condition;

import java.util.Scanner;

public class A_if {
	/*
	 *  기본적으로 프로그램 진행은 순차적으로 진행
	 *  단 , 이 순차적인 흐름을 바꾸고자 한다면 제어문 이라는걸 이용해서 직접 제어 가능
	 *  
	 *  선택적으로 실행시키조가 할때 > 조건문
	 *  반본적으로 실행시키고자 할때 > 반복문
	 *  그 외의 흐름을 제어 > 분기문
	 *  
	 *  "조건식"을 통해 참이나 거짓이냐를 판단해서 참일 경우 그에 해당하는 코드 실행
	 *  
	 *  조건식의 결과 true / false 여야 한다
	 *  보통 조건식에서는 비교연산자 (대소,동등) , 논리연산자 (&&, ||)를 주로 사용
	 *  
	 *  조건문은 크게 if 문과 switch문으로 나뉨
	 */

	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		/*
		 *  단독 if 문
		 *  
		 *  [표현법]
		 *  if (조건식) {
		 *            .. 실행시키고자 하는 코드 ..
		 *            }
		 *            
		 *            조건식은 if랑 친하다..
		 *            
		 *   > 조건식이 true일 경우 > {} 안의 코드 실행
		 *   조건식이 false 일 경우 > {} 안의 코드 무시
		 *   
		 */
		if(num > 0) {
			System.out.println("양수다.");
		}
		
		if(num <=0) {
			System.out.println("양수가 아니다");
		}
		
		
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println( "정수하나 입력 : ");
		int num = sc.nextInt();
		
		/*
		 * if - else 문
		 * 
		 * [표현법]
		 * if (조건식) {
		 * 실행코드1
		 * }else{
		 * 실행코드2
		 * }
		 * 
		 * true 일경우 실행코드 1 수행후 if-else 문 빠져나감
		 * 단 , 거짓일 경우 실행코드 2 수행 후 빠져나감.
		 * 
		 */
		
		if (num > 0) {
			System.out.println("양수다");
		}else {
			System.out.println("양수가 아니다");
		}
		}
	
	public void method3() {
		
		/*
		 * if - else if - else 문
		 * 
		 * 같은 비교대상으로 여러개의 조건을 제시해야 될 경우
		 * 
		 * [표현식]
		 * if(조건식){
		 *  // 실행코드 1
		 *  }else if (조건식) {
		 *   // 실행코드 2
		 *   }else if (조건식){
		 *   // 실행코드 3
		 *   }[else{
		 *   //위의 코드들이 다 false 일 경우 실행할 코드
		 *   }]
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다.");
		}else if (num == 0) {
			System.out.println("0이다.");
		}else {
			System.out.println("음수다");
		}
		}
	
	public void method4() {
		
		// 사용자에게 나이를 입력 받아 어린이 청소년 성인
		// 13세 이하 : 어린이
		// 13 초과 : 19세 이하 : 청소년
		// 19세 초과 : 성인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		String result = ""; // 변수 선언과 동시에 초기화 
		
		if (age <= 13 && age >= 0) {
			result = "어린이";
		}else if(age > 13 && age <= 19) {
			result = "청소년";
		}else {
			result = "성인";
			
			System.out.println(result);
			
		}}
		
		public void method5() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("이름 : ");
			String name = sc.nextLine();
			
			String result = "";
			
			System.out.println("성별(M/F) : ");
			char gender = sc. nextLine().charAt(0);
			
			if(gender == 'M' || gender == 'm') {
				result = "남학생";
			}else if( gender == 'F' || gender =='f') {
				result = "여학생";
			}else {
				System.out.println("성별 잘못 입력함");
				return;
						
						//해당 이 메소드 자체를 빠져나가는 구문
						
			
			}
		System.out.println(name + "님은" + result +"기모띠" );
	}
		
		
		
		public void method6() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("이름입력");
			String name = sc.nextLine();
			
			
			
			if(name.equals("주몽")) {
				System.out.println("희찬이");
			}else {
				System.out.println("희찬이 짱짱맨");
			}
			
			
			
		}
}
	
	


