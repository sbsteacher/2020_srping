package com.kita.first.level2;

import java.util.Arrays;

public class ArrCopy2 {
	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 7, 10, 55};	
		
		int[] arr2 = copyArr(arr);
		int[] arr3 = copyArr(arr);
		System.out.println(arr == arr2);
		System.out.println(arr == arr3);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr2 : " + Arrays.toString(arr2));
		System.out.println("arr3 : " + Arrays.toString(arr3));
	}
	
	public static int[] copyArr(int[] arr) {
		int[] temp = new int[arr.length];		
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		return temp;
	}
}


