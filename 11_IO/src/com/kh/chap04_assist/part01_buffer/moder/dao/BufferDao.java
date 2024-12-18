package com.kh.chap04_assist.part01_buffer.moder.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDao {
	
	/*
	 *  보조스트림 : 기반스트림만으로 부족했던 성능을 보다 향상 시켜주는 스트림
	 *            기반스트림에서 제공하지 않는 추가적인 메소드 제공 / 데이터 전송 속도 향상 시킴
	 *       >> 외부 매체와 직접적으로 연결되는 스트림은 아님
	 *          단독 사용 불가능 (기반스트림을 보조해주는 스트림)
	 */
	
	// 프로그램 ------ > 파일 ( 출력 )
	public void fileSave() {
		// FileWriter 기반 스트림 가지고 해보자 (기반스크림 필수)
		// 파일과 직접적으로 연결해서 2 바이트 단위로 출력할 수 있는 스트림
		
		// BufferdWriter : 버퍼라는 공간을 제공해주는 보조스트림 (속도향상) : 기반 스트림이랑 이름 맞춰야함
		
		//BufferedWriter bw = new BufferedWriter("c_bufferd.txt");
		// 단독 사용 불가
		
		// 1. 기반 스트림 먼저 생성
		//FileWriter fw = new FileWriter("c_buffer.txt");
		// 2 . 보조스트림 생성시 기반스트림 객체를 전달하며 생성
		//BufferedWriter bw = new BufferedWriter(fw);
		
		
		/*
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			// write 메소드 이용해서 데이터 출력
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine(); // 추가적인 메소드 활용가능
			bw.write("저리가세요");
			//버퍼라는 공간에 계속 쌓아놨다가 한번에 출력 해줌
			// > 속도 향상에 좋다.
			
			
			
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		// try ~ with ~ resource 구문으로 자원반납까지 더 간단하게 작업할 수 있음.
		// jdk 7버전 이상부터 가능
		
		/*
		 * [표현법]
		 * try(try블럭 내에서 사용할 스트림 객체 생성구문){ // 알아서 try 다 끝나면 해당 스트림 반납해줌
		 * 
		 * }catch(예외클래스 e){
		 * 
		 * }
		 */
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))){
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine();
			bw.write("저리가세요");
			
		}catch(IOException e) {
			
		} // 자원 반납 구문 안써도 됨. 자동으로 반납까지 해줌
	}
	
	// 프로그램 <---------- 파일 ( 입력 )
	public void fileRead() {
		
		//FileReader : 파일과 연결해서 2 바이트 단위로 데이터를 입력받을 수 있는 기반스트림
		//BufferedReader : 속도 향상 도움이 되는 보조스트림
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			
			// br.read(); 반환형이 int라서 형변환 해줘야함.
			//br.readLine(); // 한문장씩 가져오게 되어있음 반환형 스트링
			
			String value = null ; 
			while ((value = br.readLine())!= null) { // null 과 비교는 equals 안써도 됨
				System.out.println(value);
			}
			
		}catch(IOException e) {
			
		}
		
		
	}

}
