package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		
		// 메모리는 휘발성임
		// 가나다라 라고 쓰고 컴퓨터 끄면 지워짐 > 휘발성
		// 기록하기 위해 파일이 필요함
		
		// 간단하게 파일(file) 만들어지는 과정
		// java.io.file 클래스 가지고
		// 여기서는 예외처리가 필수이다
		
		// File f1 = new File(); 기본생성자가 없음.
		
		try {
			// 1. 경로지정을 딱히 하지 않은 상태로 파일 생성 > 현재 project 폴더에 파일이 생성됨
			
			File f1 = new File("test.txt");
			f1.createNewFile(); // 메소드까지 실행해야만 실제 파일이 만들어짐
			
			// 2. 존재하는 폴더에 파일 생성해보기
			
			File f2 = new File("D:\\test.txt");
			f2.createNewFile();
			
			//File f3 = new File("D:\\temp\\test.txt"	);
			//f3.createNewFile();
			
			// 3. 폴더 먼저 만들고 파일까지 만들어지게 해보기
			
			File tempFolder = new File("D:\\temp");
			tempFolder.mkdir(); // 폴더가 만들어지게하는 메소드
			
			File f3 = new File("D:\\temp\\test.txt"	);
			f3.createNewFile();
			
			// 실행할 떄 마다 같은 파일이 계속 만들어지느냐?
			// 해당 파일이 존재하면 그냥 덮어쓰기 된다. 수정사항 없으면 변동없음.
			
			System.out.println(f1.exists());
			System.out.println(new File("ttt.txt").exists());
			
			System.out.println(f1.isFile()); // 파일이냐?
			System.out.println(tempFolder.isFile());
			
			
			//======================================================
			
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("절대경로 : " + file.getAbsolutePath());
			System.out.println("파일의 용량 : " + file.length()); // 공백이라 0이 나옴
			System.out.println("상위 폴더 : " + file.getParent());
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	/*
	 * 프로그램상에 데이터를 외부매게체로 출력을 한다거나 외부매게채를 통해 입력받을거임
	 * 반드시 그 외부매체와 통화는 통로를 만들어야됨 그게 바로 스트림
	 * 
	 * 스트림(통로) 특징
	 * 스트림 : 개울 / 한방향으로 흐름
	 * 단방향 : 압력이면 압력 / 출력이면 출력만 가능
	 *        입력과 출력을 동시다발적으로 하고자 한다면 ? 입력용스트림 / 출력용스트림 따로 열어야함
	 *        
	 * 선입선출(FIFO) : 먼저 들어간 데이터가 먼저 나온다. / 통로가 파이프 같은 개념
	 * -시간지연(delay) 이라는 문제가 생길 수 있음
	 * 
	 *  스트림의 구분 
	 *  > 통로의 사이즈(1byte짜리 / 2byte짜리)
	 *  바이트 스트림(1byte) : 1byte짜리만 왔다 갔다 가능 > 입력(InputStream) / 출력(OutputStream)
	 *  문자 스트림(2byte)  : 2byte 짜리도 왔다 갔다 할 수 있을 정도의 사이즈 입력(Reader) / 출력 (Writer)
	 *  
	 *  > 외부매체에 직접 연결하는 유무
	 *  - 기반 스트림 : 외부매체와 직접적으로 연결되는 통로(필수)
	 *  - 보조 스트림 : 말 그대로 보조 역할만 하는 통로(속도를 빠르게 한다거나 , 그 외에 유용한 기능)
	 *              보조스트림 단독으로는 사용 불가 . 기반스트림은 반드시 필요함
	 *              
	 *    우리는 외부매체를 파일로 해보자
	 *    첨부파일 기능 구현할 때 필요한 개념 
	 */
	
}
