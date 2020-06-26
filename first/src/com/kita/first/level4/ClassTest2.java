package com.kita.first.level4;

public class ClassTest2 {

	public static void main(String[] args) {
		ClassA clsA = new ClassB();
		
		clsA.print();
		//clsA.showMe();
		
		ClassB clsB = (ClassB)clsA;
		clsB.showMe();

	}

}
