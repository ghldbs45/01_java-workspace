package com.kh.chap03_class.run;

import java.util.Scanner;

import com.kh.chap03_class.model.vo.Product;
import com.kh.chap03_class.model.vo.person;

public class ClassRun {
	
	public static void main(String[] args) {
		
		person p = new person();
		
		System.out.println(p.getId()); // null 로 초기화됨 (아무것도 참조하고 있지 않다.)
		System.out.println(p.getAge()); // 0으로 초기화됨 (초기값 0 [double은 0.0])
		
		// 생성 후에 필드에 담긴 값을 곧바로 알아보면
		// 초기화값이 들어가있다. > JVM이 넣어둠
		
		p.setId("user01");
		p.setPwd("pwd01");
		p.setName("정회윤");
		p.setAge(20);
		p.setGender('M');
		p.setPhone("010-2453-0883");
		p.setEmail("ghldbs45@naver.com");
		
		
		System.out.println();
		System.out.println("====== 값 대입 후 ======");
		System.out.println();
		System.out.println(p.getId());
		System.out.println(p.getPwd());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		System.out.println(p.getPhone());
		System.out.println(p.getEmail());
		
		
		System.out.println();
		System.out.println("=======================================");
		System.out.println();
		
		// 1. 첫번쨰 방법 : 기본생성자로 객체 생성 후 setter 메소드 호출해서 값 대입
		
		/*
		Product p1 = new Product();
		
		p1.setpName("겔럭시");
		p1.setBrand("삼성");
		p1.setPrice(1200000);
		
		System.out.println("pName : "+p1.getpName()+ "  price : "+p1.getPrice()+"  brand : "+p1.getBrand());
		*/
		
		// 2. 두번째 방법 : 매개변수 생성자로 생성과 동시에 값 초기화
		
		Product p1 = new Product("겔럭시", 1200000, "삼성");
		Product p2 = new Product("아이폰" , 1300000 , "애플"); // 순서 꼭 지키자잉
		
	
		
		System.out.println("pName : " + p1.getpName() + "  price : "+p1.getPrice() + "  brand : " + p1.getBrand());
		System.out.println("pName : " + p2.getpName() + "  price : "+p2.getPrice() + "  brand : " + p2.getBrand());
		
		System.out.println("=== 메소드 만들고 난 후 ===");
		System.out.println(p1.information());
		System.out.println(p2.information());
		
		Product p3 = new Product();
		
		System.out.println("================================");
		System.out.println();
		System.out.println("====정회윤====");
		System.out.println("=== 상품 1 ===");
		
		p3.setpName("후루후루탕");
		p3.setPrice(1000);
		p3.setBrand("설탕덩어리과일가게");
		
		System.out.println("상품명 : "+p3.getpName());
		System.out.println("가격 : "+p3.getPrice());
		System.out.println("브랜드 : "+p3.getBrand());
		System.out.println();
		System.out.println("=== 상품 2 ===");
		
		p3.setpName("순대국밥");
		p3.setPrice(1000);
		p3.setBrand("모여라국밥충!");
		
		System.out.println("상품명 : "+p3.getpName());
		System.out.println("가격 : "+p3.getPrice());
		System.out.println("브랜드 : "+p3.getBrand());
		System.out.println();
		System.out.println("=== 상품 3 ===");
		
		p3.setpName("아이스아메리카노");
		p3.setPrice(1000);
		p3.setBrand("과다카페인");
		
		System.out.println("상품명 : "+p3.getpName());
		System.out.println("가격 : "+p3.getPrice());
		System.out.println("브랜드 : "+p3.getBrand());
		
		
		
		
		
		
		
		
	}

}
