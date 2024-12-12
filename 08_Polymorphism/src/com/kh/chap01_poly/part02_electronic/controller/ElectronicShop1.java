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
	
	public void insert(Desktop d) { // Desktop d = new Desktop("samsung", "데땁", 1200000, "gtx-1070")
		desk = d;					
	}
	
	public void insert(NoteBook n) { //NoteBook n = new NoteBook("LG", "그램", 2000000, 4)
		note = n;
	}
	
	public void insert(Tablet t) { // Tablet t = "Apple", "아이패드", 800000, false)
		tab = t;
	}
	
	// 동일한 클래스에 동일한 메소드명으로 여러개 만들어져 있는 것
	// >>> 오버로딩 
	// 단 , 매개변수 종류가 달라야 가능합니데이
	
	public Desktop selectDesktop() {
		return desk;
	}
	public NoteBook selectNoteBook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
	

}
