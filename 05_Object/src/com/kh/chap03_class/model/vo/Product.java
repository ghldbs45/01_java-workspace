package com.kh.chap03_class.model.vo;

public class Product {
	
	
	/*
	 * * 필드부 (filed)
	 * 
	 * 필드 == 멤버변수 == 인스턴스 변수
	 * 
	 * [표현법]
	 * 접근제한자 자료형 변수명;
	 */
	private String pName;
	private int price;
	private String brand;
	
	/*
	 * * 생성자
	 * - 객체를 생성하기 위한 일종의 메소드
	 * 
	 * [표현법]
	 * 접근제한자 클래스명([매개변수 , 매개변수 , 매개변수 , ...]) { 
	 * 
	 * }
	 */
	
	// 기본 생성자 : jvm이 자동으로 만들어줌
	public Product() {
		
	// 매개변수 생성자
	}
	public Product(String pName,int price, String brand) {
		
			this.pName = pName;
			this.price = price;
			this.brand = brand;
			
		}
		
		
	
	
	
	
	
	
	
	
	
	
	/*
	 * 메소드부
	 * -기능을 처리하는 담당
	 * 
	 * [표현법]
	 * 접근제한자 [예약어] 반환형 메소드명(매개변수){
	 *       //기능 구현
	 * }
	 */
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	
	// 내가 생각할 때 유용할 것 같은 메소드도 자유롭게 생성가능
	
	// 모든 필드값을 다 합친 하나의 문자열을 반환해주는 메소드
	
	public String information() {
		//return pName,price,brand; 오류뜨는 이유 : return은 하나만 됨 .
		//                                      반환형도 정할 수 없음.
		return "pName : " + pName + "  price : " + price + "  brand : " + brand;
		
	}
	
	
	
	
}
