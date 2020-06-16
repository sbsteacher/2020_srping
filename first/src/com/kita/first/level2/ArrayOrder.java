package com.kita.first.level2;

public class ArrayOrder {

	//순차정렬
	public static void main(String[] args) {
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19};
		
		for(int i=0; i<arr.length - 1; i++) {			
			for(int z=i+1; z<arr.length; z++) {
				if(arr[i] > arr[z]) {
					int temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;
				}
			}
			
			
		}
		
		for(int val : arr) {
			System.out.print(val + ", ");
		}

		
	}

}
