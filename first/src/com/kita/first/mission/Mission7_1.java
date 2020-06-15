package com.kita.first.mission;

public class Mission7_1 {

	/*
	 * while문에 조건식을 사용하여
	 * 1~100을 모두 더한 값이 출력되도록 하세요
	 * 합계: 5050
	 */
	public static void main(String[] args) {
		int sum = 0, i = 1;
		
		while(i <= 100) {
			sum = sum + i;
			i++;
		}
		
		System.out.println("합계 : " + sum);
		
		
		/*
		int sum = 0, i = 0;		
		while(i++ < 100) {
			sum += i;
		}		
		System.out.println("합계 : " + sum);
		 */
	}

}
