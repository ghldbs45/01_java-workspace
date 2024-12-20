package com.kh.variable;

public class D_Cast {
	//public void 매소드() {
		
		/*
		 * * 형변환 : 값의 자료형을 바꾸는 것
		 * 
		 * * 컴퓨터에서의 값 처리 규칙
		 * 1. 대입연산자를 기준으로 왼쪽과 오른쪽은 같은 자료형이여야 한다!
		 * => 즉 , 같은 자료형에 해당하는 값만 대입 가능!_!
		 * => 즉 , 다른 자료형의 값을 대입하고자 한다면 형변환이 필수이다!
		 * 
		 * 자료형 변수명 = (자료형)값;
		 * 
		 * 2. 같은 자료형 끼리만 연산이 가능
		 * 
		 *  값 + 값 => 계산 결과도 같은 자료형으로 나옴 !! 
		 *  
		 * * 형변환 종류
		 * 1. 자동 형변환 => 자동으로 형변환이 이루어져서 우리가 형변환을 시킬 필요가 없음
		 * 2. 강제 형변환 => 자동형변환이 안되서 우리가 직접 형변환을 해줘야힘.
		 * 
		 * [표현법] (바꿀자료형)값
		 * 
		 * * 주의사항
		 * boolean은 형변환 불가
		 */
		
		public void autoCasting() {
			/*
			 * 자동형변환 
			 * 값의 범위가 작은 자료형과 큰 자료형간의 연산시
			 * 자동으로 범위가 작은 자료형을 큰 자료형으로 변환 후 연산해줌
			 */
			
			// 1. int (4byte) => double(8byte)
			int i1 = 12;
			double d1 = /*(double)*/i1;
			
			D_Cast d = new D_Cast();
			
			int i2 = 12;
			double d2 = 3.3;
			
			double result = /*(double)*/i2 + d2; //12.0+3.3 => 15.3
			
			System.out.println("result:"+result);
			
			int i3 = 1000;
			long l3 = /*(long)*/i3;
			
			//3. float(4b) => double (8b)
			float f4 = 1.0f;
			double d4 = f4;
			
			// ====== 특이케이스 ======
			// 4. long(8byte) => float(4byte)
			// float이 실수형이기 때문에 long보다 표현 가능한 수의 범위가 더 커서 자동형변환 됨
			
			long l5 = 100000000L;
			float f5 = l5;
			
			// 5. char(2byte) <=> int(4b)
			int num ='A';
			
			char ch = 91;
			System.out.println("ch:"+ch);
			
			// 각 문자들 마다 고유한 숫자가 지정되어 있기 때문에 쌍방향으로 형변환 가능
			// char는 음수값 저장 불가 => 값의 범위가 0~65535
			
			// 6. byte 또는 short간의 연산
			byte b1 = 1;
			byte b2 = 10;
			
			// byte b3 = b1 + b2; // byte나 short는 연산시 무조건 int형으로 처리함.
									// 연산결과 범위가 더 큰 int 형임 => byte에 대입 불가
					
		
	}
		
		public void forceCasting() {
			// 강제형변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 바꾸는 것
			
			// double (8byte) = > float (4byte)
			double d1 = 4.0;
			float f1 = (float)d1;
			//강제형변환 안해주면 오류남. 명시적으로 형변환해줘야함.
			
			//double (8byte) => int (4byte)
			int iNum = 10;
			double dNum = 5.89;
			
			//int sum = iNum + dNum; // 덧셈연산시 자동 형변환 
									//연산 결과인 double형이 int형에 대입 불가!
			// 에러 해결 방법
			// 1. 연산결과를 int형으로 강제형변환
			int iSum1 = (int)(iNum + dNum);
			System.out.println("iSum1 : " + iSum1); // 데이터 손실 발생 , 형변환을 통해서 정수값만 출력됨
			
			// 2. double형 값 만을 int형으로 강제형변환
			int iSum2 = iNum + (int)dNum ; // 10 + 5 > 15
			System.out.println("iSum2 :" + iSum2);
			
			// 실수 값을 정수형으로 강제형변환시 소수점 아래 부분은 버려짐(*데이터 손실 발생할 수 있다)
			double iSum3 = iNum + dNum ; 
			System.out.println("iSum3:"+iSum3);
			           
			// ** 데이터 손실 테스트 **
			int iNum2 = 290;
			byte bNum2 = (byte)iNum2;
			
			System.out.println("bNum2:"+bNum2);
			
			
		}
}

