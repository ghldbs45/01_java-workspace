package com.kh.chap01_before.model.vo;

public class Desktop {

	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private boolean allinOne;

	public Desktop() {
	}

	public Desktop(String brand, String pCode, String pName, int price, boolean allinOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allinOne = allinOne;
	}

	public String setBrand() {
		return brand;
	}

	public void getBrand(String brand) {
		this.brand = brand;
	}

	public String setPCode() {
		return pCode;
	}

	public void getPCode(String pCode) {
		this.pCode = pCode;
	}

	public String pName() {
		return pName;
	}

	public void getPName(String pName) {
		this.pName = pName;
	}

	public int setPrice() {
		return price;
	}

	public void getPrice(int price) {
		this.price = price;
	}

	public boolean isAllinOne() { // boolean 타입은 set메소드명이 아니라 is메소드명 . 기억해두자
		return allinOne;
	}

	public void setAllinOne(boolean allinOne) {
		this.allinOne = allinOne;
	}

	public String information() {
		return brand + " , " + pCode + " , " + pName + " , " + price + " , " + allinOne;
	}

}
