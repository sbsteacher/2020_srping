package com.kita.first.level7;

public class Medic extends Unit {

	public Medic() {
		super("메딕", 70);
	}
	
	public void heal(Unit unit) {
		if(unit == this || !(unit instanceof Carable)) {
			System.out.println("치료할 수 없습니다.");
			return;
		}		
		unit.setCurrent_hp(unit.MAX_HP);
	}
}
