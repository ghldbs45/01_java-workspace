package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicShop1;
import com.kh.chap01_poly.part02_electronic.controller.ElectronicShop2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//실행용 클래스는 납품업체라고 생각
		
		ElectronicShop1 es = new ElectronicShop1();
		// es에서 마련해놓은 desk , note , tap 이라는 필드에다가
		// 객체를 생성해서 넣어줄건데 우선 es 객체 생성
		// es를 만드는 순간 해당 클래스에 제시된 3가지의 필드가 메모리에 할당됨
		
		// 메소드를 써서 생성하겠음
		// 추가용 메소드 > insert (추가용메소드로 주로 사용)
		// 데스크탑 이라는 객체를 생성해서 용산전자상가(es)로 보내는 메소드
		es.insert(new Desktop("samsung", "짱짱데스크탑", 1200000, "gtx-1070"));
		// 노트북 이라는 객체를 생성해서 넘기는 메소드
		// es.insert(new 노트북이라는 객체);
		es.insert(new NoteBook("LG", "그램", 2000000, 4));
		// 태블릿 이라는 객체를 생성해서 넘기는 메소드
		es.insert(new Tablet("Apple", "아이패드", 800000, false));
		
		// 해당 객체들이 잘 생성이 되어있는지 궁금하다!!!!!!! 확인해보자
		// 조회용 메소드 > select(조회 메소드로 주로사용)
		Desktop d = es.selectDesktop();
		NoteBook n = es.selectNoteBook();
		Tablet t = es.selectTablet();
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		
		// toString 이라는 메소드를 이미 오버라이딩 했기 때문에
		// 주소값이 아니라 출력문이 나온다
		*/
		
		
		
		// 필드 공간을 메모리상에 만드려면 생성을 먼저 해줘야함
		ElectronicShop2 es = new ElectronicShop2();
		
		// 추가용 메소드 > insert
		
		es.insert(new Desktop("samsung", "짱짱데스크탑", 1200000, "gtx1080"));
		es.insert(new NoteBook("LG", "그램", 2000000, 4));
		es.insert(new Tablet("apple", "아이패드", 800000, false));
		
		/*
		Desktop d = (Desktop)es.select(0);
		NoteBook n =(NoteBook)es.select(1);
		Tablet t = (Tablet)es.select(2);
		*/
		
		Electronic d = es.select[0];
		Electronic n = es.select[1];
		Electronic t = es.select[2];
		
		// toString() 할때 부모에 있는 toString()을 불러오지 않을까 ?
		// 아니다 > 동적 바인딩 때문에.
		
		/*
		 * 다형성을 사용하는 이유
		 * 1. 부모타입 배열로 다양한 자식객체를 받을 수 있음
		 * 2. 메소드 만들때 매개변수로 다형성을 적용하게 되면 메소드의 개수가 확~_~ 줄어든다.
		 * 3. 필수로 써야하는 곳이 있음.  > 추상클래스(인터페이스)
		 * 4.                        (클래스를 '추상화'한것)
		 * 
		 */
		
		
	}

}

