package com.kita.first.mission;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 1을 입력 : ");
		String n1 = scan.next();
		System.out.println("--=--");
		int num1 = Integer.parseInt(n1);		
		
		System.out.print("숫자 2을 입력 : ");
		String n2 = scan.next();
		
		int num2 = Integer.parseInt(n2);
		
		scan.close();
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		

	}

}
