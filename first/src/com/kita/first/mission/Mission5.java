package com.kita.first.mission;

import java.util.Scanner;

public class Mission5 {

	/*
	 점수를 입력해 주세요: (0~100)
	 90점 이상 A
	 80점 이상 B
	 70점 이상 C
	 나머지는 무조건 D입니다. (+, - 없다)
	 
	 or
	 
	 100초과면 잘 못 입력하였습니다.
	 
	 일의 자리 수가 7점 이상이면 +
	 일의 자리 수가 3점 이하이면 -
	 
	 예를 들어 95 > A, 97 > A+, 83 > B-
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요: (0~100)");
		int score = scan.nextInt();
		scan.close();
				
		if(score > 100 || score < 0) {
			System.out.println("잘 못 입력하였습니다.");
			
		} else if(score >= 90) {
			System.out.print("A");
			
		} else if(score >= 80) {
			System.out.print("B");
			
		} else if(score >= 70) {
			System.out.print("C");
			
		} else {
			System.out.print("D");
		}
		
		/*
		if(score > 100 || score < 0) {
			System.out.println("잘 못 입력하였습니다.");
			
		} else if(score < 70) {
			System.out.print("D");
			
		} else if(score < 80) {
			System.out.print("C");
			
		} else if(score < 90) {
			System.out.print("B");
			
		} else {
			System.out.print("A");
		}
		*/
		
		if(score == 100) {
			System.out.print("+");
		} else if(score >= 70 && score <= 100){
			int mod = score % 10;
			
			if(mod >= 7) {
				System.out.print("+");	
			} else if(mod <= 3) {
				System.out.print("-");
			}
		}
		
	}

}
