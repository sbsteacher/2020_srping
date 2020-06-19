package com.kita.first.level2;

public class Method4 {

	public static void main(String[] args) {
		sum(4, 5);
		sum(5, 7, 9);
		sum(1, 2, 3, 4);
		sum("", 1, 2, 3, 4, 5);
	}
	
	public static void sum(int a, int ...arr) {
		
	}
	
	public static void sum(String g, int ...arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum: " + sum);
	}

}
