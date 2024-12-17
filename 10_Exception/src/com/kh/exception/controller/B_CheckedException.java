package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	
	/*
	 *  CheckedException은 반드시 예외처리를 해야하는 예외들임
	 *  > 조건문 미리 제시 불가 ( 예측이 불가한 곳에서 문제가 발생하기 때문에 미리 예외처리 구문 필요)
	 *  > 외부 매개체와 입출력이 일어날 때 발생됨 (IOException)
	 */
	
	public void method1() throws IOException {
		method2();
	}
	
	public void method2() throws IOException {
		// Scanner와 같이 키보드 값을 입력받을 수 있는 객체(단 , 문자열로 읽어들여짐)
		// 스캐너 이전의 방식  > 정수 , 실수 입력 안되고 , 문자만 받을 수 있었음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아무거나 입력해보세요 : ");
	
		//1. try ~ catch 문 : 여기 이 자리에서 예외를 처리하겠다.
		// try{} : 예외가 발생할 가능성이 있는 코드를 작성
		// catch(발생될예외클래스 매개변수명){} : try 구문 내에서 발생한 예외를 어떻게 처리할건지
		//                               에 관한 내용 작성
		/*
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			System.out.println(" 예외가 발생했습니다. ");
		}
		*/
		
		// 2. throws : 지금 이 자리에서 예외를 처리하지 않고 현재 이 메소드를
		//             호출하는 곳으로 예외처리 떠넘기겠다.(위임)
		String str = br.readLine(); 
		// 이미 'readLine()'메소드에서 'throws IOException' 하고있음 
		System.out.println(str);
		
		/* 
		 *                         예외 클래스        예외발생시점      예외처리
		 * UnCheckedException  RuntimeException     런타임에러       선택(개발자가 케바케로 처리 > if문을 통해 애초에 예외가 발생 안되도록 / 예외처리구문)
		 * CheckedException    RuntimeException외 컴파일에러(빨간줄)    필수(조건문 불가. 무조건 예외처리 구문으로만 가능)
		 * 
		 *            
		 *            
		 */
		
		
	}

}
