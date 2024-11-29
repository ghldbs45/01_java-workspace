package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	
	public void variablePractice () {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("성별");
		String gender = sc.nextLine();
		System.out.println("나이");
		int age = sc.nextInt();
		System.out.println("키");
		double height = sc.nextDouble();
		
		System.out.println("키"+height+"인" + age +"살" + gender + name+"님 반갑습니다 ^^");
		
		
		
	}
	
	public void variablePractice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : "+(num1+num2));
		System.out.println("뺴기 결과 : "+(num1-num2));
		System.out.println("곱하기 결과 : "+(num1*num2));
		System.out.println("나누기 몫 결과 : "+(num1 / num2));
		
	}
	
	public void variablePractice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 실수");
		double num1 = sc.nextDouble();
		System.out.println("두번째 실수");
		double num2 = sc.nextDouble();
		
		System.out.println("가로 : "+num1);
		System.out.println("세로 : "+num2);
		System.out.println("면적 : "+(num1*num2));
		System.out.println("둘레 : "+((num1+num2)*2));
		
		
	}
	
	public void variablePractice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열");
		String any = sc.nextLine();
		
		char ch1 = any.charAt(0);
		char ch2 = any.charAt(1);
		char ch3 = any.charAt(2);
		
		System.out.println("첫번째 문자 :" + ch1);
		System.out.println("두번째 문자 :" + ch2);
		System.out.println("세번째 문자 :" + ch3);
		
	
	}

}
