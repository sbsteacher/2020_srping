package com.kita.first.level3;

public class MonitorTest3 {

	public static void main(String[] args) {
		Monitor2 m1 = new Monitor2("삼성", 22);
		Monitor2 m2 = new Monitor2("LG", 30);
		Monitor2 m3 = new Monitor2("Sony", 20);
		
		System.out.printf("지금까지 생산한 Monitor 수 : %d\n",
				Monitor2.cnt);
		

	}

}
