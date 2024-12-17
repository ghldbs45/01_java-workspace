package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	
	/*  -sc:Scanner = new Scanner(System.in)
		-tc:TokenController = new TokenController()
	*/
	
	// 전역변수 > 전체지역
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainManu() {
		while(true) {
			System.out.println("1 지정 문자열");
			System.out.println("2 입력 문자열");
			System.out.println("3 프로그램 끝내기");
			System.out.println(" 메뉴 입력 : ");
			int menu = sc.nextInt();
			
			sc.nextLine();
			switch(menu) {
			case 1: tokenMenu(); break;
			case 2: inputMenu(); break;
			case 3: System.out.println(" 프로그램 종료합니다 . "); return;
			default : System.out.println(" 잘못 입력하셨습니다 . 다시 하세요.");
			}
			
		}
	}
	
	public void tokenMenu() {
		
		// String str = “J a v a P r o g r a m “;
		// 토큰 처리 전 글자, 토큰 처리 전 개수를 출력
		// TokenController(tc)의 afterToken()의 반환 값을 가지고
		// 토큰 처리 후 글자, 토큰 처리 후 개수, 모두 대문자로 변환 한 것을 출력
		
		String str = "J a v a P r o g r a m ";
		// 토큰 처리 전 글자, 토큰 처리 전 개수를 출력
		
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 글자수 : "+ str.length());
		
		// TokenController(tc)의 afterToken()의 반환 값을 가지고
		
		str = tc.afterToken(str);
		
		// 토큰 처리 후 글자, 토큰 처리 후 개수, 모두 대문자로 변환 한 것을 출력
		
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 글자수 : "+ str.length());
		System.out.println("모두 대문자로 변환 : " + str.toUpperCase());
		
		
	}
	
	public void inputMenu() {
		
		System.out.println("문자열을 입력하세요 : ");
		String input = sc.nextLine();
		
		// tc에 firstCap()로 입력 받은 문자열을 넘기고 반환 값 출력
		
		String newInput = tc.firstCap(input);
		System.out.println(newInput);
		
		// 찾을 문자를 하나 입력하세요 :
		
		System.out.println("찾을 문자를 하나 입력하세요 : ");
		char one = sc.nextLine().charAt(0);
		
		// tc에 findChar()로 위에 입력 받은 문자열과 방금 받은 문자를 인자로 넘겨
		
		int count = tc.findChar(input, one);
		System.out.println(count);
		// 반환 값 출력
	}
	
	
	

}
