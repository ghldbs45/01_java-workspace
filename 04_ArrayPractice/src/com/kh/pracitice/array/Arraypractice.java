package com.kh.pracitice.array;

import java.util.Scanner;

public class Arraypractice {
	
	public void pracitce1() {
		
		int[] num = new int[11];
		
		for(int i=1;i<num.length;i++) {
			num[i]=i;
		}
		for(int i=1;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
	}
	
	public void pracitce2() {
		
		int[] num = new int[11];
		
		for(int i=1;i<num.length;i++) {
			num[i]=num.length-i;
		}
		for(int i=1;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
}
	
	public void pracitce3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수");
		int size = sc.nextInt();
		int[] hi = new int[size];
		
		for(int i=0;i<hi.length;i++) {
			hi[i] = size-i;
		}
		for(int i=0;i<hi.length;i++) {
			System.out.print(hi[i]);
		}
	
	}
	
	public void pracitce4() {
		
		
		String[] str1 = new String[5];
		
		str1[0] = "사과";
		str1[1] = "귤";
		str1[2] = "포도";
		str1[3] = "복숭아";
		str1[4] = "참외";
		
	   System.out.println(str1[1]);
			
		}
	
	
	public void pracitce5() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		System.out.println("찾을 문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		
		
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = str.charAt(i);
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == ch) {
			System.out.print((1+i) + " ");
			count++;
			
		}
	}
	System.out.println(ch +" 개수 "+": "+count);
	
		}
	
	public void pracitce6() {
		
		Scanner sc = new Scanner(System.in);
		String[] days = {"월","화","수","목","금","토","일"};
		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num>=0 && num<=6) {

				System.out.print(days[num]+"요일");
			
		}else {
			System.out.println("잘못 입력하셨습니다");
		}
		
		
		
		
		
	}
	
	public void pracitce7() {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		System.out.println("배열 0번째 인덱스에 넣을 값 : ");
		int first = sc.nextInt();
		
		arr[0] = first;
		
		System.out.println("배열 1번째 인덱스에 넣을 값 : ");
		int two = sc.nextInt();
		arr[1] = two;
		
		System.out.println("배열 2번째 인덱스에 넣을 값 : ");
		int three = sc.nextInt();
		arr[2] = three;
		
		System.out.println("배열 3번째 인덱스에 넣을 값 : ");
		int four = sc.nextInt();
		arr[3] = four;
		
		System.out.println("배열 4번째 인덱스에 넣을 값 : ");
		int five = sc.nextInt();
		arr[4] = five;
		
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("총 합 : "+sum);
		
	}
	
	
	public void pracitce8() {
		
		//3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		//중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		//단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		//다시 정수를 받도록 하세요.

		//ex.
		//정수 : 4
		//다시 입력하세요.
		//정수 : -6
		//다시 입력하세요.
		//정수 : 5
		//1 2 3 2 1
		
		 Scanner sc = new Scanner(System.in);
		 
		 while(true) {
		 System.out.println("3 이상인 홀수 자연수를 입력하세요 : ");
		 int num = sc.nextInt();
		 
		 if(num % 2 == 1 && num >= 0) {
			 for(int i=1;i<num;i++) {
				 System.out.print(i+" ");
			 break;
			 }	}else {
				System.out.println("잘못 입력하셨습니다");
		 }
		 
		
		 }
		 
		 
	}
	public void pracitce9() {
		
		//사용자가 입력한 값이 배열에 있는지 검색하여
		//있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		//단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		
		//ex.
		// 치킨 이름을 입력하세요 : 양념 //     치킨 이름을 입력하세요 : 불닭
		//     양념치킨 배달 가능              불닭치킨은 없는 메뉴입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("치킨 이름을 입력하세요");
		String chi = sc.nextLine();
		
		String[] chi2 = { "양념", "바베큐", "후라이드", "간장" };
		
		int count = 0;
		for (int i = 0; i < chi2.length; i++) {
			if (chi.equals(chi2[i])) {
				count++;
			} 
		}
		
		if(count > 0) {
			System.out.println(chi+"치킨 배달 가능");
			
		}else {
			System.out.println(chi+"치킨은 없는 메뉴입니다");
			
		}
		
	}
	
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력해주세요");
		String num = sc.nextLine();
		
		
		
		char[] originjoo = num.toCharArray();
		char[] joo = originjoo.clone();
		
		for(int i=8;i<joo.length;i++) {
			System.out.print("*");
		}
		for(int i=0;i<joo.length;i++) {
			System.out.print(joo[i]);
		}
		
		
		
	}
	
		
	}
	




	
	
	

