package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicShop2 {
	
	// 다형성 개념을 적용 했을 때 !_!
	
	// 다형성 : 부모타입 레퍼런스 하나로 다양한 자식 객체를 담을 수 있음 
	
	// 부모 : Electronic
	// 자식 : Desktop , NoteBook , Tablet
	
	// Parent [] arr = new Parent[4];
	// Parent 타입 
	// arr[0] = new Child1(1,2,4);
	// arr[1] = new Child2(4,5,6);
	
	// 부모타입 배열로 모든 자식 객체 다루기
	
	private Electronic[] elec = new Electronic[3];
	private int count = 0; // 캡슐화 ㄲ꼬꼬꼬꼮꼬꼬꼬ㅗ꼬꼬꼬꼬ㅗ꼬ㅗ꼮 해야함
	private int index = 0;
	// insert 함수 구현
	// 매개변수 > Desktop , NoteBook , Tablet 전부 다 받아야함
	// 이걸 다 받을 수 있는 부모 Electronic 으로 생성
	
	public void insert(Electronic ele) {
		//elec[?] = ele;
		//	elec[count++] = ele;
		// 맨처음 처음 > count : 0 이었을 경우
			
	    // es.insert(new Desktop("samsung", "짱짱데스크탑", 1200000, "gtx1080"));
		// Electronic ele = es.insert(new Desktop("samsung", "짱짱데스크탑", 1200000, "gtx1080"));
		// elec[0] = ele;
			
		// 그 다음 > count : 1 로 올라가면서
		// 값을 주었던 
		// es.insert(new NoteBook("LG", "그램", 2000000, 4));
		// Electronic ele = es.insert(new NoteBook("LG", "그램", 2000000, 4));
		// elec[1] = ele;
			
		// 그 다음 > count : 2 로 올라가면서
		// 값을 주었던
		// es.insert(new Tablet("apple", "아이패드", 800000, false));
		// Electronic ele = es.insert(new Tablet("apple", "아이패드", 800000, false));
		// elec[2] = ele;
			
			
			//조회용 메소드
		/*	
		public Electronic Select(자료형 변수명) {
			// elec 배열에 있는 값들을 출력해야함.
			// 사용자가 원하는 인덱스를 받아와야함
			return  elec[??]
		*/
	}
		public Electronic select(int index) {
				
				return  elec[index];
			
			
		}
	}
	
	
	
	
	
	
	
	
	
	


