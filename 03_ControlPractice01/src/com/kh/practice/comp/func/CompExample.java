package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	
	public void practice1() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		for(int i=1;i<num;i++) {
			if(i % 2==1) {
				System.out.print("박");
			}else {
				System.out.print("수");
			}
		}if(num<0) {
			System.out.println("양수가 아닙니다");
		}
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("정수 : ");
			int num = sc.nextInt();

			if (num < 0) {
				System.out.println("양수가 아닙니다");
			}
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 1) {
					System.out.print("박");
				} else {
					System.out.print("수"); 
					
					
				}
			} break;
			}
		}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String ch = sc.nextLine();
		for(int i=1;i<=ch.length();i++) {
			System.out.println("문자열 : "+ch);
		
			
	}
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자열 : ");
			String str = sc.nextLine();
			
			System.out.println("문자 : ");
			char ch = sc.nextLine().charAt(0);
			
			int count = 0;
			for(int i=0;i<str.length();i++)  {
				if(str.charAt(i) == ch) {
					count++;
				}
			}
			System.out.println( " 포함된 개수 : "+count);
			System.out.println(" 더 하시겠습니까 : ");
			char yn = sc.nextLine().charAt(0);
			
			if(yn == 'n' || yn == 'N') {
				System.out.println("종료합니다");
				break;
			}else if(yn=='y'||yn=='Y') {
			}else {
				System.out.println("잘못입력하셨습니다 다시 입력하세요 :" );
				
			}
		}
	
		
		
	}
	
	

}

				
			
		
	


