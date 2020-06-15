package com.kita.first.mission;

import java.util.Scanner;

public class Mission5_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요: (0~100)");
		int score = scan.nextInt();
		scan.close();
		
		if(score > 100 || score < 0) {
			System.out.println("잘 못 입력하였습니다.");
			return; //메소드를 종료!!!
		}

		String opt = "";
		int mod = score % 10; //1의 자리수 얻기
		if(mod >= 7) {
			opt = "+";
		} else if(mod <= 3) {
			opt = "-";
		}
		
		switch(score / 10) { //10의 자리수 얻기
		case 10:
			System.out.print("A+"); break;
		case 9:			
			System.out.print("A" + opt); break;
		case 8:
			System.out.print("B" + opt); break;
		case 7:
			System.out.print("C" + opt); break;
		default:
			System.out.print("D");	
		}

	}

}
