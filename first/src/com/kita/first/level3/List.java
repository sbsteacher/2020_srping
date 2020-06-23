package com.kita.first.level3;

import java.util.Arrays;

public class List {	
	//리터럴을 4만 사용할 수 있음
	//arr = new int[]{1, 2, 3, 4}; //금지!!! 
			
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int[] temp = new int[arr.length + 1];		
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}		
		temp[arr.length] = 4;		
		arr = temp;
		System.out.println(Arrays.toString(arr));

	}

}
