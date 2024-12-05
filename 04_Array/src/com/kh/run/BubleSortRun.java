package com.kh.run;

public class BubleSortRun {

	public static void main(String[] args) {
		
		int[] arr = {22,90,30,68,87,1,13};
		
		int temp = 0;
		
		for (int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[j-1] > arr[j]) { // 앞에 숫자가 뒤에 숫자보다 클 경우
					temp = arr[j-1]; // 임시보관소에 앞에 있는 숫자 (큰숫자) 보관
					arr[j-1] = arr[j]; // 작은 숫자를 비어있는 앞 자리에 넣는다.
					arr[j] = temp; // 임시보관소에 보관했었던 큰 숫자를 다시 뒷자리에 넣는다.
				}
			}
		}
		for (int i=0; i<arr.length;i++) { 
			System.out.print(arr[i]+" ");
		}

	}

}
