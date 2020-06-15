package com.kita.first.mission;

import java.util.Scanner;

public class Mission7 {

	/*
 	숫자를 입력:(종료:0)1
	숫자를 입력:(종료:0)2
	숫자를 입력:(종료:0)3
	숫자를 입력:(종료:0)4
	숫자를 입력:(종료:0)5
	숫자를 입력:(종료:0)0
	합계 : 15

	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		while(true) {			
			System.out.print("숫자를 입력:(종료:0)");
			int num = scan.nextInt();
			
			if(num == 0) {
				break;
			} 
			sum += num;
			
			
		}
		scan.close();
		System.out.println("합계 : " + sum);

	}

}
