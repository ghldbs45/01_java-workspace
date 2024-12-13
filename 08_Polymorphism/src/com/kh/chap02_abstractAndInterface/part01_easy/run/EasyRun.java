package com.kh.chap02_abstractAndInterface.part01_easy.run;

import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.Baseball;
import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.FootBall;
import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.Sports;

public class EasyRun {

	public static void main(String[] args) {

		
		// 추상클래스로는 객체 생성 불가 > 미아ㅘㄴ성 클래스이기 떄문에
		// Sports s new Sports();
		Sports s = new FootBall();
		// 객체 생성은 안되지만 레퍼런스로는 사용 가능
		// 다형성 적용 시켜서 부모타입으로 자식 객체 받아주는 형태 가능
		
		Sports[] arr = new Sports[2];
		// 부모          자식
		arr[0] = new FootBall();
		arr[1] = new Baseball();
		
		for(int i=0;i<arr.length;i++) {
			arr[i].rule();
		}
		
		// 향상된 for문
		// for(자료형 변수명 : 돌릴것) (자료형에 왜 Sports a 가 들어가는지 이해해야함)
		for(Sports a:arr) { // a = arr[0] , a = arr[1]
			a.rule(); // 동적바인딩임
		}
		
		/*
		 * *동적바인딩 : 컴파일 시점에서는 정적바인딩으로 현재 레퍼런스의 자료형의 클래스에 있는
		 *          메소드를 가리키긴함
		 *          런타임시점(실행시점)에서는 동적바인딩으로 각각의 자식클래스에
		 *          오버라이딩 된 메소드가 있을 경우 그걸 실행함.
		 *          
		 * *추상메소드 : 미완성된 메소드로 Body부가 구현되어 있지 않은 메소드 
		 *          (Abstract)
		 * 
		 * *추상클래스 : 미완성된 클래스 = 일반필드 + 일반 메소드 [+ 추상메소드]
		 *          (Abstract) 
		 *          추상메소드를 가진 클래스는 반드시 추상 클래스로 명시해야함
		 *          
		 * *추상 메소드 없이 추상 클래스를 만드는 법
		 * 개념적 : 미완성된 클래스라는걸 알려줄 목적    
		 * 프로그래밍적 : 객체 생성을 할 수 없게끔 하고자 할때
		 * 
		 * *추상 메소드가 존재하는 추상클래스를 사용하는 이유
		 * 부모클래스에 추상 메소드가 존재할 경우
		 * 각 자식 클래스마다 실행시킬 내용은 다르지만 동일한 형태의 메소드로 구현했으면 할 때
		 *   > 메소드 통일성 확보 목적
		 *   > 표준화 된 틀을 제공할 목적
		 *   
		 *   
		 */
		
	}

}
