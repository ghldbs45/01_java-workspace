package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	
	/*
	 * * 논리 연산자 (이항 연산자)
	 * 두개의 논리값을 연산해주는 연산자
	 * 
	 *  논리값 && 논리값 : 왼쪽과 오른쪽 둘다 true일 경우 결과값은 true
	 *  논리값 || 논리값 : 왼쪽과 오른쪽 둘중에 하나라도 true일 경우 결과값은 true
	 */

	
	public void method1() {
		// 사용자가 입력한 정수값이 1부터 100사이의 값인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수하나 입력 : ");
		int num = sc.nextInt();
		
		//boolean result = (1 <= num)
		boolean result = (num >= 1) && (num <= 100); // num의 값이 1이상 "이고""그리고" num 값이 100 이하인 경우
		// && 의미 : ~이고 , 그리고 , ~하면서
		
		System.out.println("사용자가 입력한 값이 1이상 100이하 입니까? : " + result);
		
		//&& : 두개의 조건 모두가 true 여야 && 연산의 결과값이 최종적으로 true
		// 둘중에 하나라도 false가 있을 경우 && 연산의 결과값은 false
	}
	
	public void method2() {
		// 사용자가 입력한 문자하나값이 영어 대문자인지 확인
		// 'A'~'Z' : 65~90
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 첫번쨰 방법 
		//boolean result = (ch >= 65) && (ch <= 90) ;
		boolean result = (ch >= 'A') && (ch <= 'Z');
		System.out.println("입력한 값이 대문자입니까? : " + result);
	}
	
	public void method3() {
		//사용자에게 성별을 입력 받은 후 여자인지 확인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별이 무엇입니까? (M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		boolean result = (gender == 'F') || (gender == 'f');
		// || 의미 : ~이거나 , 또는~ 
		System.out.println("성별을 입력하세요 : " + result);
		// || : 두 개의 조건 중 하나라도 true가 있으면 || 연산의 결과값은 무조건 True
		//    	두 개의 조건 모두 false 일 경우 || 연산 결과값은 false
		
		
	}
	
	public void method4() {
		
		// 사용자에게 입력을 받아 게임을 종료하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("게임을 종료하겠습니까? (Y/N) : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'Y') || (ch == 'y') ;
		System.out.println("어쩔래요? : " + result);
	}
	
	/*
	 *  && : 두개의 조건이 모두 True 여야 결과값이 True (AND == ~ 이고 , 그리고 , ~ 이면서 , 뿐만아니라)
	 *  true && true > true
	 *  true && false > false
	 *  false && true > false
	 *  false && false > false
	 *  
	 *  ** && 연산자를 기준으로 앞의 결과가 false일 경우 뒤의 조건은 굳이 실행하지 않는다!_! **
	 *  
	 *  
	 *  || : 두개의 조건이 하나라도 True 면 결과값이 True (OR == 또는, ~이거나)
	 *  true || true > true
	 *  true || false > true
	 *  false || true > true
	 *  false || false > False
	 *  
	 *  ** || 연산자를 기준으로 앞의 결과가 True 일 경우 뒤의 조건을 굳이 실행하지 않는다!_! **	 *  
	 */
	
	public void method5() {
		int num = 10;
		//boolean result1 = (num < 5) && (++num > 0 );
		boolean result1 = (num > 5) && (++num > 0 );
		
		System.out.println("result1 : " + result1);
		System.out.println("&& 연산 후의 num의 값 : " + num);
		
		int num2 = 10;
		//boolean result2 = (num2 < 20) || (++num2 > 0) ;
		boolean result2 = true || (++num2 > 0) ;
		
		// Dead Cord (절대 실행 될 일 없는 코드)
		
		System.out.println("result2 : " + result2);
		System.out.println("&& 연산 후의 num2의 값 : " + num2);
		
		
	}
}
