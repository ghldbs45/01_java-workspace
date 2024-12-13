package com.kh.chap02_abstractAndInterface.part01_easy.model.vo;

public abstract/*abstract*/ class Sports {
	
	private int people;
	
	public Sports() {}
	
	public Sports(int people) {
		this.people=people;
	}
	public int getPeople() {
		return people;
	}
	public void setPeople(int people)	{
		this.people=people;
	}
	@Override
	public String toString() {
		return "People  : "	+ people;
	}
	// 추상메소드 (미완성된 메소드) 만들기
	// public void rule(); 머리부만 있고 body부가 없다고 에러남
	
	public abstract/*abstract*/ void rule();
	// 미완성된 메소드가 있다는 소리는 이 클래스도 아직 미완성 이라는 이야기
	
	// 해당 추상클래스를 상속 받는 자식에서 완성 시켜줘야함.
	
	
	
	

}
