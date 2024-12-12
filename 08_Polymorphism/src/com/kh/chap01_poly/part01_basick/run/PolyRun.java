package com.kh.chap01_poly.part01_basick.run;

import com.kh.chap01_poly.part01_basick.model.vo.Child1;
import com.kh.chap01_poly.part01_basick.model.vo.Child2;
import com.kh.chap01_poly.part01_basick.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {
		// 기억해둘것 '=' 기준으로 해서 왼쪽과 오른쪽의 자료형(타입)은 같아야함

		System.out.println("1 . 부모타입 레퍼런스로 부모객체를 다루는 경우");
		Parent p1 = new Parent();
		p1.printParent();
		// p1 레퍼런스가 parent 일때만 접근 가능 !

		System.out.println("2 . 자식타입 레퍼런스로");
		Child1 c1 = new Child1();
		c1.printChild1();
		((Parent) (c1)).printParent();
		// c1이 가지고 있는 child1 이라는 레퍼런스로
		// child1 도 접근가능 , Parent도 접근 가능
		// Parent 접근시 자동으로 형변환 된 채로 진행된거임

		System.out.println("3. 부모타입 레퍼런스로 자식객체를 다루는 경우(다형성)");
		Parent p2 = /* (parent) */ new Child1(); // > 자료형이 다르다 근데 왜 에러가 안뜨지 ?
		// >> 컴퓨터가 자동 형변환을 해줬음
		p2.printParent();
		// p2.printChild1();
		((Child1) p2).printChild1(); // 강제형변환을 하면 호출은 가능 !!!!!

		// p2 레퍼런스로 지금 당장은 Parent에만 접근 가능하지만
		// Child1 에 접근하고자 한다면 강제형변환을 하면 접근은 가능!!

		/*
		 * 상속 구조의 클래스들 간에는 형변환 가능!!
		 * 
		 * 1. UpCasting 자식타입 > 부모타입으로 형변환 자동형변환 ex) 자식.부모메소드(); // 2. 자식타입 레퍼런스 부모 =
		 * 자식객체; // 3. 부모타입 레퍼런스로 자식객체 다루는경우
		 * 
		 * 2. DownCasting 부모타입 > 자식타입으로 형변환 강제형변환 ex) ((자식)부모).자식메소드();
		 */

		// String str = (String)new Child(); 상속구조 아니면 안된다.

		// 다형성 정의
		// - 부모타입으로 부터 파생된 여러가지 타입의 자식객체들을 부모클래스 타입
		// 하나라도 다룰 수 있다.

		// 다형성을 쓰는 목적(장점)

		// 다형성을 배우기 전 ....
		// Child1 객체 배열 만듬 + Child2 객체 배열 만듦
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(2, 3, 5);

		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(2, 1, 5);
		arr2[1] = new Child2(5, 7, 2);

		// ==============================================
		// 다형성을 배운 후 ....
		// Parent 객체 배열 1개만 만듦
		Parent[] arr = new Parent[4];
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(2, 1, 5);
		arr[2] = new Child2(5, 7, 2);
		arr[3] = new Child1(2, 3, 5);
		// 하나의 부모타입만으로 여러 자식 객체들을 받을 수 있다 >>>> 편의성 Good 코드길이 DOWN!!!
		System.out.println("===================================");
		// arr[0].printChild1(); 불가불가
		((Child1) arr[0]).printChild1(); // 가능가능

		// ((Child1)arr1[2]).printChild1(); 속였으니까 실행은 되지만 ClassCastException
		// 조치방법 부적절한 형변환이다.
		((Child2) arr[2]).printChild2();

		((Child1) arr[3]).printChild1();

		System.out.println("============ 반복문을 이용하여 출력 ===========");
		for (int i = 0; i < arr.length; i++) {

			/*
			 * instanceof 연산자 > 연산결과 true / false 로 반환 현재 레퍼런스가 실질적으로 어떤 클래스로 만들어졌는지를 확인해주는
			 * 연산자
			 */

			if (arr[i] instanceof Child1) { // 해당 레퍼런스(주소값을 갖고있는 객체)
											// 실제 Child1 참조하고있다면 true / False
				((Child1) arr[i]).printChild1();
			} else {
				((Child2) arr[i]).printChild2();
			}
		}
		
		System.out.println("=================================");
		Parent pp = new Child1();
		pp.print();
		
		
		/*
		 * 동적 바인딩 : 프로그램이 실행되기 전에는 컴파일되면서 정적바인딩
		 *            단 , 실질적으로 참조하는 자식클래스에 해당 메소드가 오버라이딩이 되어있다면
		 *            프로그램이 실행시 동적으로 그 자식클래스의 메소드를 찾아서 실행함.
		 *            (자식 이기는 부모 없다!!!!)
		 */
		
		for(int i=0; i < arr.length;i++) {
			arr[i].print();
		}
		
		

	}

}
