package com.kita.first.mission;

import java.util.Scanner;

public class Mission3_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("성별을 입력해 주세요: (남/여)");
		String gender = scan.nextLine();
		
		if("남".equals(gender) || "여".equals(gender)) {
			
			System.out.print("키를 입력해 주세요:");
			int height = scan.nextInt();
			
			int standHeight = 150;
			
			if("남".equals(gender)) {			
				standHeight = 160;
			}
						
			if(height > standHeight) {
				System.out.println("평균 초과입니다.");
			} else if(height < standHeight) {
				System.out.println("평균 미만입니다.");
			} else {
				System.out.println("평균입니다.");
			}
			
		} else {
			System.out.println("성별을 잘 못 입력하셨습니다.");
		}
		
		

	}

}
