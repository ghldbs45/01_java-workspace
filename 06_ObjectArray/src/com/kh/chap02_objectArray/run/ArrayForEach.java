package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayForEach {

	public static void main(String[] args) {
		
		
		int[] arr = {10,20,30};
		
		// for each문 (향상된 for문 / 개선된 for문)
		// 배열 또는 컬렉션과 함께 사용됨 (컬렉션은 나중에 배운다네요~)
		// 배열 또는 컬렉션의 0번 인덱스부터 마지막 인덱스까지 순차적으로 모두 접근할 목적일 때
		
		/*
		 * [표현법]
		 * 
		 * for(순차적으로 접근할 값을 담을 변수 선언 :  순차적으로 접근할 배열명 또는 컬렉션명){
		 *             반복적으로 실행할 내용
		 * }
		 * > 반복횟수는 배열 또는 컬렉션의 크기 만큼 반..복 @_@..
		 */
		for(int value : arr) { // value = arr[0] > value = arr[1] > value = arr[2] 
			System.out.println(value);
			
		}
		
		// 객체 배열만 생성
		Phone [] phones = new Phone[3];
		
		// 객체 생성
		
		phones[0] = new Phone("겔럭시", "삼성", 1100000, "겔럭시 s 24");
		phones[1] = new Phone("아이폰", "애플", 1300000, "아이폰 16");
		phones[2] = new Phone("벨벳폰", "LG", 1000000, "1시리즈");
		
		
		
		phones[2].setPrice(800000); // 수정하고싶을땐 set~~~
		
		int total = 0;
		for(Phone p : phones) { // p=phones[0] > p = phones[1] > p = phones[2] 끝
			System.out.println(p.information());
			total += p.getPrice();
		}
		System.out.println("총 합계 : " + total);
		System.out.println("평균 값 : " + total / phones.length);
		
		// 구매하고자 하는 휴대폰 : 
		// 당신이 구매하고자 하는 휴대폰은 xx원 입니다
		
		Scanner sc = new Scanner(System.in) ; 
		
		System.out.println("구매하고자 하는 휴대폰 : ");
		String find = sc.nextLine();
		
		for(Phone p1 : phones) { 
			if(p1.getName().equals(find)) {
				System.out.println("당신이 구매하고자 하는 휴대폰은 "+p1.getPrice()+" 원입니다");
				break;
			}
		}
		

	}

}
