package com.kita.first.mission;

import java.util.Scanner;

public class Mission4 {

	/*
	 	switch로 해결
		월을 입력해 주세요 : (1~12)
		
		3~5을 입력했다면 "봄 입니다."
		6~8을 입력했다면 "여름 입니다."
		9~11을 입력했다면 "가을 입니다."
		1,2,12 을 입력했다면 "겨울 입니다."
		1~12가 아닌 값을 입력했다면 "잘 못 입력하셨습니다."
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("월을 입력해 주세요 : (1~12)");
		String mon = scan.next();
		scan.close();
		
		switch(mon) {
		case "1": case "2": case "12":
			System.out.println("겨울 입니다.");
			break;
		case "3": case "4": case "5":
			System.out.println("봄 입니다.");
			break;
		case "6": case "7": case "8":
			System.out.println("여름 입니다.");
			break;
		case "9": case "10": case "11":
			System.out.println("가을 입니다.");
			break;
		default:
			System.out.println("잘 못 입력하셨습니다.");
				
		}
		
		

	}

}
