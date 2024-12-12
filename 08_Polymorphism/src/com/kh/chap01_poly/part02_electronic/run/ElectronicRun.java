package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicShop1;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//실행용 클래스는 납품업체라고 생각
		
		ElectronicShop1 es = new ElectronicShop1();
		// es에서 마련해놓은 desk , note , tap 이라는 필드에다가
		// 객체를 생성해서 넣어줄건데 우선 es 객체 생성
		// es를 만드는 순간 해당 클래스에 제시된 3가지의 필드가 메모리에 할당됨
		
		// 메소드를 써서 생성하겠음
		// 추가용 메소드 > insert (추가용메소드로 주로 사용)
		// 데스크탑 이라는 객체를 생성해서 용산전자상가(es)로 보내는 메소드
		
		es.insert(new Desktop("samsung", "데땁", 1200000, "gtx-1070"));
		es.insert(new NoteBook("LG", "그램", 2000000, 4));
		es.insert(new Tablet("Apple", "아이패드", 800000, false));
		
		// 해당 객체들이 잘 생성이 되어있는지 궁금하다!!!!!!! 확인해보자
		// 조회용 메소드 > select(조회 메소드로 주로사용)
		Desktop d = es.selectDesktop();
		NoteBook n = es.selectNoteBook();
		Tablet t = es.selectTablet();
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		
		
		
		
	}

}

