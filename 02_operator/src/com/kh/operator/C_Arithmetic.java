package com.kh.operator;

public class C_Arithmetic {
/*
 * * 산술 연산자 (이항 연산자 == 두개의 값을 가지고 연산)
 * + - *  /  %(나머지를 구하는)
 */
public void method1() {
	
	int num1 = 10;
	int num2 = 3;
	
	//System.out.println("num1 + num2 =" + num1 + num2); 103이 나옴
	System.out.println("num1 + num2 =" + (num1 + num2)); //13
	System.out.println("num1 - num2 =" + (num1 - num2)); 
	System.out.println("num1 * num2 =" + (num1 * num2)); // 곱셈 연산은 우선순위가 가능 하지만 가독성을 위해서 ()
	System.out.println("num1 / num2 =" + (num1 / num2)); // 나누기 했을 떄 몫
	System.out.println("num1 % num2 =" + (num1 % num2)); // 나머지 값
	
	// 값 % 2 == 0 (짝수와 같다는 말)
	// 값 % 2 == 1 (홀수와 같다는 말)
	
	// 값 % 5 == 0 (5의 배수라는 말)
	// 값 % 3 == 0 (3의 배수라는 말)
	
	
	
	
}

public void quiz1(){
    int a = 5;
    int b = 10;
    int c = (++a) + b; 
    int d = c / a;   
    int e = c % a;   
    int f = e++;   
    int g = (--b) + (d--);
    int h = 2; 
    int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
 
 
    System.out.println("a : " + a); 
    System.out.println("b : " + b); 
    System.out.println("c : " + c);   
    System.out.println("d : " + d);   
    System.out.println("e : " + e);   
    System.out.println("f : " + f);   
    System.out.println("g : " + g);   
    System.out.println("h : " + h);   
    System.out.println("i : " + i);   
 }


}
