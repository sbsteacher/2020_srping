package com.kita.first.level4;

public class Bird extends Animal {
		
	protected Bird(String name) {
		super(name, "조류");
	}
	
	void flying() {
		System.out.println("훨~ 훨~");
	}
	
	@Override
	void crying() {
		super.crying();
		System.out.println("짹짹!!");		
	}
}






