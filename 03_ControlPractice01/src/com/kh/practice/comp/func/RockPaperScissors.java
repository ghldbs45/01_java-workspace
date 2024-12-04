package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {
	
	public void rps() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		
		int total = 0;
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		String com = "";
		
		while(true) {
			int random = (int)(Math.random()*3+1);
			
			if(random == 1) {
				com = "가위";
			}else if(random == 2) {
				com = "바위";
			}else{
				com = "보";
			}
			
			System.out.print("가위 , 바위 , 보 : ");
			String user = sc.nextLine();
			
			total++;
			
			if(com.equals("가위") && user.equals("가위")) {
				System.out.println("비겼습니다");
				draw++;
			}else if(com.equals("가위") && user.equals("보")) {
				System.out.println("졌습니다");
				lose++;
			}else if(com.equals("가위") && user.equals("바위")) {
				System.out.println("이겼습니다!!");
				win++;
			}else if(com.equals("바위") && user.equals("보")) {
				System.out.println("이겼습니다!!");
				win++;
			}else if(com.equals("바위") && user.equals("바위")) {
				System.out.println("비겼습니다");
				draw++;
			}else if(com.equals("바위") && user.equals("가위")) {
				System.out.println("졌습니다");
				lose++;
			}else if(com.equals("보") && user.equals("가위")) {
				System.out.println("이겼습니다!!");
				win++;
			}else if(com.equals("보") && user.equals("바위")) {
				System.out.println("졌습니다");
				lose++;
			}else if(com.equals("보") && user.equals("보")) {
				System.out.println("비겼습니다");
				draw++;
			}else if(user.equals("exit"))
				System.out.println(total + "전" + win+"승" + draw + "무" + lose + "패");
				
				
				
			}
		}
	
	}
	


