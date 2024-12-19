package com.kh.chap01_oneVsmany.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);

		
		
		ArrayList<Book> b = new ArrayList<Book>();
		
	
		
		for (int i = 0; i <3; i++) {

			System.out.println(i + 1 + "번째 도서 정보 입력  ");

			System.out.println("도서명  : ");
			String title = sc.nextLine();

			System.out.println("저자명 : ");
			String author = sc.nextLine();

			System.out.println("가격 : ");
			int price = sc.nextInt();

			sc.nextLine();

			System.out.println("출판사 : ");
			String publisher = sc.nextLine();
			
			b.add(new Book(title, author, price, publisher));
		}
		
		for(int i=0; i<b.size();i++) {
			System.out.println(b.get(i).information());

		}
		System.out.println("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		
		for(int i=0; i<b.size(); i++) {
			if (b.get(i).getTitle().equals(search)) {
				System.out.println(b.get(i).information());
			}
		
		
		// 객체 배열 활용해서 해보기
		// 세권의 Book 객체를 관리한다면 ? 
		
		/*
		Book[] books = new Book[3];
		
		
		// 세개의 도서에 대한 정보를 반복적으로 입력 받아 각 인덱스에 객체 생성
		
		for(int i=0;i<books.length;i++) {
			
			System.out.println(i+1+"번째 도서 정보 입력  ");
			
			System.out.println("도서명  : ");
			String title = sc.nextLine();
			
			System.out.println("저자명 : ");
			String author = sc.nextLine();
			
			System.out.println("가격 : ");
			int price = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("출판사 : ");
			String publisher = sc.nextLine();
			
		
			books[0] = new Book(title, author, price, publisher);
			books[1] = new Book(title, author, price, publisher);
			books[2] = new Book(title, author, price, publisher);
			
			
			//각각의 인덱스에 차곡차곡 객체 생성
			books[i] = new Book(title, author, price, publisher);
		}
		
		// 객체 생성 끝
		
		// 전체 도서 정보 조회하기 > 반복문 활용 가능 
		
		for(int i=0; i<books.length;i++) {
			System.out.println(books[i].information());
		}
		
		//도서 제목으로 검색하는 서비스
		System.out.println("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		
		for(int i=0; i<3; i++) {
			if (books[i].getTitle().equals(search)) {
				System.out.println(books[i].information());
				
			}
		}
			}
             
*/
		
		
		
		
	}
}
}

