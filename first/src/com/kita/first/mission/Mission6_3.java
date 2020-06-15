package com.kita.first.mission;

public class Mission6_3 {
	/*
	2~9단	
	단!! 단이 바뀔때 개행을 한번 더
	 */
	public static void main(String[] args) {
		for(int i=2; i<10; i++) {			
			for(int z=1; z<10; z++) {
				System.out.printf("%d * %d = %d\n", i, z, (i*z));
			}
			System.out.println("-------------");
		}
	}

}
