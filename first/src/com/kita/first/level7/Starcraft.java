package com.kita.first.level7;

public class Starcraft {

	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Medic medic = new Medic();
		FireBat fb = new FireBat();
		
		fb.attack(m1);
		fb.attack(m1);
		fb.attack(m1);
		
		System.out.println(m1);
		
		m1.attack(fb);
		m1.attack(fb);
		
		System.out.println(fb);
		
		medic.heal(fb);
		medic.heal(m1);
		
		
		System.out.println(fb instanceof Carable);
		System.out.println(m1 instanceof Carable);
		

	}

}









