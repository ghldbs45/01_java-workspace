package com.kh.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
	
	//프로그램 --------- > 파일(출력)
	public void fileSave() {
		
		// 출력할 데이터
		Phone p1 = new Phone("아이폰", 1300000);
		Phone p2 = new Phone("겔럭시", 1200000);	
		Phone p3 = new Phone("플립", 1500000);
		
		// 객체 단위로 출력해줄 수 있는 보조스트림 필요 
		
		// ObjectXXXX => Writer ,  Reader 가 없다.
		// byte 기반 스트림과 함께 사용.
		
		// FileOutputStream : 파일과 연결해서 1 바이트 단위로 출력하는 기반 스트림
		// ObjectOutputStream : 객체 단위로 출력할 수 있도록 도움을 주는 보조스트림
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))){
			
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			
			//파일은 미관산 볼려고 만드는게 아니라
			//나중에 읽기위해서 만드는것
			//컴퓨터가 이해하기 좋은 최적의 상태로 제작
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

}
	// 프로그램 <--------- 파일( 입력 )
	public void fileRead() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_phone.txt"))){
		
			/*
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject()); // 파일의 끝을 만나는 순간 예외 발생
			                                      //   EOFException
			                                      //   End of File
			                                       * 
			                                       */
			
			while(true) {
				System.out.println(ois.readObject());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		System.out.println(" 프로그램을 종료합니다 ");
	}
}
