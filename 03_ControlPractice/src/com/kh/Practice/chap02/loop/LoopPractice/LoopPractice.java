package com.kh.Practice.chap02.loop.LoopPractice;

import java.util.Scanner;

public class LoopPractice {
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력하세요");
		int num = sc.nextInt();
		
		for(int i=1 ; i<=num ; i++ ) {
			System.out.print(i+" ");
		}
	}
 public void method2() {
	 
	 Scanner sc = new Scanner(System.in); 
	 System.out.println("1이상의 숫자를 입력하세요");
	 
	 while(true) {
		 int num = sc.nextInt();
		 if(num<1) {
			 System.out.println("1 이상의 숫자를 입력해주세요");
		 }else {
		 for(int i=1;i<=num ; i++) {
			 System.out.print(i+ " ");
			 }
			 
		 }
	 }
	 
 }
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i=num;i>=1;i--) {
			System.out.print(i+" ");
		}
	}
	
	public void method4() {
		
		 Scanner sc = new Scanner(System.in); 
		 System.out.println("1이상의 숫자를 입력하세요");
		 
		 while(true) {
			 int num = sc.nextInt();
			 if(num<1) {
				 System.out.println("1 이상의 숫자를 입력해주세요");
			 }else {
			 for(int i=num;i>=1 ; i--) {
				 System.out.print(i+" ");
			 }
			 }
		 }
		
	}
	
	public void method5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력");
		int num=sc.nextInt();
		
		if(num>=1) {
			int sum=0;
			for (int i=1;i<=num;i++) {
				sum += i;
			}
			System.out.println("1부터 "+ num + "까지의 합계 : "+sum);
		}else {
			System.out.println("잘못 입력했음");
		}
	}

	
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력해주세요");
		int num1=sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력해주세요");
		int num2=sc.nextInt();
		
		if(num1>=1 && num2>=1) {
			if(num1<num2) {
			
			}
			
	}
	}
	public void method7() {
		
		Scanner sc = new Scanner(System.in);

		Scanner sc1 = new Scanner(System.in);
		while (true) {
			System.out.println("첫번째 숫자");
			int num = sc.nextInt();
			System.out.println("두번째 숫자");
			int num2 = sc.nextInt();
			
			if (num <= 0 || num2 <= 0) {
				System.out.println("1 이상의 숫자를 입력해주세요");
			} else {
				for (int i = num; i <= num2; i++) {
					System.out.print(i + " ");
					
				}
	    }
		}
		}
	
	
	
	
	public void method8() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자");
		int num=sc.nextInt();
		
		System.out.println("====="+ num +"=====");
		for(int i=1;i<=10;i++) {
			System.out.printf("%d x %d = %d\n",num,i,num*i);
			
		}
		
		
		
	}
	
	public void method9() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("9이하의 숫자만 입력해주세요.");
		int num = sc.nextInt();
		
		
			for (int i = num; num < 10; num++) { // i 단수
				System.out.println("===== " + i + "단 =====");
				for (int j = 1; j < 10; j++) { // j 곱하는수
					System.out.printf("%d x %d = %d\n", num, j, num * j);
				}
				System.out.println();
		}
		
		
		
	}
	
	public void method10() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("9이하의 숫자를 입력해주세요");
			int num = sc.nextInt();
			
			for (int i = num; num < 10; num++) { // i 단수
				System.out.println("===== " + i + "단 =====");
				for (int j = 1; j < 10; j++) { // j 곱하는수
					System.out.printf("%d x %d = %d\n", num, j, num * j);
				}
				System.out.println();
			
		}
		}
	}
	
	public void method11() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 숫자");
		int start = sc.nextInt();
		
		System.out.println("공 차");
		int gong = sc.nextInt();
		
		int result = start; // 4
		for(int i=1;i<10;i++) {
			System.out.print(result+" ");
			result += gong;
		}
		}
	
	public void method12() {
		
		Scanner sc = new Scanner(System.in);

		


			while(true) { 
				System.out.println("연산자 ( +, -, * ,/ ,%) : ");
				String op = sc.nextLine();
				
				if(op.equals("exit")) { // 사용자가 exit를 입력한경우
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				
				System.out.println("정수 입력 : ");
				int num1 = sc.nextInt();
				
				System.out.println("정수2 입력 : ");
				int num2 = sc.nextInt();
				
				sc.nextLine();
				
				
				if(op.equals("/") && num2 == 0 ) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력하십시요.");
				}else {
					switch(op) {
					case "+" : result = num1 + num2; break;
					case "-" : result = num1 - num2; break;
					case "/" : result = num1 / num2; break;
					case "%" : result = num1 & num2; break;
					case "*" : result = num1 * num2; break;
					default : 
						System.out.println(" 없는 연산자 입니다 다시 입력하세요 ");
						continue;
					}
					System.out.printf("%d %s %d = %d\n",num1,op,num2,result);
			
			
			
			}
			
			
			
		}
	}
}
		
		
		
	
	
	


