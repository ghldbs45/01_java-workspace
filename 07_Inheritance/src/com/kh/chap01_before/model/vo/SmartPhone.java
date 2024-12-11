package com.kh.chap01_before.model.vo;

public class SmartPhone {

	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private String mobileAgency;

	public SmartPhone() {
	}

	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobileAgency = mobileAgency;
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

	public String setMobileAgency() {
		return mobileAgency;
	}

	public void getMobileAgnecy(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	public String information() {
		return brand + " , " + pCode + " , " + pName + " , " + price + " , " + mobileAgency;

	}
}
