package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controller.NonStaticMethod;
import com.kh.chap06_method.controller.StaticMethod;

public class MethodRun {

	public static void main(String[] args) {
		
		// --------------- NonStaticMethod -----------------
		NonStaticMethod m1 = new NonStaticMethod();
		m1.method1();
		
		// 2. 매개변수 없고 반환값은 있는 메소드 호출
		m1.method2();
		
		//3. 매개변수 있고 반환값은 없는 메소드
		m1.method3(0,0);
		m1.method3(10, 5);
		
		//4. 매개변수 있고 반환값도 있는 메소드
		//char ch = m1.method4("lemon", 1);
		
		//System.out.println(ch);
		//m1.method4("lemon", 1);
		
		// ------------------------Static Method--------------------------------
		StaticMethod.method1();
		StaticMethod.method2();
		
		System.out.println(StaticMethod.method2());
	}

}
