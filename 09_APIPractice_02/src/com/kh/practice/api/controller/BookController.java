package com.kh.practice.api.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import com.kh.practice.api.model.vo.Book;

public class BookController {
	
	
	Book bk = new Book();
	// private 접근제한자로 크기 5의 Book 객체 배열 생성
	// 각각의 인덱스에 접근하여 샘플 데이터 넣어서 객체 생성
	
	

	
	private Book[] bkArr = new Book[6];
	{
	bkArr[0]=new Book("자바의정석","차은우","나무",new Date(2023-1900 , 6-1 , 14) ,10000);
	bkArr[1]=new Book("여러분 파이팅","차은우","사과",new Date(2023-1900,5-1,11),20000);
	bkArr[2]=new Book("문동은","차은우","오렌지",new Date(2020-1900,04-1	,25),35000);
	bkArr[3]=new Book("장원영","차은우","키위",new Date(2015-1900,1-1,01),70000);
	bkArr[4]=new Book("시연썜","차은우","바나나",new Date(2022-1900,12-1,25),80000);
	bkArr[5]=new Book(null, null, null, new Date(), 0);
	}
	
	public void printAll() {

		for (int i = 0; i < bkArr.length; i++) {
			if(bkArr[i] != null) {
			System.out.println(bkArr[i].toString());
		}}

		for (Book a : bkArr) {
			System.out.println(a.toString());
		}
		
	}

			
	public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
				int price = Integer.parseInt(newPrice);
				// 1) StringTokenizer를 이용한 방법
				// 1_1) StringTokenizer를 이용하여 먼저 "2020-07-01" 을 각각 문자열로	 분리("2020", "07", "01")
				StringTokenizer stn = new StringTokenizer(newDate, "-");
				// 1_2) 각 분리된 문자열들을 매번 뽑아서 int 변수들에 담기
				// 1_3) year, month, date 가지고 Date객체 생성하기
				
				
				int year= Integer.parseInt(stn.nextToken());
				int month = Integer.parseInt(stn.nextToken());
				int day = Integer.parseInt(stn.nextToken());
				Date nDate = new Date(year-1900, month-1, day);
				
				// 2) split 메소드를 이용한 방법
				
		
				
				// 2_1) split 메소드를 이용하여 먼저 "2020-07-01" 을 각각 문자열로 분

				String[] nDateArr =newDate.split("-");
				
				
				// 2_2) 각 분리된 문자열들이 담겨있는 해당 배열에 인덱스에 접근해서
				
			
				
				int yearArr = Integer.parseInt(nDateArr[0]);
				int monthArr = Integer.parseInt(nDateArr[1]);
				int dayArr = Integer.parseInt(nDateArr[2]);

				// 2_3) year, month, date 가지고 Date객체 생성하기
				Date ArrDate = new Date(yearArr, monthArr, dayArr);
		
			
				// 3. 나머지 전달받은 값들과 위에서 변환작업을 해준 price와 date값을 가지고
				// Book클래스의 매개변수 생성자를 통해 생성
				
				bkArr[bkArr.length-1] = new Book(newTitle, newAuthor, newPublisher, nDate, price);
			
	}
	

	public void searchBook(String searchTitle) {
		// 도서 리스트를 전체적으로 조회하면서 (for문 이용)
		
		// 전달받은 검색명을 포함(HINT : String클래스의 contains메소드 활용 한!! 도서들 전체 출력
		
		// 1) for loop문 방법
		for(int i = 0 ; i <  bkArr.length; i++) {
			if(bkArr[i].getTitle().contains(searchTitle)) {
				System.out.println(bkArr[i]);
			}
		}
		
		// 2) for each문 방법 (향상된 for문)
		
		for (Book a : bkArr) {
			if (String.valueOf(a).contains(searchTitle)) 
				System.out.println(a);
				
		}
	}
}