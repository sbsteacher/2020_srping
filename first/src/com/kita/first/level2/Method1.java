package com.kita.first.level2;

public class Method1 {	

	public static void main(String[] args) {		
		sum(15, 10);
		minus(20, 5);		
		
	}
	
	public static void sum(int n1, int n2) {
		System.out.println(n1 + n2);	
		minus(n1, n2);
		
	}

	public static void minus(int n1, int n2) {
		System.out.println(n1 - n2);
	}
	
}
