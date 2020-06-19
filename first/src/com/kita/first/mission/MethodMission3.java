package com.kita.first.mission;

public class MethodMission3 {

	public static void main(String[] args) {
		int result = abs(10);
		System.out.println(result);
		
		result = abs(-10);
		System.out.println(result);
	}
	
	public static int abs(int num) {
		/*
		if(num < 0) {
			return -num;
		}
		return num;
		*/
		return (num < 0) ? -num : num;
	}

}
