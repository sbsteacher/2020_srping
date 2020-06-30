package com.kita.first.level7;

public class Starcraft {

	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		m2.attack(m2);
		m2.attack(m2);
		
		System.out.println("m1: " + m1);
		System.out.println("m2: " + m2);

	}

}
