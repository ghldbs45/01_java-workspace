package com.kh.chap01_before.after.model.vo;

public class Product {

	// 세 클래스 모두 공통적으로 가지고 있는 요소들(필드 , 메소드)만을 기술
	private String brand;
	private String pCord;
	private String pName;
	private int price;

	public Product() {
	}

	public Product(String brand, String pCord, String pName, int price) {
		this.brand = brand;
		this.pCord = pCord;
		this.pName = pName;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPCord() {
		return pCord;
	}

	public void setPCord(String pCord) {
		this.pCord = pCord;
	}

	public String getsetPName() {
		return pName;
	}

	public void setPName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String information() {
		return "brand : " + brand + ", pCord : " + pCord + ", pName : " + pName + ", price:  " + price;
	}
	
	
	
}


