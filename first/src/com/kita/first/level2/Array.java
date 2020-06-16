package com.kita.first.level2;

public class Array {
	public static void main(String[] args) {
		int[] arr = {10, 20};
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
 		char[] arr2 = new char[20];
 		System.out.printf("char: %c, %d\n", arr2[2], (int)arr2[2]);
 		
		float[] arr3 = new float[10];
		String[] arr4 = new String[200];
		arr4[0] = "dd";
		
		
		int[] arr5 = {10, 20, 30, 40};
		arr = arr5;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		//-----------------------------------
		System.out.println("-------------------");
		
		int[] arr7 = new int[50];
				
		for(int i=0; i<arr7.length; i++) {
			arr7[i] = 5;
		}
		
		for(int i=0; i<arr7.length; i++) {
			System.out.println(i + ": " + arr7[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
