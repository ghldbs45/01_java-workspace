package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	
	/*
	 *  * switch문도 if문과 동일하게 조건문임
	 *  
	 *  다만 if문과의 차이점 이라면?
	 *   > if문은 조건식을 자유롭게 기술 가능
	 *   > switch문은 동등 비교 밖에 수행불가
	 *   
	 *   > 실행할 구문만 실행하고 자동으로 빠져나오질 못함
	 *   (직접 break;문 작성해야함)
	 *   
	 *   [표현법]
	 *   switch(동등비교할 대상){
	 *   case 값1 : 실행코드1; break;
	 *   case 값2 : 실행코드2; break;
	 *   ...
	 *   [default : 위으 값들과 일치하지 않을 경우 실행할 코드]
	 *   }
	 */

	public void method1() {
		
		/*
		 * 정수를 입력 받아 "정수" > 동등비교할 대상
		 * 1일 경우 "빨간색 입니다" > case 1 : 빨간색 입니다.
		 * 2일 경우 "파란색 입니다" > case 2 : 파란색 입니다.
		 * 3일 경우 "초록색 입니다" > case 3 : 초록색 입니다.
		 * 
		 * 잘못 입력했을 경우 " 잘못 입력하였습니다" 
		 */
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력(1~3)");
		int num = sc.nextInt();
		
		//if(num == 1) {
		//	System.out.println("빨간색입니다");
		//}else if (num == 2) {
		//	System.out.println("파란색입니다");
		//}else if (num == 3) {
		//	System.out.println("초록색 입니다");
		//}else {
		//	System.out.println("잘못 입력했음");
		// }

		switch (num) {
		case 1:
			System.out.println("빨간색입니다");
			break;
		case 2:
			System.out.println("파란색입니다");
			break;
		case 3:
			System.out.println("초록색 입니다");
			break;
		default:
			System.out.println("잘못 입력했음");

		}
		
		
		
		
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구매하고자 하는 과일 (사과 바나나 복숭아) 입력 : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		switch(fruit) {
		case "사과" : 
			price = 1000;
			break;
		case "바나나":
			price = 2000;
			break;
		case " 복숭아":
			price = 3000;
			break;
		default:
			System.out.println("품절");
			return;
		}
		
		System.out.println(fruit + "의 가격은" + price + "원 입니다");
	}
	
	
	public void method3() {
		
		
		//등급별 권한
		//등급(정수) :
		
		// 1. 관리권한 , 글쓰기 권한 , 읽기 권한
		// 2. 글쓰기 권한 , 읽기 권한 , 
		// 3. 읽기권한
		
		Scanner sc = new Scanner(System.in);
		System.out.println("등급번호를 적어주세요");
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("관리권한");
		case 2 :
			System.out.println("글쓰기 권한");
		case 3 : 
			System.out.println("읽기 권한");
			break;

		}
		
			
		}
	
	public void method4() {
		
		// 월을 입력 받아 해당 월의 마지막 날짜 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1월 ~ 12월 까지 입력");
		int month = sc.nextInt();
		
		// 1 , 3, 5, 7 , 8, 10 ,12 > 31일
		// 4 , 6 , 9 , 11 > 30일
		// 2						> 28일 or 29일
		
		switch(month) {
		case 1: 
		case 3:
		case 5: 
		case 7:
		case 8:
		case 10:
		case 12: System.out.println("입력하신 월은 31일 까지입니다.");
		break;
		case 4:
		case 6:
		case 9:
		case 11: System.out.println("입력하신 월은 30일 까지입니다.");
		break;
		case 2: System.out.println("입력하신 월은 28일or29일까지입니다.");
		break;
		
		default : System.out.println("1~12로 입력");
		

		}
		
		
	}
	
	
	
}

