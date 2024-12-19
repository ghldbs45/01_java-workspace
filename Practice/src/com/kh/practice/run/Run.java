package com.kh.practice.run;

public class Run {

	public static void main(String[] args) {
		
		int a = 1; 
		int b = 2;
		int c = 3;
		int d = 4;
		
		b *= a>b?a:b;
		System.out.println(b);
		
		d += a++>=b++ ? c*d : b/c;
		System.out.println(d);
		
		System.out.println(d%b+ ++a*c-- - --a -2);
		
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		System.out.print(d);

	}

}
