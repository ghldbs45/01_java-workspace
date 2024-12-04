package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	
	/*
	 * 
	 * 반복문
	 * 프로그램 흐름을 제어하는 제어문 중 하나
	 * 어떤 실행 코드를 반복적으로 수행시켜줌
	 * 
	 * 크게 두 종류로 나뉨 (for문 / while문(do-while문))
	 * * for문
	 * [표현법]
	 * for (초기식;조건식;증감식){ // 반복 횟수를 지정하기 위해 제시되는 것들
	 *        반복적으로 실행시키고자 하는 구문;
	 * }
	 * - 초기식 : 반복문이 수행될 때 "처음에 단 한번만 실행되는 구문"
	 *          (보통 반복문 안에서 사용될 변수를 선언 및 초기화 하는 구문 )
	 * 
	 * - 조건식 : "반복문이 수행될 조건"을 작성하는 구문
	 *           조건식이 true일 경우 해당 구문을 실행
	 *           조건식이 false가 되는 순간 반복을 멈추고 빠져나옴
	 *           (보통 초기식에 제시된 변수를 가지고 조건식을 작성함)
	 *           
	 * - 증감식 : 반복문을 제어하는 변수 값을 증감 시키는 구문
	 *          (보통 초기식에 제시된 변수를 가지고 증감 연산자(++ , --)를 사용함
	 *          
	 *    for문을 만나는 순간
	 * 초기식 > 조건식 검사 > true 일 경우 실행구문 실행 > 증감식
 	 *  > 조건식 검사 > true 일 경우 실행구문 실행 > 증감식
 	 *  ===========================================
 	 *  조건식 검사 > false일 경우 실행 x > 반복문 빠져나감
 	 *  
 	 *  
	 */
	public void method1() {
		//안녕하세욜  1번 출력
		
		
		//for문안에 실행코드를 돌리고 증감
		for(int i=1;  i<=5; i++) { // i값이 1에서 5까지 매번 1씩 증가하는동안 반복 수행
			System.out.println("안녕하세요");
		}
		
		for(int i = 0 ; i <= 4; i++) {//i의 값이 4일때까지 가능
			System.out.println("반갑습니다");
		}
		for(int i = 11;i>=15;i++) {
			System.out.println("저리가세요");
		}
        for(int i =1; i<=9; i+=2){// i값이 1에서 9까지 매번 2씩 증가하는 동안 반복 수행
        System.out.println("저리");
        }
        
	}
	
	public void method2() {
		//1부터 5까지 출력
		 /*
		 for(int i=1; i<=5; i++) {
		 	System.out.println(i);
		 }
		*/
		// 1 2 3 4 5 (사이사이 공백을 넣어서
		
		for (int i=1; i<=5; i++) {
			System.out.print(i+" ");
		}
 }
	
	
	
	public void method3() {
		
		//5 4 3 2 1 
		
		for(int i=5; i>=1; i--) {
			System.out.print(i+ " ");
		}
		
		
	}
	
	public void method4() {
	//1부터 10까지의 홀수만을 출력
	// 1 3 5 7 9 
	
		/*
		
	for(int i=1; i>=10; i+=2) {
		System.out.print(i + " ");
		}
		*/
		
		for (int i=1;i<11;i++) {
			if (i % 2 == 1) { //홀수라는 이야기
				System.out.print(i+" ");
			}}
		}
		
		public void method5() {
			//1 2 3 4 for문 고정
			
			for(int i=0; i<=9;i++) {
					System.out.print((i+1)+" ");
				}
			}
		
		
		
		public void method6() {
			//1에서부터 10까지의 총 합계
			
			//방법1. int sum = 1+2+3+.......+10;
			
			//방법2.
			/*
			 * int sum = 0
			 * sum += 1; > sum = sum +1; 0 + 1
			 * sum += 2; > sum = sum +2; 0 + 1 + 2
			 * sum += 3; > sum = sum +3; 0 + 1 + 2 + 3
			 * 
			 * 규칙을 찾자
			 * sum 변수에 누적해서 합산하는 과정이 반복적으로 진행됨
			 * 단 , 누적해서 더하고자 하는 값이 1에서부터 10까지 1씩 증가되는걸 파악할 수 있음
			 */
			int sum = 0 ;
			
			for (int i=1;i<=10;i++) {
				sum += i; //누적합 공식
			}
			
			System.out.println("1부터 10까지의 합계 : " + sum);
		}
			
			public void method7() {
				
				//사용자에게 값을 입력받아 1부터 입력받은 수까지의 합계 출력
				
				/*
				 * int sum=0;
				 * 
				 * sum +=1; // 0 + 1
				 * sum +=2; // 0 + 1 + 2 
				 * ...
				 * sum += 사용자가 입력한 숫자
				 * 
				 */
				Scanner sc = new Scanner(System.in);
				System.out.println("숫자 입력 ");
				int num = sc.nextInt();
				
				
				if(num >= 1) {
					//누적합 계산
					int sum=0;
					for (int i=1;i<=num;i++) {
						sum += i;
					}
					System.out.println("1부터 "+ num + "까지의 합계 : "+sum);
				}else {
					System.out.println("잘못 입력했음");
				}
				
				
				
				
						
			}
			
			
			
			
			public void method8() {
				//1에서부터 어떤 랜덤값(1~10) 까지의 총 합계
				
				//자바에서 제공 하는 클래스(Math)
				
				/*
				 * java.lang.Math 클래스에서 제공하는 random() 메소드를 호출해서
				 * 매번 다른 랜덤값을 얻어 낼 수 있음
				 * Math.random() 이런식으로 호출 > 0.0 ~ 0.99999 사이의 랜덤값 발생
				 *                             (0.0 <= 1.0)
				 */
				//int random = Math.random();  // math.random 이 double형이라서 안됨
				//               0.0 ~ 0.99999
				//int random = Math.random()*10;
				//               0.0 ~ 9.99999
				//int random = Math.random() * 10 +1;
				//           1.0~10.99999
				
				int random = (int)(Math.random() *10 + 1) ;
				//                1 ~ 11
				
				System.out.println("1~10 사이의 랜덤값 : " + random);
				
				int sum = 0 ;
				for(int i=1;i<=random;i++) {
					sum += i;
				}
				System.out.println("1부터" + random + "까지의 합계" + sum);
				}
				
				
			
			
			public void method9 () {
				
				String str = "Hello";
				
				// 각 인데스별로 문자를 뽑아서 출력
				/*
				 *  H > str.charAt(0); 출력
				 *  e > str.charAt(1);
				 *  l > str.charAt(2);
				 *  l > str.charAt(3);
				 *  o > str.charAt(4);
				 *  
				 *  0번 인덱스부터 4 번 인덱스까지 매번 1씩 증가하면서 반복 수행
				 */
				
				for (int i=0; i<=4; i++) {
				System.out.println(	str.charAt(i));
			}
				
			}
			
			public void method10() {
				// 사용자에게 문자열 입력 받아서 인덱스 별로 출력
				
				Scanner sc = new Scanner(System.in);
				System.out.println("문자열 입력");
				String str=sc.nextLine();
				
				// 각 인덱스별 문자를 뽑아서 출력
				
				// 마지막 인덱스는 항상 (문자열의 길이 -1) 이구나...
				
				System.out.println("문자열의 길이 : " + str.length());
				
				for(int i=0;i<str.length();i++) {
					System.out.print(str.charAt(i));
				}
			}
			
			public void method11() {
				//구구단 출력
				//2단 출력하기
				
				/*
				 * 2x1=2
				 * 2x2=4
				 * ..
				 * 2x8=16
				 * 2x9=18
				 * 
				 */
				for(int i=1;i<10;i++) {
				//System.out.println("2 x " + i+ " = " + 2 * i);
					System.out.printf("%d * %d = %d\n",2,i,2*i);
				}
				
				
			}
			
			public void method12() {
				// 사용자에게 단을 입력 받아 구구단 출력
				// int dan;
				// 2~9 사이의 정수를 입력 > 가이드 문구
				// 다른 숫자를 입력했을 경우 : 2~9 사이의 숫자를 입력해야합니다. 잘못입력하셨습니다.
				
				
				
				Scanner sc = new Scanner(System.in);
				System.out.println("2~9사이의 정수를 입력");
				int num=sc.nextInt();
				
			
				if(num >= 2 && num <= 9 ) {
					for(int i=1; i<10; i++) {
						System.out.printf("%d x %d = %d\n" , num , i , num * i);
					}
				}else {
					System.out.println("잘못입력");
				}
			}
			
			public void method13() {
				//2부터 9 사이의 랜덤값 발생시켜서 랜덤단 출력하기
				
				int dan = (int)(Math.random()*8+2); // 2가 시작수 , 시작수로 부터 몇개의 랜덤값을 발생시킬래
				
				System.out.println("==== " + dan + "단====");
				
				for(int i=1;i<10;i++) {
					System.out.printf("%d x %d = %d\n" , dan , i , dan*i);
				}
			}
			
			public void method14() {
				// 중첩 for문
				// 1 2 3 4 5 
				
				for(int j=1; j<4; j++) { // j=1 , j=2, j=3
					for(int i=1;i<6;i++) {
						System.out.print(i+" ");
					}
					System.out.println();
					
				}
				
				
				
				
			}
			
			public void method15() {
				// ****
				// ****
				// ****
				// ****
			for(int j=1;j<5;j++) {	 // 바깥쪽 for문은 행
				for(int i=1;i<5;i++) { // 바깥쪽 for문은 열
					System.out.print("*");
				}
				System.out.println();
			}
			
			
}
			
			public void method16() {
				
				// 1*** > 1행 1열일 때
				// *2** > 2행 2열일 떄
				// **3* > 3행 3열일 떄
				// ***4 > 4행 4열일 때
				
				
			for(int i=1;i<5;i++) {	 //바깥쪽 행
				for(int j=1;j<5;j++) { // 안쪽 별 하나 > 열 
					if(i==j) { // 즉 행과 열이 일치 할때
						System.out.print(i);
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
}
			
			public void method17() {
				// 2단 부터 9단까지 출력
				
				// 1.  2단 출력
				// 이게 잘된다 > 8번 하면됨
				for (int i = 2; i < 10; i++) { // i 단수
					System.out.println("===== " + i + "단 =====");
					for (int j = 1; j < 10; j++) { // j 곱하는수
						System.out.printf("%d x %d = %d\n", i, j, i * j);
					}
					System.out.println();
				}
}

			public void method18() {
				
				
				for(;;) { //조건식 자리 생략시 기본적으로 true > 무한반복문
					System.out.println("ㅎ2");
				}
			}
}		
			
			
			

			
			
 
	
	
	
	
	
	
	
	
	

	
	
