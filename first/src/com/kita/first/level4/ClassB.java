package com.kita.first.level4;

public class ClassB extends ClassA {
	public ClassB() {
		super();
		System.out.println("나 ClassB요.");
	}
	@Override
	void write() {
		System.out.println("비를 쓰다.");
	}
	@Override
	void print() {
		System.out.println("B");
	}	
	void showMe() {
		System.out.println("B의 showMe");
	}
}
