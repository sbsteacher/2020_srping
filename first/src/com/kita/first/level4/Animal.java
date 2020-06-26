package com.kita.first.level4;

public class Animal extends Object {
	private String name;
	private String type; //포유류, 조류, 어류
		
	public Animal(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	void crying() {
		System.out.println("울다~~");
	}
	
	void eat() {
		System.out.println("먹다~~");
	}
	
	void whoAmI() {
		System.out.printf("나는 %s입니다.\n", name);
	}
}
