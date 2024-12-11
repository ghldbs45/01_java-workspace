package com.kh.chap04_Field.model.run;

import com.kh.chap04_Field.model.vo.FieldTest1;
import com.kh.chap04_Field.model.vo.FieldTest2;
import com.kh.chap04_Field.model.vo.FieldTest3;

public class Run {
	
	public static void main(String[] args) {
		
		// ------- fieldTest1------- 
		//FieldTest1 f1 = new FieldTest1();
		//f1.test(1);
		
		//FieldTest2 f2 = new FieldTest2();
		
		//public
		//System.out.println(f2.pub);
		
		//protected : 같은 패키지내에서는 접근 가능 , 다른패키지라면 상속구조에서만 가능
		//System.out.println(f2.pro);
		
		//default > 오로지 같은 패키지 내에서만 접근 가능
		//System.out.println(f2.def);
		
		//private : only 해당 클래스에서만 접근 가능
		//System.out.println(f2.pri);
		
		
		FieldTest3 f3 = new FieldTest3();
		
		System.out.println(FieldTest3.sta);
		//수정하고 싶다면 ?
		FieldTest3.sta = "ㅋㅋㅋㅋㅋ";
		System.out.println(FieldTest3.sta);
		
		// 절대 변경 되지 않게 하고 싶다면? > 상수필드로 선언해야함
		System.out.println(FieldTest3.STA_FIN); // 변경불가
		
		
		
		
	}

}
