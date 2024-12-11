package com.kh.hw1.view;

import com.kh.hw1.controller.StudentController;
import com.kh.hw1.model.vo.Student;

public class StudentMenu {

	private StudentController sm = new StudentController();

	public StudentMenu() {
		Student[] sArr = sm.printStudent();
		
		System.out.println("정회윤 '-'v");
		System.out.println();

		// StudentController 에 printStudent()의 반환값을 통해 학생 정보 출력
		System.out.println("========== 학생 정보 출력 ==========");

		for (Student s : sArr) {
			System.out.println(s.information());
		}

		System.out.println("========== 학생 성적 출력 ==========");
		// StudentController 에 avgScore()를 통해 점수 합계와 평균 출력

		System.out.println("학생 점수 합계 : " + sm.sumScore());
		double[] avg = sm.avgScore();
		System.out.println("학생 점수 평균 : " + avg[1]);
		
		

		System.out.println("========== 성적 결과 출력 ==========");
		// 학생의 점수가 CUT_LINE 미만이면 재시험 대상 , 이상이면 통과 출력
		for (Student s : sArr) {
			if (s.getScore() >= StudentController.CUT_LINE) {
				System.out.println(s.getName() + " 학생은 통과입니다 ");
			} else {
				System.out.println(s.getName() + " 학생은 재시험 대상입니다.");
			}
		}

	} 
	
}


