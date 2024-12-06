package com.kh.chap02_encapsulation.model.vo;

// medel. vo >>>> {{vo}} v > value o > object

public class Student { // 나만의 자료형 [Student]
	
	
	// 필드부
	// 접근제한자 자료형 변수명
	private String name;
	private int age;
	private double height;
	private int korScore;
	private int mathScore;
	
	// 메소드부
	/*
	 * * 메소드
	 * [표현법]
	 * 접근제한자 [예약어] 반환형 메소드명([매개변수]) {
	 *         ... 실행할 코드
	 * }
	 * 
	 * 
	 */
	
	//public void method1(int a) { // 매개 변수 : 전달되는 변수 
		//int b = 10; // 일반 변수 
	//}
	
	
	// -- setter 메소드 
	// 해당 필드에 대입시키고자 하는 값 전달 받아 해당 필드에 대입 시켜주는 기능의 메소드
	
	/*
	public void setName(String newName) {
		//System.out.println(newName);
		//매개변수 : 해당 메소드 호출시 전달값을 받아주기 위한 변수 선언문 
		name = newName; // 색이 다름
	*/
	public void setName(String name) {
		// name = name; 색이 둘다 똑같음. 매개변수 name = 매개변수 name > has no effect
		// 필드명과 매개변수명이 동일한 시점에서는 해당 메소드 영역에서 만들어진 변수가 우선순위 더 높음
		// 필드 name = 매개변수 name ; 를 원한다면
		this.name = name; // this는 해당 객체의 주소값이 담겨있다.
		
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	// -- getter 메소드
	// 해당 필드에 담긴 값을 반환해주는 역할을 수행
	
	public String getName() {
		return name;

	}	
	public int getAge() {
		return age;
	}	
	public double getHeight() {
		return height;

	}	
	public int getKorScore() {
		return korScore;
	}	
	public int getMathScore() {
		return mathScore;
	}
}
		
	
	
 
