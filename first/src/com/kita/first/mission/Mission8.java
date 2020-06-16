package com.kita.first.mission;

import java.util.Scanner;

public class Mission8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int min = 10;
		int max = 80;		
		System.out.printf("랜덤값 %d~%d을 맞추는 게임\n", min, max);
		int rVal = (int)(Math.random() * (max - min + 1) + min);
		
		while(true) {
			System.out.print("값 입력: ");
			int val = scan.nextInt();
			
			if(val < min || val > max) {
				System.out.println("범위에 값을 입력하세요.");
			} else if(rVal > val) {
				System.out.println("UP!");
			} else if(rVal < val) {
				System.out.println("DOWN!");
			} else {
				break;
			} 
		}
		System.out.println("Great!!");
		scan.close();
		
	}
}
