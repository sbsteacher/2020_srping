package com.kita.first.level2;

public class Break {

	public static void main(String[] args) {
		
		for(int z=0; z<10; z++) {
			for(int i=0; i<3; i++) {	
				for(int e=0; e<3; e++) {
					if(z == 3) { break; }
					System.out.printf("%d - %d - %d\n", z, i, e);	
				}
			}	
		}
		
		
		
			

	}

}
