package com.kh.chap02_inherit.run;

import java.util.ArrayList;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;
import com.kh.chap02_inherit.model.vo.Vehicle;

public class InheriRun{
	public static void main(String[] args) {
		
		Airplane a = new Airplane("종이비행기",0.01,"제트기",10,4);
		
		Car c = new Car("벤틀리" , 12.5 ,"세단",4);
		
		Ship s = new Ship("낚시배",3,"어선",1);


		
		System.out.println(a.information());
		System.out.println(c.information());
		System.out.println(s.information());
		
		//처음에는 그냥 움직인다. 라고 나옴
		//오버라이딩 ~_~v
		c.howToMove();
		s.howToMove();
		a.howToMove();
		
		
		System.out.println("========================");
		
		ArrayList<Vehicle> list = new ArrayList<Vehicle>(); // [] 상태
		
		list.add(new Car("벤틀리", 12.5, "세단", 4));
		list.add(new Ship("낚시배", 3, "어선", 1));
		list.add(new Airplane("종이비행기", 0.01, "제트기", 10, 4));
		
		for(int i=0; i<list.size(); i ++) {
			System.out.println(list.get(i).information());
		}
		
		/*
		 * 
		 *  상속의 장점
		 *  
		 *  보다 적은 양의 코드로 새로운 클래스 작성 가능
		 *  코드를 공통적으로 관리하기 때문에 코드의 추가 , 변경에 용이함.
		 *                           (유지보수 , 생산성 up)
		 *  
		 *  상속의 특징
		 *  
		 *  클래스간의 상속에 있어서는 다중상속이 안된다.(단일상속만 가능)
		 *  부모클래스에 정의 되어있는 protected 필드는 자식클래스에서 직접 접근 가능.
		 *  자식객체는 부모클래스에 있는 메소드를 마치 내것처럼 호출 가능
		 *          부모클래스에 있는 메소드가 맘에 안들면 자식클래스에서 변경가능
		 *                                  >> 오버라이딩(@Override)
		 *  명시되어 있지 않지만 모든 클래스엔 extends Object의 자식클래스이다.
		 *        > 그래서 Object 클래스에 있는 메소드를 마음대로 호출 가능!
		 *        > 뿐만 아니라 오버라이딩을 통해서 재정의도 가능함.
		 *        
		 *        
		 */
		
		
		//System.out.println(c == s);
		System.out.println(c.equals(s));
		System.out.println(c.hashCode());
		
		System.out.println(c.toString());
		System.out.println(c/*.toString()*/);
		
		
		
		
		
		
		
		
		
	}
	

	
	
	
}
