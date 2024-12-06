package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {
	
public void upDown() {
		
	Scanner sc = new Scanner(System.in);

	int random = (int) (Math.random() * 100 + 1);
	System.out.println(random);

	int i = 0;
	while (true) {
		i++;
		System.out.println("1~100 사이의 숫자를 입력해주세요.");
		int num = sc.nextInt();

		if (num > 0 && num <= 100) {
			if (num > random) {
				System.out.println("DOWN!!");
			} else if (num < random) {
				System.out.println("UP!!!");
			} else {
				System.out.println("정답입니다!" + i + "번만에 맞추셨습니다");
				break;
			}
		} else {
			System.out.println("다시 입력하세요 : ");
		}

	}
}
}
