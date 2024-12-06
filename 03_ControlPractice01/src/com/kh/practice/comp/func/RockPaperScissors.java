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
				
			    // string result = "";
				// if(com.equals(user)) {
			    //        result = 비김
				// }
				// if(com.equals("가위")) { // com 이 가위를 낸 경우
				// switch(user){
				// case "바위" : result = "이김 " ; break ; 
				// case "보" : result = "짐" ; break; 
				// }
				// }else if(com.equals("바위)){ // com이 바위를 낸 경우
				// switch(user){
				// case "가위" : result = "짐 " ; break ; 
				// case "보" : result = "이김" ; break;
				// }
				// }else{ // com이 보를 낸 경우
				// switch(user){
				// case "바위" : result = "짐 " ; break ; 
				// case "가위" : result = "이김" ; break;
				//  }
				// }	
				// System.out.println(result);
				// System.out.println();
				// total++;
				// switch(result) {
				// case "이김." : win ++ break;
				// case "짐" : lose++; break;
				// default : draw++; break;
			
			
			
			}
		}
	
	}
	


