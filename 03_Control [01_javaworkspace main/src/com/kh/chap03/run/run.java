package com.kh.chap03.run;

import com.kh.chap03.branch.A_Branch;
import com.kh.chap03.branch.B_Continue;

public class run {
	
	public static void main(String[] args) {
		
		A_Branch a = new A_Branch();
		a.method2();

		B_Continue b = new B_Continue();
		//b.method2();
	}

}
