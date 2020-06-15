package com.kita.first.mission;

public class Mission6_7 {

	public static void main(String[] args) {
		int star = 5;
		for(int i=1; i<=star; i++) {			
			for(int z=star; z>0; z--) {
				System.out.print(i<z ? " " : "*");				
			}
			System.out.println();
		}
	}

}
