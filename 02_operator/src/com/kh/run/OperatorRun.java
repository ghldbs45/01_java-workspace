package com.kh.run;

import com.kh.operator.A_LogicalNegation;
import com.kh.operator.B_InDecrease;
import com.kh.operator.C_Arithmetic;
import com.kh.operator.D_Compartison;
import com.kh.operator.E_Logical;
import com.kh.operator.F_Triple;

public class OperatorRun {
	
	public static void main(String[] args) {
		
		A_LogicalNegation a = new A_LogicalNegation();
		//a.method1();
		
		B_InDecrease b = new B_InDecrease();
		//b.method4();
		
		C_Arithmetic c = new C_Arithmetic();
		//	c.quiz1();
		D_Compartison d = new D_Compartison();
		//d.method2();
		E_Logical e = new E_Logical();
		//e.method5();
		F_Triple f = new F_Triple();
		f.method3();
		
		
		
		
	}

}
