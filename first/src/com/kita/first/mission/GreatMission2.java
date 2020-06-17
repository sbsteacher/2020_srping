package com.kita.first.mission;

import java.util.Scanner;

public class GreatMission2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] menuArr = {"사이다", "콜라", "환타", "마운틴듀"
				, "초코우유", "바나나우유"};
		int[] priceArr = {500, 600, 700, 800, 400, 400};

		System.out.println("-메뉴-");
		for(int i=0; i<menuArr.length; i++) {
			System.out.printf("%d. %s(%,d원)\n"
					, (i+1), menuArr[i], priceArr[i]);
		}		
		int sum = 0;
		while(true) {
			System.out.print("메뉴를 선택하세요: (종료:0) ");
			int idx = scan.nextInt();			
			if(idx == 0) {
				break;
			} else if(idx < 0 || idx > menuArr.length) {
				System.out.println("잘 못 입력!");
				continue;
			}			
			int tIdx = idx - 1;
			System.out.printf("%s %,d원\n"
					, menuArr[tIdx], priceArr[tIdx]);
			sum += priceArr[tIdx];			
		}	
		scan.close();
		System.out.printf("종료! %,d원 사용\n", sum);		
	}
}
