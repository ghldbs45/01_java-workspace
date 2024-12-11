package com.kh.pracitice.array;

import java.util.Arrays;
import java.util.Scanner;

public class Arraypractice {
	
	public void pracitce1() {
		
		int[] num = new int[11];
		
		for(int i=1;i<num.length;i++) {
			num[i]=i;
		}
		for(int i=1;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
	}
	
	public void pracitce2() {
		
		int[] num = new int[11];
		
		for(int i=1;i<num.length;i++) {
			num[i]=num.length-i;
		}
		for(int i=1;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
}
	
	public void pracitce3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수");
		int size = sc.nextInt();
		int[] hi = new int[size];
		
		for(int i=0;i<hi.length;i++) {
			hi[i] = size-i;
		}
		for(int i=0;i<hi.length;i++) {
			System.out.print(hi[i]);
		}
	
	}
	
	public void pracitce4() {
		
		
		String[] str1 = new String[5];
		
		str1[0] = "사과";
		str1[1] = "귤";
		str1[2] = "포도";
		str1[3] = "복숭아";
		str1[4] = "참외";
		
	   System.out.println(str1[1]);
			
		}
	
	
	public void pracitce5() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		System.out.println("찾을 문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		
		
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = str.charAt(i);
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == ch) {
			System.out.print((1+i) + " ");
			count++;
			
		}
	}
	System.out.println(ch +" 개수 "+": "+count);
	
		}
	
	public void pracitce6() {
		
		Scanner sc = new Scanner(System.in);
		String[] days = {"월","화","수","목","금","토","일"};
		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num>=0 && num<=6) {

				System.out.print(days[num]+"요일");
			
		}else {
			System.out.println("잘못 입력하셨습니다");
		}
		
		
		
		
		
	}
	
	public void pracitce7() {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		System.out.println("배열 0번째 인덱스에 넣을 값 : ");
		int first = sc.nextInt();
		
		arr[0] = first;
		
		System.out.println("배열 1번째 인덱스에 넣을 값 : ");
		int two = sc.nextInt();
		arr[1] = two;
		
		System.out.println("배열 2번째 인덱스에 넣을 값 : ");
		int three = sc.nextInt();
		arr[2] = three;
		
		System.out.println("배열 3번째 인덱스에 넣을 값 : ");
		int four = sc.nextInt();
		arr[3] = four;
		
		System.out.println("배열 4번째 인덱스에 넣을 값 : ");
		int five = sc.nextInt();
		arr[4] = five;
		
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("총 합 : "+sum);
		
	}
	
	
	public void pracitce8() {
		
		//3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		//중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		//단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		//다시 정수를 받도록 하세요.

		//ex.
		//정수 : 4
		//다시 입력하세요.
		//정수 : -6
		//다시 입력하세요.
		//정수 : 5
		//1 2 3 2 1
		
		 Scanner sc = new Scanner(System.in);
		 
		 while(true) {
		 System.out.println("3 이상인 홀수 자연수를 입력하세요 : ");
		 int num = sc.nextInt();
		 
		 if(num % 2 == 1 && num >= 0) {
			 for(int i=1;i<num;i++) {
				 System.out.print(i+" ");
			 break;
			 }	}else {
				System.out.println("잘못 입력하셨습니다");
		 }
		 
		
		 }
		 
		 
	}
	public void pracitce9() {
		
		//사용자가 입력한 값이 배열에 있는지 검색하여
		//있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		//단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		
		//ex.
		// 치킨 이름을 입력하세요 : 양념 //     치킨 이름을 입력하세요 : 불닭
		//     양념치킨 배달 가능              불닭치킨은 없는 메뉴입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("치킨 이름을 입력하세요");
		String chi = sc.nextLine();
		
		String[] chi2 = { "양념", "바베큐", "후라이드", "간장" };
		
		int count = 0;
		for (int i = 0; i < chi2.length; i++) {
			if (chi.equals(chi2[i])) {
				count++;
			} 
		}
		
		if(count > 0) {
			System.out.println(chi+"치킨 배달 가능");
			
		}else {
			System.out.println(chi+"치킨은 없는 메뉴입니다");
			
		}
		
	}
	
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력해주세요");
		String num = sc.nextLine();
		
		
		
		char[] originjoo = num.toCharArray();
		char[] joo = originjoo.clone();
		
		for(int i=8;i<joo.length;i++) {
			System.out.print("*");
		}
		for(int i=0;i<joo.length;i++) {
			System.out.print(joo[i]);
		}
		
		
		
	}
	
		
	

	/*public void practice12() 
		
	
		int[] arr = new int[10];
		
		
		
		int temp=0;
			for(int i=0; i << arr.length; i++) { 
				for(int j=1; j<arr.length; j++) {
						if(arr[j-1] > arr[j]) {
							temp = arr[j-1];
							arr[j-1] = arr[j];
							arr[j] = temp;
						}
					}
				}
			
			
			for (int=0;<arrlength;i++) {
				System.out.println(arr[i] +" " );
				
				
			}
			System.out.println("최소값 : " + arr[0]);
			System.out.println("최대값 : " + arr[9]);
	}
	*/
	
	public void practice13() {
		
		
	//	메소드 명 : public void practice13(){}
	//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
	//	1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.

	//	ex.
	//	4 1 3 6 9 5 8 10 7 2
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length;i++) { 
			arr[i] = (int)(Math.random()*10+1);
			for(int j=0;j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
			
			
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice14() {

		
		
	//	메소드 명 : public void practice14(){}
	//	로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.

	//	ex.
	//	3 4 15 17 28 40
		
		
		
		int[] lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45+1);
			for(int j=1;j<i;j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		
		// 오름차순으로 정렬
		int temp = 0;
		for(int i=0; i<lotto.length;i++) {
			for(int j=1; j<lotto.length;j++) {
				if(lotto[j-1]  > lotto[j]) {
					temp = lotto[j-1];
					lotto[j-1] = lotto[j];
					lotto[j]=temp;
				}
			}
		}
		for(int i=0; i<lotto.length;i++) {
		System.out.print(lotto[i]+" ");
	}
}

	public void practice15() {
		
	//	메소드 명 : public void practice15(){}
	//	문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
	//	문자의 개수와 함께 출력하세요.

	//	ex.
	//	문자열 : application
	//	문자열에 있는 문자 : a, p, l, i, c, t, o, n
	//	문자 개수 : 8
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		int count = 0;
		
		System.out.println("문자열에 있는 문자 : ");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
			
			boolean flag = true; // 안겹쳤다
			
			for(int j=0;j<i;j++) {
				if(arr[i] == arr[j]) {
					flag = false;// 겹쳤다.
				}
			}
			
			if(flag == true) { // 안겹칠때만 출력
				count++;
				if(i==0) { // 첫글자일때
					System.out.println(arr[i]);
				}else {
					System.out.print(arr[i]+" ");
				}
			
			}
		}
		System.out.print("\n 문자 개수 : " + count);
		
		
		
		
		
	}


	
	public void practice16() {
		
		/*메소드 명 : public void practice16(){}
		사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
		배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
		단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
		늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
		사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		
		ex.
		배열의 크기를 입력하세요 : 3
		1번째 문자열 : 자바의 정석
		2번째 문자열 : 알고리즘
		3번째 문자열 : C프로그래밍
		더 값을 입력하시겠습니까?(Y/N) : y
		더 입력하고 싶은 개수 : 2
		4번째 문자열 : 인간관계
		5번째 문자열 : 자기계발
		더 값을 입력하시겠습니까?(Y/N) : y
		더 입력하고 싶은 개수 : 1
		6번째 문자열 : 영단어600
		더 값을 입력하시겠습니까?(Y/N) : n
		[자바의 정석, 알고리즘, C프로그래밍, 인간관계, 자기계발, 영단어600]
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 크기를 입력해주세요 : ");
		int size = sc.nextInt();
		
		sc.nextLine();
		
		String[] arr1 = new String[size];
		for(int i=0; i<arr1.length;i++) {
			System.out.print(i+1+ "번쨰문자열 : ");
			arr1[i] = sc.nextLine();
		}
		
		while(true) {
			System.out.println("더 입력하시겠습니까 ? ");
			char yn = sc.nextLine().charAt(0);
			
			if(yn == 'y') {
				System.out.println("더 입력하고 싶은 갯수 : ");
				int num = sc.nextInt();
				
				sc.nextLine();
				//깊은복사
				String[] arr2 = Arrays.copyOf(arr1, arr1.length + num);
				
				for(int i=arr1.length; i<arr2.length; i++) {
					System.out.print(i+1+"번째 문자열 : ");
					arr2[i] = sc.nextLine();
					
					
				}
				//얕은 복사
				arr1=arr2;
				
				
			}else {
				System.out.print("[");
				for(int i=0; i<arr1.length;i++) {
					if(i== arr1.length -1 ) {
						System.out.print(arr1[i] + "]");
					}else {
						System.out.print(arr1[1] + " , ");
					}
				}
				break;
			}
		}
	}


}


	
	
	

