package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// dao( Data Access object  = DAO )
public class FileByteDao {
	
	/*
	 * "바이트 기반 스트림" 가지고 데이터 입출력해보기 
	 * 
	 * -바이트 스트림 : 데이터를 1byte 단위로 전송하는 통로 (좁은 통로)// 한글은 2바이트라 깨짐
	 * -기반 스트림 : 외부매체와 직접적으로 연결되는 통로
	 * 
	 * 'XXXX'InputStream : 'XXXX' 매체로부터 데이터를 입력받는 통로 (데이터를 받아온다.)
	 * 'XXXX'OutputStream : 'XXXX' 매체로부터 데이터를 출력하는 통로 (데이터를 내보낸다.)
	 */
	
	// 프로그램(자바 또는 메모리) -----> 외부매체(파일) (출력 : 프로그램 상의 데이터를 파일로 내보내기
	//                                             즉 파일로 저장)
	public void fileSave() {
		
		// FileOutputStream : 파일과 직접적으로 연결해서 1byte 단위로 출력하는 스트림
		
		// 1. 스트림 생성(통로만들기)
		// 2. 스트림으로 데이터를 출력 (메소드 활용)
		// 3. 다 사용한 후 스트림 반납
		
		FileOutputStream fout = null; // 여기서는 선언만
		
		try {
			
			// 1. FileOutputStream 객체 생성 > 해당 파일과의 연결 통로가 만들어짐 !
			// FileOutputStream fout = new FileOutputStream("a_byte.txt");
			
			fout = new FileOutputStream("a_byte.txt"); //진짜 생성은 트라이문안에
			
			// 해당파일이 없으면 새로 만들어주고 통로 연결
			// 있으면 그냥 통로 연결
			
			// 2. 파일에 데이터를 출력하고자 할 떄 write 메소드 사용
			//    숫자를 출력하든 문자를 출력하든 실상 파일에 기록되는건 문자로 기록됨(아스키코드)
			//    숫자(0~127)
			
			fout.write(97);  // 'a'가 저장됨.
			fout.write('b'); // 'b'가 저장됨.
			//fout.write('헐'); // 한글은 2byte 짜리여서 꺠짐 > 바이트 스트림으로는 제한이 있음
			
			byte[] arr = { 99,100,101};
			fout.write(arr,1,2);
			
			// write(byte[] b , int off , int len):byte 배열의 off 번째 인덱스부터 len 개수 만큼 출력
			
			fout.write(arr , 1 , 2 ); // de 문자가 저장 
			
			// 3. 스트림 다 이용했으면 반납하기 (반드시)
			// fout.close(); // 위에서 write() 메소드 실행시 IOException 발생 했을 경우 
			//                  catch 블럭 실행 후 빠져나감 ( 반납 하는 코드 실행 안됨)
			//                  반드시 실행해야만 하는 구문이기 때문에 finally{}에 기술
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}finally { // 이 안에 작성된 코드는 예외가 발생하던 안하던 마지막에 무조거 실행
			
			try {
				// 3. 스트림을 다 이용했으면 반납하기 ( 필수 )
				fout.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
	// 프로그램 <------ 파일 (입력 input 파일로부터 데이터 가져오기)
	public void fileRead() {
		
		// FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력받는 스트림
		
		// 1. 스트림 생성 (통로 만들기)
		// 2. 스트림을 통해서 입력받아옴 (메소드활용)
		// 3. 사용끝난 스트림 반납
		
		FileInputStream fin = null;
		
		try {
			// 1. FileInputStream 객체 생성 > 해당 파일과 연결 통로 만들어짐
			fin = new FileInputStream("a_byte.txt");
			
			// 2. 파일로부터 데이터 읽어들이고자 할 떄 read 메소드 사용 
			//    1byte 단위로 하나씩 읽어옴 / 반환형이 int 여서 숫자로 읽어들임
			
			/*
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read()); // 파일의 끝을 만나는 순간 -1 을 받아오는거 확인
			System.out.println(fin.read());
			*/
			// 반복문 수행시 매번 read()가 두번씩 실행되기 때문에 퐁당퐁당 읽여들여짐 > 잘못됨
			// while(fin.read() != -1) {
			//	System.out.println(fin.read());
			
			
			// read() 호출 반복문의 수행시에만 실행되도록
			// 해결방법 1. 무한반복 돌리면서 매번 조건검사
			/*
			while(true) {
				int value = fin.read();
				if(value == -1 ) {
					break;
				}
				System.out.println(value);
				}
			*/
			
			// 해결방법 2. (권장방법)
			int value = 0;
			while((value = fin.read())!= -1) {
				System.out.println(value);
			}
		} catch (FileNotFoundException e) {
			
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// 3. 사용이 완료된 스트림 반납
				fin.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
