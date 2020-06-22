package com.kita.first.level3;

public class Monitor {
	static String brand;	
	int inch;
	
	void printInfo() {
		System.out.printf("brand: %s, inch: %d\n"
				, this.brand, this.inch);
	}
	
	void printInch() {
		System.out.println(brand);
		System.out.println(inch);
	}
	
	static void printBrand() {
		System.out.println(brand);
	}
}
