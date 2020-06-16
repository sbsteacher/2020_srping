package com.kita.first.level2;

public class ArrayOrder2 {
	//선택정렬
	public static void main(String[] args) {
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19};
		
		int least;
		for(int i=0; i<arr.length - 1; i++) {
			least = i;
			for(int z=i+1; z<arr.length; z++) {
				if(arr[least] > arr[z]) {
					least = z;
				}
			}
			
			if(least != i) {				
				int temp = arr[least];
				arr[least] = arr[i];
				arr[i] = temp;
			}
		}
		
		for(int val : arr) {
			System.out.print(val + ", ");
		}

	}

}
