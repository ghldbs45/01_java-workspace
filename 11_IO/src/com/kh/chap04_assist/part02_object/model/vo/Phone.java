package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable {
	//객체 자체를 입출력 하고자 한다면 직렬화 과정 필수
	
	// Alt + shift + S > 기본 단축키 !
	
	private String name;
	private int price;
	
	public Phone() {}
	
	// alt + shift + s + o
	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	// alt + shift + s + r
	// alt + a 를 누르면 전체선택
	// alt + s 를 누르면 generate 버튼 커서
	// 엔터
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
	
	
	

}
