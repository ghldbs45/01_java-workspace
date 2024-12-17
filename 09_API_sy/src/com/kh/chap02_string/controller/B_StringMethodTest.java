package com.kh.chap02_string.controller;

public class B_StringMethodTest {
	
	public void method() {
		String str1 = "Hello World";
		
		// 메소드명(매개변수) : 반환형
		
		// 1. 문자열.charAt(int index) : char
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		// 2. 문자열.concat(String str) : String
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);
		
		String str3 = str1 + "!!!";
		System.out.println("str3 : " + str3);
		
		System.out.println("str2와 str3가 일치합니까 : " + (str2 == str3));
		// 근데 아까전에 StringPool 에서 같은 글자면 같은 주소값아닌가요?
		// concat 안에 new 있음 => 새로운 주소값 heap
		// str3만 StringPool에 있음
		
		// 3. 문자열.equals(Object obj) : boolean
		//    문자열과 전달된 또 다른 문자열 가지고 주소값 비교가 아닌 실제 문자열값을 가지고 동등비교 한다.
		System.out.println("str2와 str3이 일치합니까 : " + str2.equals(str3));
		
		// 4. 문자열.contains(CharSequence s) : boolean
		System.out.println("str1에 Hello 문자열이 포함돼있나요? : " + str1.contains("Hello"));
		System.out.println("str1에 bye 문자열이 포함돼있나요? : " + str1.contains("bye"));
		
		// 5. 문자열.length() : int
		System.out.println("str1의 길이 : " + str1.length());
		
		// 6. 문자열.substring(int beginIndex) : String => 문자열의 beginIndex 위치에서부터 끝까지의 문자열을 추출해서 리턴
		//    문자열.substring(int beginIndex, int endIndex) : String
		//          => 문자열의 beginIndex 위치에서부터 endIndex-1 위치까지의 문자열 추출해서 리턴
		
		
		// Hello World
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3, 7));
		
		// Hello만 추출해보기
		System.out.println(str1.substring(0, 5));
		
		// ** Quiz
		// Hello World
		// 1. Worl만 추출 + concat함수로 ! 엮어서 str0 만들기 = >Worl!
		// 2. contains 함수 이용해서 !가 포함돼있는지 여부 추출 => str0에 !가 포함돼있습니까 : true
		
		String str0 = str1.substring(6,10).concat("!");
		System.out.println(str0);
		System.out.println("str0에 !가 포함되어있나요? : " + str0.contains("!"));
		
		// 8. 문자열.toUpperCase() : String		=> 문자열을 다 대문자로 변경한 새 문자열 리턴
		//    문자열.toLowerCase() : String		=> 문자열을 다 소문자로 변경한 새 문자열 리턴
		
		String str5 = str1.toUpperCase();
		System.out.println("str5 : " + str5);
		System.out.println("Lower : " + str5.toLowerCase());
		
		/*
		 * System.out.print("계속 하시겠습니까 ? (y/n) : ");
		 * char ch = sc.nextLine().toUpperCase().charAt(0); // 메소드체이닝
		 * 
		 * sc.nextLine().charAt(0).toUpperCase() => 이거 절대아님!!
		 * 
		 * if(ch == 'Y')
		 */
		
		// 9. 문자열.trim() : String
		//    문자열의 앞 뒤 공백을 제거시킨 새 문자열 리턴
		String str6 = "     JA  VA     ";
		System.out.println("str6 : " + str6.trim());
		
		// 10. 문자열.toCharArray() : char[]
		char[] arr = str1.toCharArray();
		System.out.println(arr[1]);
		
		// 11. String.valueOf(char[] data) : String
		System.out.println(String.valueOf(arr));
		
		
		
	}
	
}








