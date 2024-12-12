package com.kh.chap03_override.model.vo;

public class Book /* extends Object */ {
	
	private String title;
	private String author;
	private int price;
	
	public Book() {}
	
	public Book(String title , String author , int price) {
		this.title= title;
		this.author = author;
		this.price = price;
	}
	public String getTitle () {
		return title;
	}

	public void setTitle(String title) {
		this.title =title ;
	}
	public String getAuthor() {
		return author;
	}

	public void setAuthor (String author) {
		this.author = author ;
	}
	public int getPrice() {
		return price;
	}

	public void setPrice (int price) {
		this.price =price ;
	}
	
	public String information() {
		return "title = " + title + ", author = "+author+", price = "+price;
	}
	
	/*
	 * 
	 * 오버라이딩
	 * 자식클래스가 상속받고 있는 부모클래스의 메소드를 재정의(재작성) 하는 것
	 * 부모가 제공하는 메소드를 자식이 일부 고쳐서 사용하겠다는 의미
	 * 자식 객체를 통해 메소드 실행시 자식 메소드가 우선권 가짐
	 * 
	 * 오버라이딩 성립조건
	 * 부모 메소드명 통일  (부모클래스 - toString이면 자식클래스도 toString 여야 가능)
	 * 매개변수 개수 , 자료형 , 순서동일 (매개변수명은 상관 없음)
	 * 부모 메소드의 반환형도 같아야 한다 
	 * 부모 메소드의 접근제한자가 범위가 같거나 커야한다. 
	 *   ex) 부모메소드의 접근제한자 protected일 경우 , 오버라이딩 메소드의 접근제한자는
	 *       protected 이거나 public 만 가능.
	 *  >>>>>>>>>>>> 규약의 개념이 있음 (오버라이딩으로 재정의를 할 때에 최소한 지켜야할 룰
	 * 
	 * @Override 어노테이션
	 * 생략 가능함 , 크게 사관없음 (굳이 명시 하지 않아도 오버라이딩을 한 상태)
	 * >> 부모 메소드명이나 매개변수가 수정 됐을 경우에 알아보기 쉽다.
	 *    자식 메소드 기술시 오타가 있을 경우 => 알아보기 쉽다.
	 * >> 이 메소드가 오버라이딩 메소드라고 알려주기 위함
	 */
	@Override
	public String toString() {
		return "title = " + title + ", author = "+author+", price = "+price;
	}

}
