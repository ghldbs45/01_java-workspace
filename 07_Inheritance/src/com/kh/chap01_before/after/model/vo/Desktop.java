package com.kh.chap01_before.after.model.vo;

//            자식   extends    부모
//            후손   extends    조상
//          하위클래스 extends   상위클래스
//			  this            super
public class Desktop extends Product { 
	
	private boolean allinOne;
	
	public Desktop() {}
	
	public Desktop(String brand , String pCode , String pName , int price , boolean allinOne) {
		
		// brand ~ price 네 개의 값들은 부모클래스(Product)의 필드에 대입
		// super.으로 부모에 접근 가능
		
		//해결방법1. 부모 클래스에 있는 필드를 protected 접근 제한자로 수정
		/*
		super.brand = brand;
		super.pCord = pCode;
		super.pName = pName;
		super.price = price;
		this.allinOne = allinOne;
		*/
		
		//해결방법2. 부모클래스에 있는 setter 메소드 활용하기 (public 이기 때문에 직접접근가능)
		/*
		super.setBrand(brand);
		super.setPCord(pCode);
		super.setPName(pName);
		super.setPrice(price);
		*/
		
		//해결방법3. 부모생성자 호출하기
		// super 생성자
		super(brand, pCode, pName, price);
		this.allinOne = allinOne;
	}

	public boolean isAllinOne() {
		return allinOne;
	}

	public void setAllinOne(boolean allinOne) {
		this.allinOne = allinOne;
	}

	// 오버라이딩 : 부모클래스에 있는 메소드를 자식 클래스에서 재정의 하는 것
	public String information() {
		return super.information() + " , allinOne : " + allinOne;
	}

}
