package com.kh.chap01_list.part02_mvc.run;

import com.kh.chap01_list.part02_mvc.view.MusicMenu;

public class MVCRun {

	public static void main(String[] args) {
		
		/*                         (vo)  (view)(controller)
		 *  MVC 패턴 : 각 클래스마다 역할(데이터 , 화면, 요청처리)을 부여해서 작업
		 *            > 유지보수에 용이하다.
		 *  
		 *  
		 *  M (Model) : 데이터를 담당하는 역할 (데이터를 담기 위한 클래스 , 데이터가 보관되어 있는 보관함과 연결
		 *  V (View) : 화면을 담당하는 역할 즉 , 사용자에게 보여지는 시각적인 요소 (출력문(print)), (입력문(Scanner))
		 *  C (Controller) : 사용자가 요청한 내용을 처리한 후 그 결과를 돌려주는 역할(출력문 , 입력문 X )
		 *  
		 *  
		 */
		
		// 메인화면 : 프로그램 실행시 처음 보여주는 화면
		MusicMenu mm = new MusicMenu();
		mm.mainMenu();
		

	}

}
