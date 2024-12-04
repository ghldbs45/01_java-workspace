package com.kh.chap03.branch;

public class B_Continue {
	
	public void method1() {
		
		/*
		 * continue           : 반복문 안에 기술되는 구문
		 *      continue; 구문 실행시 그 아래 구문을 실행하지 않고 , 곧바로 현재
		 *      속해있는 반복문 위로 올라감 
		 *                     
		 */
		// for문으로 1부터 10까지 홀수 출력
		// 1 3 5 7 9
		
		
		/*
		for(int i=1;i<10;i++) {
			if(i % 2 == 1) {
			System.out.print(i+ " ");
		*/	
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) { // i값이 짝수일 경우
				continue;
			}
			System.out.print(i + " ");
		
		
		
	

	}
	}
	
	public void method2() {
		
		// 1부터 100까지의 총 합계(누적합)
		// 단, 6의 배수값은 뺴고 덧셈연산 하겠다.
		
		// 1. 1부터 100까지의 총합계 먼저 for문 짜자
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 6 == 0 ) { // 6의 배수란 소리 
				continue; // 건너뛰기
			}
			sum+=i;
			
		}
		System.out.println("1부터 100까지의 총합계 : "+ sum);
	}
	
	public void method3() {
		
		// 2~9단 까지 출력
		// 단, 3의 배수단은 빼고 출력 > 3, 6 , 9
		
		for (int i = 2; i < 10; i++) { // i 단수 
			if(i%3==0) {
				continue;
			}
			System.out.println("===== " + i + "단 =====");
			for (int j = 1; j < 10; j++) { // j 곱하는수
				System.out.printf("%d x %d = %d\n", i, j, i * j);
				}
			
	}
}
	
	
	}
	
 