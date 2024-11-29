package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.C_Printf;
import com.kh.variable.D_Cast;

public class Run {

		
      /*	public static void 메소드명() { 메소드 입력방법 
			
		}*/

	public static void main(String[] args) {     //main 메소드 기능은 자바를 실행시켜주는 역할
		//System.out.println("주몽"); 테스트
		
		
		// 클래스 파일들을 불러서 실행하는 방법
		// 클래스명 별칭 = new 클래스 명 ()
		
		A_Variable a = new A_Variable();
		
		//해당 클래스의 메소드를 실행하는 방법
		//별칭, 메소드명()
		
		//a.printVariable();
		//a.declareVariable();
		
		 B_KeyboardInput b = new B_KeyboardInput();
		 //b.charAtTest();
		 
		 C_Printf c = new C_Printf();
		// c.printfTest();
		 
		 D_Cast d = new D_Cast();
		 d.forceCasting();
		 
	
	}
	
}
