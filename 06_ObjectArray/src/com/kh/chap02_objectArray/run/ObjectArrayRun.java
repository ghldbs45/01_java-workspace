package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		
		int[] arr = new int[3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		Phone[] phones = new Phone[3];
		
		//System.out.println(phones);
		//[Lcom.kh.chap02_objectArray.model.vo.Phone;@515f550a
		
		//System.out.println(phones[0]);
		//null
		
		//phones[0].setName("아이폰");
		// 오류. 각각의 인덱스가 생성이 되어야 하는데 생성이 되질 않았음.
		
		phones[0] = new Phone(); // 
		phones[1] = new Phone("아이폰", "애플", 1300000, "아이폰 16");
		phones[2] = new Phone("겔럭시", "삼성", 1100000, "겔럭시S24");
		
		phones[0].setName("벨벳폰");
		phones[0].setBrand("LG");
		phones[0].setPrice(1000000);
		phones[0].setSeries("1시리즈");
		
		
		
		int total = 0;
		for(int i=0;i<phones.length;i++) {
			System.out.println(phones[i].information());
			total += phones[i].getPrice();
		}
		
		System.out.println("총 가격 : "+total);
		System.out.println("평균 가격 : "+ total / phones.length);
		
		// 사용자에게 구매하고자 하는 핸드폰명을 입력받으세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구매하고자 하는 휴대폰 입력 : ");
		String find = sc.nextLine();
		
		for(int i=0;i<phones.length;i++) {
			if(find.equals(phones[i].getName())) {
				System.out.println("당신이 구매하고자 하는 휴대폰의 가격은 " + phones[i].getPrice()+ " 입니다 ");
				break; // 찾으셨으면 for문을 나오시면 되겠습니다 손님.
			}
		}
		
		
		

			
			
		
		
	}

}
