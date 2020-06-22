package com.kita.first.level3;

public class Monitor2 {
	String brand;	
	int inch;
	static int cnt;
	
	public Monitor2(String brand, int inch) {
		super();
		cnt++;
		this.brand = brand;
		this.inch = inch;
	}
	
	void printInfo() {
		System.out.printf("brand: %s, inch: %d\n"
				, this.brand, this.inch);
	}
}


