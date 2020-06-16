package com.kita.first.mission;

import java.util.Random;

public class Practice2 {

	public static void main(String[] args) {
		//랜덤값 뽑기
		
		//0~15
		double r = Math.random();		
		int rVal = (int)(r * 16);		
		
		int rVal2 = (int)(Math.random() * 16);
		System.out.println(rVal2);
		
		//1~15
		int rVal3 = (int)(Math.random() * 15 + 1);
		
		//30~50
		int rVal4 = (int)(Math.random() * 21 + 30);
		
		//46~77
		//77 - 46 + 1 = 32
		int rVal5 = (int)(Math.random() * 32 + 46);
		
	

	}

}
