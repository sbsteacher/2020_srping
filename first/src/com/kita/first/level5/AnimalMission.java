package com.kita.first.level5;

public class AnimalMission {

	public static void main(String[] args) {		
		Dog dog = new Dog();	
		dog.cry();
		Cat cat = new Cat();		
		Sparrow spa = new Sparrow();
		doCry(dog);
		doCry(cat);
		doCry(spa);
	}
	
	public static void doCry(Animal ani) {
		ani.cry();
	}

}
