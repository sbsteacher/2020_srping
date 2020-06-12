package com.kita.first;

public class Variable {
	public static void main(String[] args) {
		char v1;
		v1 = 'A';
		System.out.println(v1);
		System.out.println('A');
				
		v1 = 'B';
		System.out.println(v1);
		
		byte v2;
		short v3;
		int v4;
		long v5;
		
		v2 = 127;
		v3 = 540;
		v4 = 2147483647;
		v5 = 50;
				
		System.out.println();
		System.out.println(v2 + v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		
		float v6;
		v6 = (float)10.1;
		v6 = 10.1f;
		v6 = 10.1F;
		
		double v7;
		v7 = 10.1;
		
		v6 = (float)v7;
		
		boolean v8;
		System.out.println();
		v8 = true;
		System.out.println(v8);
		v8 = false;
		System.out.println(v8);
						
		String r1;
		r1 = "안녕하세요.";	
				
		System.out.println(r1);
		
	}
}
