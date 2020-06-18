package com.kita.first.mission;

public class MethodMission2 {

	public static void main(String[] args) {
		//printStar(6);		
		//printStar(3);
		//printStarSqure(4);
		//printStarTriangle(5);
		printStarTriangleReverse(5);	
	}
	
	public static void printStarTriangleReverse(int star) {
		for(int i=star-1; i>=0; i--) {			
			printChar(' ', i);
			printStar(star-i);
		}
	}
	
	public static void printChar(char ch, int cnt) {
		for(int i=0; i<cnt; i++) {
			System.out.print(ch);
		}
	}
	
	public static void printStarTriangle(int star) {
		for(int i=1; i<=star; i++) {
			printStar(i);
		}
	}
	
	public static void printStarSqure(int star) {
		for(int i=0; i<star; i++) {
			printStar(star);
		}
	}
	
	public static void printStar(int star) {
		for(int i=0; i<star; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
