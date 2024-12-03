package com.kh.Practice.chap01.ControlPractice;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 번호 입력 (1 , 2, 3 , 4 , 7");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("입력메뉴입니다");
			break ;
		case 2:
			System.out.println("수정메뉴입니다");
			break ;
		case 3:
			System.out.println("조회메뉴입니다");
			break ;
		case 4:
			System.out.println("삭제메뉴입니다");
			break ;
		case 7:
			System.out.println("프로그램이 종료됩니다");
			break ;
		default :
			System.out.println("잘못누르셨습니다");
			break ;
		}
		
	}
public void practice2() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("정수를 입력하세요");
	int num = sc.nextInt();
	
	if (num > 0 && num % 2 == 0) {
		System.out.println("짝수다");
	}else if (num % 2 != 0 ) {
		System.out.println("홀수다");
	}else {
		System.out.println("양수만 입력해주세요");
	}
	
		
		
	}
public void practice3() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("국어 점수");
	int lang = sc.nextInt();
	Scanner sc1 = new Scanner(System.in);
	System.out.println("영어 점수");
	int eng = sc.nextInt();
	Scanner sc2 = new Scanner(System.in);
	System.out.println("수학점수");
	int math = sc.nextInt();
	
	int pls = (lang+eng+math);
	int avg = (pls/3);
	
	if (lang > 40 && eng > 40 && math > 40 && avg > 60) {
		System.out.println("합격");
	}else {
		System.out.println("불합격");
	}
	System.out.println("국어 점수 : "+lang +"영어점수 : "+eng+"수학점수 : " + math + "합계 : " + pls +"평균 : "+avg+"축하합니다 합격입니다");
}
public void practice4() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("정수입력");
	int num=sc.nextInt();
	
	switch(num) {
	case 3:
	case 4:
	case 5: System.out.println("봄");
	break;
	case 6:
	case 7:
	case 8: System.out.println("여름");
	break;
	case 9:
	case 10:
	case 11: System.out.println("가을");
	break;
	case 12:
	case 1:
	case 2: System.out.println("겨울");
	break;
	default : System.out.println("잘못 입력되었습니다.");
	}
	
	
}
public void practice5() {

	//스캐너 생성
	Scanner sc = new Scanner(System.in);
	//아이디 , 비밀번호 정하기
	String id = "my id";
	String pwd = "mypassword12";
	
	System.out.println("아이디 : ");
	String inputid = sc.nextLine();
	
	System.out.println("비밀번호 : ");
	String inputpwd = sc.nextLine();
	
	String result = "";

	if (id.equals(inputid)) { // 아이디가 같을 경우
		if (pwd.equals(inputpwd)) {// 비밀번호도 같을 경우
			result = "로그인 성공";
		} else { // 아이디는 맞았지만 비번이 틀릴경우
			result = "비밀번호가 틀렸습니다";
		}
	} else {
		result = "아이디가 틀렸습니다.";
	}
	
	System.out.println(result);
	
	
	
	
}
public void practice6() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("관리자 , 회원, 비회원");
	String grd =sc.nextLine();
	
	switch(grd) {
	case "관리자" : System.out.println("회원관리");
	case "회원" : System.out.println("게시글 관리");
	case "비회원" : System.out.println("게시글 작성" + "게시글 조회" + "댓글 작성");
	
	}
	
	
	
}
public void practice7() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("키를 입력하세요");
	double height = sc.nextDouble();
	
	Scanner sc1 = new Scanner(System.in);
	System.out.println("몸무게를 입력하세요");
	double kg = sc.nextDouble();
	
	
	double ii = height*height;
	double ee = kg/ii;
	
	String result = "";
	
	if (ee < 18.5) {
		result = "저체중";
	}else if (ee < 23) { // 18.5는 무조건 넘어 , 근데 23은 안되는 사람
		result = "정상";
	}else if (ee < 25) {
		result = "과체중";
	}else if (ee < 30) {
		result = "비만";
	}else {
		result = "고도비만";
	}
	System.out.println(result);
}
public void practice8() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("첫번째 숫자");
	int num1 = sc.nextInt();
	
	Scanner sc1 = new Scanner(System.in);
	System.out.println("두번째 숫자");
	int num2 = sc1.nextInt();
	
	sc.nextLine(); // 버퍼에 남아있는 엔터 제거 코드 추가
	
	Scanner sc2 = new Scanner(System.in);
	System.out.println("연산기호 ('+' , '-' , '*' , '/' , '%')");
	char ch = sc2.nextLine().charAt(0);
			
	if (ch == '+') {
		System.out.println(num1+num2);
	}else if(ch == '-') {
		System.out.println(num1-num2);
	}else if(ch == '*') {
		System.out.println(num1*num2);
	}else if(ch == '/') {
		System.out.println(num1/num2);
	}else if(ch == '%' ) {
		System.out.println(num1&num2);
	}else{ 
		System.out.println("잘못 입력하셨습니다 . 프로그램을 종료합니다.");
		
	}
	}

public void practice9() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("중간고사 점수");
	int mid = sc.nextInt();
	
	Scanner sc3 = new Scanner(System.in);
	System.out.println("기말고사 점수");
	int fin = sc.nextInt();
	
	Scanner sc1 = new Scanner(System.in);
	System.out.println("과제점수");
	int hwk = sc.nextInt();
	
	Scanner sc2 = new Scanner(System.in);
	System.out.println("출석회수");
	int go = sc.nextInt();
	
	double mid1 = mid * 0.2;
	double hwk1 = hwk * 0.3;
	double go1 = go;
	double fin1 = fin * 0.3;
	
	double total = mid1 + hwk1+go1+fin1;
	
	if (total >= 70) {
		System.out.println("Pass");
	}else if (total < 70 || go1 < 15) {
		System.out.println("Fail");
	}
	
	System.out.println("중간고사 점수 : " + mid1 + "기말고사 점수 : "+ fin1 + "과제 점수 : " + hwk1 + "출석 회수 : " + go1 + "총 점 : " + total);
	}


public void practice10() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("실행할 기능을 선택하세요");
	System.out.println("1. 메뉴 출력");
	System.out.println("2. 짝수 / 홀수 ");
	System.out.println("3. 합격 / 불합격");
	System.out.println("4. 계절");
	System.out.println("5.로그인 ");
	System.out.println("6. 권한 확인");
	System.out.println("7. BMI");
	System.out.println("8. 계산기");
	System.out.println("9. P/F");
	int num = sc.nextInt();
	
	switch (num) {
	case 1:
		practice1();
		break;
	case 2:
		practice2();
		break;
	case 3:
		practice3();
		break;
	case 4:
		practice4();
		break;
	case 5:
		practice5();
		break;
	case 6:
		practice6();
		break;
	case 7:
		practice7();
		break;
	case 8:
		practice8();
		break;
	case 9:
		practice9();
		break;

	}
	
	
}

}
