package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
		// 위의 사용 데이터 참고하여 3명의 학생 정보 초기화

		Student[] arr = new Student[3];
		arr[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		arr[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		arr[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신학과");

		// 위의 학생 정보 모두 출력

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])

		Employee[] arr1 = new Employee[10];

		// 사원들의 정보를 키보드로 계속 입력 받고 → while(true) 무한 반복문을 통해
		// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체 배열에 객체 생성
		// 한명씩 추가 될때마다 카운트함
		// 계속 추가할 것인지 물어보고, 대소문자 상관없이 y이면 계속 객체 추가
		// ‘n’일 경우 더 이상 그만 입력 받도록 ...

		Scanner sc = new Scanner(System.in);

		int count = 0;
		while (true) {
			for (int i = 0; i < arr1.length; i++) {

				System.out.println("이름 : ");
				String name = sc.nextLine();

				System.out.println("나이 : ");
				int age = sc.nextInt();

				System.out.println("신장 : ");
				double height = sc.nextDouble();

				System.out.println("몸무게 : ");
				double weight = sc.nextDouble();

				System.out.println("급여 : ");
				int grade = sc.nextInt();

				sc.nextLine();

				System.out.println("부서 : ");
				String major = sc.nextLine();

				arr1[i] = new Employee(name, age, height, weight, grade, major);
				count++;
				System.out.println("계속 추가하시겠습니까 ? (Y/N)");
				char yn = sc.nextLine().charAt(0);

				if (yn == 'n' || yn == 'N') {
					System.out.println("그만 입력 하겄습니다요");
					break;
				} else {
				}
			}
			for (int i = 0; i < arr1.length; i++) {
				if (arr1.length > count) {
					System.out.println(arr1[i].toString());
				} else {
					break;
				}

				// 배열에 담긴 사원들의 정보를 모두 출력

			}

		}
	}
}
