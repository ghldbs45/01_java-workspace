package com.kh.array;

import java.util.Scanner;

public class A_Array {

	//변수 : 하나의 공간에 하나의 값을 담을 수 있음
	//배열 : 하나의 공간에 여러개의 값을 담을 수 있는 개념
	//      "같은 자료형의 값" 으로만 담을 수 있음
	// 정확히 얘기하자면 배열의 각 인덱스 자리에 실제 값이 담김(인덱스는 0부터 시작)
	
	public void method1() {
		
		// * 배열을 왜 쓰는지 ? 
		
		// 변수라는 것만을 이용하게 되면
		
		
		// 출력하고자 할 때 도 > 일일히 출력해야함 ( 반복문 활용 불가 )
		//int num1 = 0,1,2,3,4;
		//int num1 = 0;
		//int num2 = 1;
		//int num3 = 2;
		//int num.... = .....;
		// 총합을 구할 때도 일일이 더 해줘야함
		
		/*
		 * 1. 배열 선언 ( 여러개의 값을 보관할 배열을 만들겠다 )
		 * [표현법]
		 * 자료형 배열명[];
		 * 자료형[] 배열명; > 보편적으로 이걸 사용
		 * 
		 */
		 //int[] arr; // 오로지 int 값만을 담을 수 있다.
		
		/*
		 *  2. 배열 할당( 이 배열에 몇 개의 값들을 보관할건지 크기를 지정하는 과정 )
		 *             그 개수만큼 방이 만들어진다.
		 *     
		 *     배열명 = new 자료형[배열의 크기];
		 *  
		 */
		
		 //arr = new int[5];
		
		 //** 배열 선언과 동시에 할당 ( 배열 만듦과 동시에 크기까지 지정)
		
		int[] arr = new int[5];
		
		/*
		 *  3. 값 대입
		 *  배열명[인덱스] = 값;
		 */
		
		/*
		 * 이거 반복문으로 써보는거 어떨까
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		
		//배열의 장점 : 반복문 가능
		for (int i=0;i<=4;i++) { // 0 1 2 3 4 
			arr[i] = i;
		}
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
		
		for(int i=0; i<=4;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println(arr); // 실제 arr이라는 박스에 "주소값" 이라는게 담겨있음
		}
	
	public void method2() {
		
		// 배열 선언과 동시에 할당
		
		int[] iArr = new int[5];
		
		System.out.println(iArr[1]);
		
		double[] dArr = new double[3];
		
		System.out.println(dArr[1]);
		
		/*
		 * * 실제 값(리터럴)을 곧바로 담을 수 있는 변수를 일반 변수라고 얘기하고
		 *   주소값을 담고 있는 변수는 참조변수(레퍼런스) 라고 
		 *   
		 *   기본자료형 (boolean , char , byte , short , int , long, float , double)
		 *           으로 선언된 변수 
		 *         > 실제 리터럴값을 바로 담는 변수 > 그냥 일반 변수
		 *         
		 *   참조자료형 (int[],double[],char[],short[] 이런 배열자료형, String...) 
		 *           으로 선언된 변수
		 *           >주소값을 담는 변수 > 참조변수(레퍼런스 변수)        
		 *          
		 */
		
		
		
		
		
		
		
	}
	
	public void method3() {
		
		int[] iArr = new int[3]; // 0번 인덱스 ~ 2번 인덱스 
		double[] dArr = new double[4]; // 0번 인덱스 ~ 3번 인덱스
		// 배열 선언하고 크기할당까지만 한 상태
		// 그럼 각각의 인덱스에 초기화가 되어있을까?
		
		//각각의 인덱스에 값을 담지않았지만 출력해보기
		
		for(int i=0;i<3;i++) { // 000
			System.out.println(iArr[i]);
		}
		System.out.println("============");
		for(int i=0;i<4;i++) { // 0.0 0.0 0.0 0.0
			System.out.println(dArr[i]);
		}
		
		//내가 각 인덱스에 초기화를 하지 않아도 값들이 담겨있음. 왜일까?
		//Heap이라는 공간에 절대 빈 공간이 존재할 수 없음
		// > 따라서 공간이 만들어질때 JVM(자바버츄얼머신)이 기본적으로 초기화(값을넣어주는 대입작업)을 진행함
		
		
		
		
	}
	
	public void method4() {
		
		int[] arr = new int[5];
		/*
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		*/
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(arr); // [I@626b2d4a 배열의자료형 + @ + 주소값의 16진수 형태 
		System.out.println(arr.hashCode()); // 1651191114 주소값의 10진수 형태
		System.out.println("배열의 길이 : " + arr.length); // 배열의길이를 확인하는법
		
		// 배열 크기 변경 요청 > 불가능 > 새로 만들어야 함 => 단점

	}
	
	public void method5() {
		// 배열 쓰면서 볼 수 있는 오류들 모음
		
		//int[] arr; // 크기할당 까먹음
		//System.out.println(arr); 초기화가 안되어있음 > 오류
		
		int[] arr = null; // 아무것도 참조하고 있지 않음.
		// 주소값을 담는 변수의 기본값은 null임
		
		System.out.println(arr); // null
		//System.out.println(arr.hashCode()); // 오류
		//System.out.println(arr.length); // 오류
		//System.out.println(arr[0]); // 오류
		//Null을 가지고 어떤 메소드를 호출한다거나  .을 찍어서 접근하려 한다면
		//항상 오류발생  > NullPointerException
		

	}
	public void method6() {
		
		/*
		 * arr[0] =2;
		 * arr[1] =4;
		 * arr[2] =6;
		 * arr[3] =8;
		 * arr[4] =10;
		 */
		
		int[] arr = new int[5];
		/*

		for (int i = 0; i <= arr.length; i++) { // 0 1 2 3 4
			arr[i] = 2 * (i + 1);
		}
		*/
		
		//int value = 2;
		//for (int i = 0; i <= arr.length; i++) {
		//	arr[i] = value;
		//	value +=2;
		//}
		
		//for(int i = 0; i < arr.length; i++) { 
		//	System.out.println(arr[i]);
		
		System.out.println("arr의 해쉬코드 값: " + arr.hashCode());
		System.out.println("arr의 길이 : " + arr.length);
		
		/*
		 * java.lang.ArrayIndexOutOfBoundsException : 배열에 부적절한 인덱스 제시시 발생
		 * arr[5] = 12;
		 */
		
		
		
		}
	
	public void method7() {
		int[] arr1 = new int[] {1,2,3,4};
		
		int[] arr2= {1,2,3,4};
		
		System.out.println(arr1 == arr2); // false 
		//각각의 변수에 담겨있는 주소값을 비교하기 때문
	}
	
	public void method8() {
		
		//1. 크기 10짜리 정수 배열 생성
		int[] arr = new int[10];
				
		//2. 반복문 활용해서 0번 인덱스 ~ 마지막 인덱스 까지 순차적으로 접근 하면서 값을 대입
		//   매번 1~100 사이에 발생되는 랜덤값
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100+1);
		}
		//3. 반복문을 화룡해서 해당 배열의 0번 인덱스 ~ 마지막 인덱스까지 담겨있는 값 출력
		//   arr[x] : xx 형식으로 출력
		for(int i=0;i<arr.length;i++) {
			System.out.println("Arr["+i+"] : " + arr[i]);
		}
	}
	
		
	
   public void method9() {
	   
	   //1.사용자에게 배열의 길이를 입력 받은 후
	   // 해당 그 크기만큼의 문자열 배열 생성
	   
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println(" 배열의 길이 : ");
	   int size = sc.nextInt();
	   
	   sc.nextLine();
	   
	   String[] arr = new String[size];
	   
	   // 2. 반복문 활용해서 매번 사용자에게 과일명을 입력 받아 
	   //    그 값을 매 인덱스자리에 대입 ( 0번 ~ 마지막 인덱스)
	   
	   for (int i=0;i<arr.length;i++) {
		   System.out.println("좋아하는 과일명 입력 : ");
		   arr[i] = sc.nextLine();
	   // 3. 반복문을 활용해서 0~마지막 인덱스까지 담긴 값 출력 
		}
	   for (int i=0; i<arr.length; i++) {
		   System.out.println("arr ["+i+"] : "+arr[i]);
		
   }
   }
	public void method10() {
		//사용자에게 문자열 하나 입력 받은 후
		// 각각의 인덱스에 있는 문자들을 char 배열에 옮겨담기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.print("찾고자 하는 문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		
		// 2. char 배열 생성해두기
		char[] arr = new char[str.length()];
		
		// 3. 반복문 활용해서 해당 문자열에서 각 인덱스별 문자를 char 배열의 각 인덱스 대입
		/*
		 * arr[0] = str.charAt(0);
		 * arr[1] = str.charAt(1);
		 * arr[2] = str.charAt(2);
		 * 
		 */
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = str.charAt(i);
		}
		// 4. 반복문 활용해서 해당 배열의 0~ 마지막 인덱스까지 담긴 값 출력
		int count = 0; // 일치하는 문자가 존재할 경우 매번 1씩 증가
		for(int i=0;i<arr.length;i++) {
			if(ch == arr[i]) { // 일치!!
				count++;
			}
			System.out.println("arr ["+i+"] : "+arr[i]);
			
		}
		System.out.println("찾아진 문자 개수 : " + count);
	}
	
	public void method11() {
		
		// 사용자에게 배열의 길이 입력 받아서 그 크기만큼의 정수 배열 생성
		// 반복문 활용해서 0~마지막 인덱스까지 매번 1~100 사이의 랜덤값 발생시켜 대입
		// 반복문 활용해서 0~마지막 인덱스까지 출력과 동시에
		// 해당 그 인덱스에 담긴 값이 짝수인 값들의 총합도 같이 구하기!!
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 배열의 길이 : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);

		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count += arr[i];
			}
			System.out.println("arr [" + i + "] : " + arr[i]);
		}
		System.out.println("짝수 개수 : " + count);
	}

	public void method12() {
		
		
		

	}
}

