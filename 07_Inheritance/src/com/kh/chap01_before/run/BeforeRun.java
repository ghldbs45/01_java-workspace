package com.kh.chap01_before.run;

import com.kh.chap01_before.after.model.vo.Product;
import com.kh.chap01_before.model.vo.Desktop;
import com.kh.chap01_before.model.vo.SmartPhone;
import com.kh.chap01_before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {

		
		// Desktop 객체
		// brand , pCode , pName , price , allinOnce
		
		Desktop d = new Desktop("삼성", "d-01", "짱짱데스크탑", 2000000, true);
		
		// Tv 객체
		// brand , pCode , pName , price , inch
		
		Tv t = new Tv("엘지", "t-01", "겁나얇은티비", 3500000, 65);
		
		// SmartPhone 객체
		// brand , pCode , pName , price , mobileAgency
		
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰", 1300000, "케이티");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		// 유지보수 요청 :1. pName > productName 으로 바꿔주세요
		
		
		/*
		 *  세 클래스에 공통적인 필드와 메소드들이 존재함
		 *  이런 중복된 코드들을 따로 " 부모클래스 " 로 한번만 정의해두면 중복된 코드들을 줄일 수 있다.
		 *  
		 *  수정과 같은 유지보수 요청이 들어왔을때 일일히 찾아서 수정할 필요 없이
		 *  한번만 정의해둔 부모클래스만 수정하면 전체적으로 반영됨.
		 *  
		 *  세 클래스가 공통적으로 가지고 있는 것
		 *  
		 *  > brand , pCode , pName , price (네가지의 필드)
		 *  > getter / setter (메소드들)
		 *  > information ( brand , pCode , pName , price 필드 중복 )
		 *         == Product(상품)라는 부모클래스 생성
		 */
		
		
		
			
		
		
	}

}
