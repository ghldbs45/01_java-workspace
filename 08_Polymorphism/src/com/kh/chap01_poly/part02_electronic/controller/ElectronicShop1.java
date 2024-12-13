package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

//다형성 적용 안했을 때의 클래스                     'v'b
public class ElectronicShop1 {
	
	//용산 전자상가에 있는 가게
	
	// 3개 제품을 마련할 자리부터 만들자
	
	private Desktop desk; //내가 만든 자료형
	private NoteBook note;
	private Tablet tab; // 아직은 객체 생성은 안되고 텅 비어있음
	                    // (자리만 생성되었음)
	
	//반환값을 모르겠으면 일단 void로 짜자
	// public void insert (자료형 변수명){}
	public void insert(Desktop d) {
		desk = d;
	//내가 넘겨받은 데스크탑 객체를 파란필드인 desk에 넣겠다
	}
	public void insert(NoteBook n) {
		note = n;
	//내가 넘겨받은 노트북 객페를 파란필드인 note에 넣겠다
	}
	public void insert(Tablet t) {
		tab = t;
	//내가 넘겨받은 태블릿 객체를 파란필드인 tab에 넣겠다
	//동일한 클래스에 동일한 메소드명으로 여러개 만듦 > 오버로딩
		// 단 , 매개변수 종류가 달라야함
		
		
	// 조회
	// 반환형 모르겠으면 일단 void 드가자
	
	}
	public Desktop selectDesktop() {
		return desk;
	}
	public NoteBook selectNoteBook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
	
	//insert 처럼 select도 같은 이름으로 하면 안되는 이유는?
	//매개변수가 없기 때문에 불가능함. > 오류남
	
	// 다형성 적용 전 
	// 메소드 6개
	// 다형성 적용하면 메소드가 2개 ~ 3개로 줄이기 가능함
	

}
