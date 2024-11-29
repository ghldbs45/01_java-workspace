package com.kh.variable;

public class C_Printf {

	public void printfTest() {
		
		// System.out.print(출력 하고자 하는 값); // 출력만 함 (줄바꿈 발생되지않는다)
		// System.out.println(출력 하고자 하는 값); 한칸 엔터 //출력 후 줄바꿈 발생
		
		// System.out.printf("출력하고자 하는 형식(포맷)",출력하고자 하는 값) ;
		// 출력하고자 하는 값들이 제시한 형식에 맞춰서 출력만 진행(줄바꿈 발생 x )
		
		/*
		 * 포맷 안에서 쓰일 수 있는 키워드
		 * %d : 정수
		 * %c : 문자 
		 * %s : 문자열(문자도 가능)
		 * %f : 실수
		 */
		
		// 출력문 메소드 : sysout  >>> ctrl + space
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		//"10 20"
		System.out.println(iNum1+ " " + iNum2);
		System.out.printf("%d %d",iNum1,iNum2); // 줄바꿈 안된다
		System.out.println(); // 줄바꿈 하고 싶으면 이걸 쓰자!!
		System.out.printf("%d %d%%",iNum1,iNum2);
		System.out.println();
		
		//System.out.printf("%d %d",iNum1 ); 이건 오류코드
		System.out.printf("%d %d",iNum1,iNum2,30); // 오류는 안남 . 공백이후의 값은 무시
		
		System.out.println();
		
		System.out.printf("%5d\n",iNum1); // 양수 5 오른쪽 정렬
		System.out.printf("%-5d\n",iNum1); // 음수 5 왼쪽 정렬
		
		// 정렬하고 할때 사용함 
		
		System.out.printf("%5d\n",250);
		System.out.printf("%5d\n",3000);
		System.out.printf("%5d\n",16);
		
		Double dNum1 = 1.23456789;
		Double dNum2 = 4.53;
		
		
		System.out.printf("%f\t %f\n",dNum1 ,dNum2); // 무조건 소수점 아래 6자리 보여줌
		System.out.printf("%.2f %.3f\n",dNum1,dNum2); 
		
		char ch='a';
		
		String str = "Hello";
		
		System.out.printf("%c %s %s\n",ch,str,ch);
		
		String name = "회윤";
		int age = 30;
		String address = "구디";
		Double height = 173.00345455;
		System.out.printf("%s님은 %d살이며, 사는곳은 %s 이고,키는%.1fcm 입니다.\n" ,name,age,address,height);
			
	}
}
		
