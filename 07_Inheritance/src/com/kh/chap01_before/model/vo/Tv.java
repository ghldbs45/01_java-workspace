package com.kh.chap01_before.model.vo;

public class Tv {

	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private int inch;

	public Tv() {
	}

	public Tv(String brand, String pCode, String pName, int price, int inch) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.inch = inch;
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

	public int setInch() {
		return inch;
	}

	public void getInch(int inch) {
		this.inch = inch;
	}

	public String information() {
		return brand + " , " + pCode + " , " + pName + " , " + price + " , " + inch;

	}
}
