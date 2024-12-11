package com.kh.chap01_before.after.model.vo;

public class Tv extends Product {

	private int inch;

	public Tv() {
	}

	public Tv(String brand, String pCode, String pName, int price, int inch) {

		super(brand, pCode, pName, price);
		this.inch = inch;
	}

	public int setInch() {
		return inch;
	}

	public void getInch(int inch) {
		this.inch = inch;
	}

	// 오버라이딩
	public String information() {
		return super.information() + ", inch : " + inch;
	}

}

