package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	
	public void method1() {
		
		/*
		String s = "안녕"; // 참조자료형
		int a = 10; // 기본자료형
		*/
		
		// 1. 생성자를 통한 문자열 생성
		String str1 = new String("hello"); // 매개변수 생성자
		String str2 = new String("hello"); // 매개변수 생성자
		
		System.out.println(str1.toString());
		System.out.println(str2);
		// String 클래스에 toString() 메소드가 이미 오버라이딩 돼있음!
		// 실제 담긴 문자열 반환하도록
		
		// 동등 비교
		System.out.println(str1 == str2); // 주소값을 비교하니까 당연히 false
		System.out.println(str1.equals(str2));
		// Object 부모 클래스 확인해보면 원래는 주소값을 동등비교하는 메소드임!
		// String 자식 클래스에 equals 메소드가 이미 오버라이딩 돼있음!
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// String 자식 클래스에 hashCode 메소드 이미 오버라이딩 돼있음!
		// 주소값이 아닌 실제 담겨있는 문자열(hello)을 가지고 해쉬코드를 만듦 
		
		// 근데 나는 주소값을 꼭 알고싶다
		// System.identityHashCode(객체);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
	}
	
	public void method2() {
		String str = new String("hello");
		
		// 2. 문자열을 리터럴값으로 생성
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println(str1); // 주소값이 담겨있지만 toString()에 의해서 나오는 것
		System.out.println(str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str1 == str2); // 엥? true임! (주소값 일치함)
		
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		String str3 = "hi";
		System.out.println(str1 == str3);
		System.out.println(System.identityHashCode(str3));
		
		// String 클래스 == 불변클래스(변하지 않는 클래스)
		// 그럼 값을 못바꾸는건가요? 그건아님...
		// 변경이 가능하긴 하나 그 자리에서 바로 수정되는 개념은 아님!!
		str3 = "bye";
		System.out.println(System.identityHashCode(str3));
		// 변경하는 순간 기존의 문자열 자리에서 변경되는 것이 아닌
		// 새로운 곳을 참조하도록 됨(새로운 주소값 부여 받음 == 주소값 변경)
		
		str3 = "hello";
		System.out.println(System.identityHashCode(str3));
	}
	
}














