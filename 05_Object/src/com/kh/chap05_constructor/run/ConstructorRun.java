package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		
		User u1 = new User();
		System.out.println(u1.information());
		/*
		User u2 = new User();
		u2.setUserId("user02");
		u2.setUserPwd("pass02");
		u2.setUserName("정회윤");
		
		System.out.println(u2.information());
		*/
		
		// 회원가입시 필수 입력사항만 받는다면 ?
		User u2 = new User("user02","pwd02","차은우");
		System.out.println(u2.information());
		
		// 그럼 setter를 안만들어도 되지 않을까 ? 
		u2.setUserName("차운");
		System.out.println(u2.information());
		
		// getter는 ? 
		// 아이디를 잊은 경우 . 아이디만 보여줘야 함. // 결론 setter , getter 둘다 필수로 필요함.
		System.out.println(u2.getUserId());
		
		

		User u3 = new User("cha", "pwd01", "은우차", 20, 'M');
		System.out.println(u3.information());
		
		
		
		
	}

}
