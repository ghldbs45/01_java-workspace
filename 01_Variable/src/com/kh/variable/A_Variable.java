package com.kh.variable;

public class A_Variable {
																				
			// 한줄 주석 
	
			// 기능 : 메소드(함수)
			// 시급 : 근무시간과 근무일수 곱해서 월급을 계산해서 출력하는 메소드
			
		/*public void 메소드명() {    메소드 만드는 틀
			
		}*/

	
	
	
		public void printVariable(){
			
			System.out.println("==== 변수 사용 전 ====");
			
			System.out.println("시급 : $7.25");
			System.out.println("근무시간 : 6시간");
			System.out.println("근무일수 : 8일");
			
			//월급 = 시급 * 근무시간 *  근무일수
			
			//주몽 : $000를 받는다.
			System.out.println("주몽:"+ ""
					+ "$"+ (7.25 * 6 * 8));
			System.out.println("고두막" + "$"+ (7.25 *6 *8));
			
			
			//변수 사용 후 
			System.out.println("==== 변수 사용 후  =====");
			
			int pay = 11600; //자바에서의 = 기호는 동등하다의 뜻이 아닙니다. 자바에서의 -은 대입(값을 넣는것) 이라는 것
			int time = 7;
			int day = 8 ;
			
			
			System.out.println("주몽:"+ "$"+ (pay * time * day));
			System.out.println("고두막" + "$"+ (pay *time *day));

			/*
			 *  변수를 사용하는 이유
			 *  1. 변수는 우선적으로 값에 의미를 부여할 목적으로 쓴다. (가독성이 높아짐)
			 *  2. 단 한번 값을 기록하고 필요할 때 마다 가져다 쓰는 목적으로 쓴다.
			 *  3. 유지보수를 보다 쉽게 할 수 있다.
			 */
			
			System.out.println("시급: " + pay);
			
		}
		
		public void declareVariable() {
			
			/*
			 * 변수의 선언 = 변수를 만든다.
			 * 값을 기록하기 위한 변수를 메모리 공간에 확보, 할당한다.
			 * => 즉, 값을 보관하기 위한 상자를 만들겠다!
			 * 
			 * [표현법] 자료형 변수형;
			 * 
			 * 자료형 : 변수의 크기 및 모양을 지정해주는 부분
			 * 변수형 : 변수의 이름을 붙여주는 부분
			 * 
			 * 
			 */
			
			// -------------------------자료형에 대한 개념------------------------------------
			// 1. 논리형 (논리값 = true / false )
			boolean isTrue;
			boolean isFalse = false;
			System.out.println("isFalse의 값 :" + isFalse);
			
			isTrue = 1+3>1;
			System.out.println(isTrue);
			
			
			// 2. 숫자형
			// 2_1. 정수형(소숫점x)
			byte bNum; // 1byte (-128-127)
			short sNum = 1000; // 2byte 
			int iNum = 10000; // 4byte
			long lNum = 100000L; // 8byte
			
			// 2_2. 실수형(소숫점0)
			float fNum = 0.2f; // 4byte => 소숫점 7자리까지 표현 가능
								// float의 경우 double과 값을 구분하기 위해 값 뒤에 f를 붙인다.
			double dNum = 0.5; // 8byte => 소숫점 15자리까지 표현 가능
			
			// 3. 문자열
			// 3_1. 문자(힌글자)
			char ch = 'a'; // 2byte
			char kim;
			kim = '김'; //한글 한글자 2byte
			// M,F,Y,N 이러한 값을 넣을떄 사용한다.
			// 3_2. 문자열(여러글자)
			String str; // 참조형
			str = "abc"; // 한글자는 '' 여러글자는 "" 으로 한다.
			
			// 값이 잘 담겼는지 확인해보자
			System.out.println(isTrue);
			System.out.println(dNum);
			
			// 변수이름: 값의 형태로 출력 하고 싶다!!
			
			System.out.println("sNum :" +sNum);
			System.out.println("iNum :" +iNum);
			System.out.println("fNum :" +fNum);
			System.out.println("dNum :" +dNum);
			System.out.println("ch :" + ch);
			System.out.println("kim :" + kim);
			System.out.println("str :" + str);
			
			// 상수의 선언!
			// [표현법] final 자료형 변수명(대문자)
			final int AGE; 
			AGE = 13; // 초기화 = 값을 넣는 작업
			System.out.println("AGE: " + AGE);
			
			// AGE =18; 상수는 값의 변경이 불가능하다.
			
			// 대표적인 상수의 예 : 3.14(pi(파이), 원주율)
			System.out.println(Math.PI);
			
			
			// 번외 : 가독성을 위해 언더바를 쓸 수 있음
			int etc = 999_999_999;
			
			System.out.println(etc);
			
			//*변수 명명 규칙
			int number;
			
			//1.같은 영역(같은 메소드) 내에 중복된 이름 안됨!! 같은 클래스일지라도, 다른 메소드라면 중복된 이름 가능
			//int number;
			int pay = 10000;
			int numBer; // 대소문자 구분은 되지만, 현업에서는 사용 안함
			
			//2. 예약어 (자바에서 사용되고 있는 키워드)는 안된다.
			//ex) int true;, int class; ,int static;, int public;
			
			//3. 숫자 사용 가능하나 (단, 숫자로 시작하는건 안됨)
			//int number1; O int 1number; X
			
			//4. 특수문자 사용가능하나, (단, _랑 $만 사용 가능)
			//int number_1; int _number; O int !number1; int #number1; X
			
			//권장사항!! (오류는 안나나 지켜줬으면 좋겠다) 개발자간의 규칙(매너)
			//1)낙타 표기법
			//String username 오류는 나지 않지만, 사용되는 표준은 아님
			//String username -> String userName
			
			//2) 한글 사용 가능 하나 무조건 영문자로 작성해야한다.
			//String 이름; int 나이; int userAge; 
			
			/*
			 * ** 정리 **
			 * - 변수 : 값을 저장하기 위한 공간 ( 메모리의 값을 기록하기 위한 공간)
			 * - 값(레터럴): 프로그램 상에 필요한 명시적인 값
			 * 				또는 사용자가 마우스 또는 키보드로 입력한 값
			 * 
			 */
		
		}	
}
