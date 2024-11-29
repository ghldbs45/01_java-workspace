package com.kh.variable;

import java.util.Scanner;

public class B_KeyboardInput { //클래스 시작
	
	//사용자가 키보드로 입력한 값을 받아들이는 실습
	//Scanner를 사용해서!
	
	public void inputTest1() {
		/*
		 * 키보드로 값을 입력하는 방법
		 * 즉 자바에서 java.util.Scanner 클래스를 이용하는 것이다.
		 * Scanner 클래스 내부의 메소드를 활용해서 입력을 받는 것
		 */
		
		//스캐너 클래스 생성
		//클래스명 별칭 = new 클래스명()
		
		Scanner sc = new Scanner(System.in);    //System.in은 입력 받은 값을 한글자씩 받아 들인다는 의미
		System.out.print("아무거나 입력해보세요 :"); //가이드 문구
		String message = sc.nextLine();  //String으로 메모리 저장
		
		System.out.println("입력받은 내용 :" + message);
		
		sc.close();  // 스캐너 종료
	}
	
	public void inputTest2(){
		//-- 를 입력받는다 -> 스캐너 사용
		
		Scanner sc= new Scanner(System.in);
		
		//사용자가 입력한 값을 문자열로 받아오는 메소드(next(), nextLine())
		//System.out.print("당신의 이름은 무엇입니까?");
		//System.out.println("이름:"+ name);
		// 사용자가 입력 한 값을 문자열로 받아오는 텍스트(next(), nextLine())
		// 1       3     2
		//String name = sc.next();
		// next() : 사용자가 입력한 값 중 공백이 있을 경우 공백 이전까지의 값만 읽어옴
		// 			따라서 거주지처럼 공백이 있는 데이터는 제대로 된 값을 못가져올 수도 있음.
	
				
		//String name = sc.nextLine();  //nextLine()을 사용하면 공백이 있어도 모두다 읽어옴
		//nextLine() : 을 사용하면 공백이 있어도 모두다 읽어옴 (엔터치기 전까지)
		
		
		
		System.out.print("당신의 이름은 무엇입니까?");
		String name = sc.nextLine();
		System.out.print("당신의 나이는 몇살 입니까? :");
		int age = sc.nextInt();
		System.out.print("당신의 키는 몇cm 입니까? : (소수점 첫쨰 자리까지)");
		double height = sc.nextDouble();
		
		System.out.print(name+"님은" + age + "살이며, 키는" + height + "입니다."); //xxx님은 xx살이며, 키는 xxx.xx입니다.
		sc.close();  
		
	}
	//키보드로 값을 입력 받을때 종종 발생되는 문제
	
	public void inputTest3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 :");
		String name = sc.nextLine();
		
		System.out.print("나이 :");
		int age = sc.nextInt();
		//이부분 문제 있어보임
		
		sc.nextLine(); //엔터 전까지 가져오는 코드 =>버퍼에 남아있는 엔터 제거
		
		System.out.print("주소:");
		String address = sc.nextLine();
		
		System.out.print("키:");
		double height = sc.nextDouble();
		
		// xxx님은 xx살이며, 사는곳은 xxx이고, 키는 xxx.xcm 입니다.
		
		System.out.print(name + "님은" + "age " + "살이며, 사는곳은" + address + "이고, 키는 " + height+"cm 입니다.");
	}
	
	public void inputTest4() {
		Scanner sc = new Scanner(System.in);
		
		//문자열을 입력받을때 => sc.nextLine(), sc.ext() => 공백까지만
		//정수값을 입력 받을 때 => sc.nextInt()
		//실수값을 입력 받을 떄 => sc.nextDouble();
		
		System.out.print("이름 : ");
		
		String name = sc.nextLine();
		
		System.out.print("성별:"); // M, F
		
		//char gender = sc.nextChar(); 같은 메소드는 없음
		
		char gender = sc.nextLine().charAt(1);
		
		// 문자열.charAt(인덱스) :해당 문자열로 부터 해당 인덱스의 문자를 추출해주는 메소드 0번부터 시작   nextChar(); 은 없기에 대체하기 위해 사용함
		// ** 인덱스 : 순번 같은 존재, 단 0번부터 시작
		
		
		System.out.print("나이:");
		int age = sc.nextInt();
		
		System.out.print("키:");
		double height = sc.nextDouble();
		
		/*
		 * xxx님의 개인정보
		 * 성별 : x
		 * 나이 : xx
		 * 키 : xxx.xx
		 * 
		 */
		
		System.out.println(name + "님의 개인정보");
		System.out.println("성별 : " + gender );
		System.out.println("나이 : " + age);
		System.out.println("키 :" + height);
	
	}
	
	public void charAtTest() {
		String str = "Hello";
		
		//변수에 기록하여 출력하는 방식
		char ch = str.charAt(4);
		System.out.print(ch);
		
		// 바로 출력하는 방식
		System.out.println(str.charAt(4));
		
		//존재하지 않는 인덱스 : 오류 발생
		//System.out.println(str.charAt(12)); Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 12
	}
	
	
	
	/*
	 *  ** 정리 **
	 *  1.콘솔창에 (모니터) 출력하기 위해 : System.out.print[ln] 메소드 이용
	 *  2.콘솔창에 (키보드) 입력하기 위해 : Scanner 이용해서 (next(), nextLine(), 정수 -> nextInt(), 소수점 -> nextDouble()...)
	 *  
	 *  	>주의사항 
	 *  	1) sc.nextXXX() 메소드 뒤(nextLine() 제외)에 sc.nextLine()메소드가 와야될 경우
	 *  		sc.next() 메소드를 한번 더 써줘서 버퍼에 남아있는 '엔터'를 빼주는 과정 필수)
	 *  	2) '문자' 값을 입력 받아야 할 경우 sc.nextLine() 메소드를 통해 우선 문자열로 입력 받고 그 뒤에 .charAt(인덱스값) 메소드를 통해 문자 하나 추출 
	 */
} // 클래스 끝
