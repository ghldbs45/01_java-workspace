package com.kh.array;
//import java.lang.*;

import java.util.Arrays;

public class B_ArrayCopy {
	
	 public void method1() {
		 
			int[] origin = { 1, 2, 3, 4, 5 };

			System.out.println("==== 원본 배열 출력 ====");

			for (int i = 0; i < origin.length; i++) {
				System.out.print(origin[i] + " ");
			}
			System.out.println();
			// 단순하게 origin을 다시 대입시켜서 copy 배열 생성
			int[] copy = origin;
			System.out.println("=== 복사본 배열 출력 ===");
			
			for(int i =0; i<copy.length;i++) {
				System.out.print(copy[i]+" ");
			}
			
			System.out.println();
			
			copy[2] = 99;
			
			System.out.println("--------복사본 배열 값 변경 후 --------");
			
			System.out.println("==== 원본 배열 출력 ====");

			for (int i = 0; i < origin.length; i++) {
				System.out.print(origin[i] + " ");
			}
			System.out.println();
			// 단순하게 origin을 다시 대입시켜서 copy 배열 생성
			System.out.println("=== 복사본 배열 출력 ===");
			
			for(int i =0; i<copy.length;i++) {
				System.out.print(copy[i]+" ");
			}
				//copy만을 가지고 수정을 해도 원본까지 변경되어있음
				// why why why!!! 
				// 왜냐면 origin과 copy 가 같은 곳을 참조하고 있기 때문(즉, 같은 주소 값)
			System.out.println("origin 주소값 : "+ origin.hashCode());
			System.out.println("copy 주소값 : "+ copy.hashCode());
				//얕은 복사 : 주소값을 복사
				

	 }
	 		public void method2() {
	
	       //	얕은복사의 문제를 해결하기 위하여 깊은 복사가 
	       //	1. for문을 활용한 방법
	       //      새로운 배열을 생성한 후 반복문을 활용하여 원본 배열의 값들을 복사
	 	   
	 			
	 		int[] origin = {1,2,3,4,5};
	 		
	 		int[] copy = new int[5];
	 		
	 		copy[0] = origin[0];
	 		copy[1] = origin[1];
	 		
	 		for(int i=0;i<copy.length;i++) {
	 			copy[i] = origin[i];
	 		}
	 			
	 		for(int i = 0 ;i< copy.length; i++) {
	 			System.out.print(copy[i]+" ");
	 		}
	 		//copy 배열 수정해보기
	 		copy[2] = 99;
	 		
	 		System.out.println("--------복사본 배열 값 변경 후 --------");
			
			System.out.println("==== 원본 배열 출력 ====");

			for (int i = 0; i < origin.length; i++) {
				System.out.print(origin[i] + " ");
			}
			System.out.println();
			
			System.out.println("=== 복사본 배열 출력 ===");
			
			for(int i =0; i<copy.length;i++) {
				System.out.print(copy[i]+" ");
			}
			
			System.out.println("origin 주소값 : "+ origin.hashCode());
			System.out.println("copy 주소값 : "+ copy.hashCode());
			
	 		
	 		
}
	 		
	 		public void method3() {
	 		// 2. 새로운 배열 생성 후 system 이라는 클래스에서의 arraycopy() 메소드를 이용한 복사
	 		int[] origin = {1,2,3,4,5};
	 		int[] copy = new int[10]; // 넉넉하게 크게 생성 / 0~9 인덱스 까지 0이 담겨있음
	 		
	 		// system.arraycopy(원본배열명, 복사를 시작할 인덱스, 복사할 배열명
	 		//                  복사본 배열의 복사될 시작 인덱스)
	 		
	 		//System.arraycopy(origin,0,copy,0,5);
	 		//System.arraycopy(origin,0,copy,2,5);
	 		System.arraycopy(origin, 1, copy, 3, 3);
	 		for (int i=0;i<copy.length;i++) {
	 			System.out.print(copy[i]+" ");
	 		}
	 		
	 		System.out.println();
	 		System.out.println("origin의 주소값 : "+ origin.hashCode());
	 		System.out.println("copy의 주소값 : " +copy.hashCode());
	 			
	 		}
	 		
	 		public void method4() {
	 			// 3. Arrays 클래스에서 제공하는 copyof() 메소드 사용
	 			int[] origin = {1,2,3,4,5};
	 			//복사본 배열 = Arrays.copyof(원본배열명 , 복사할길이);
	 			
	 	        int[] copy = Arrays.copyOf(origin, 5);
	 	        
	 	        for(int i=0;i<copy.length;i++) {
	 	        	System.out.print(copy[i]+ " ");
	 	        }
	 	        
	 	        /*
	 	         * [참고]
	 	         * java.lang.Math
	 	         * java.lang.String
	 	         * java.lang.system
	 	         * = java.lang 패키지에 있는 클래스들을 쓸 때는 import를 안해도 된다.
	 	         * 
	 	         * java.util.Scanner
	 	         * java.util.Arrays
	 	         * = java.lang 이외의 클래스들은 무조건 import해야한다.
	 	         */
	 			
	 	         System.out.println("origin 주소값 : "+ origin.hashCode());
	 	         System.out.println("copy 주소값 : " +copy.hashCode());
	 		}
	 		
	 		public void method5() {
	 			// 4. clone() 메소드 이용한 복사
	 			// 인덱스 지정불가 , 크기 지정 별도로 못함
	 			int[] origin = {1,2,3,4,5};
	 			// 복사본배열 = 원본배열 . clone();
	 			int[] copy = origin.clone();
	 			
	 			for (int i=0;i<copy.length;i++) {
	 				System.out.print(copy[i]+" ");
	 			}
	 			
	 			System.out.println("origin 주소값 : "+ origin.hashCode());
	 	         System.out.println("copy 주소값 : " +copy.hashCode());
	 	         
	 	         
	 		}
}
