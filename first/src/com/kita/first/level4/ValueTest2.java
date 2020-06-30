package com.kita.first.level4;

public class ValueTest2 {

	public static void main(String[] args) {
		String str = new String("안녕");
		System.out.println(str);
		
		System.out.println();
		
		Value val = new Value(2000);
		System.out.println("val : " + val);	
		
		String strVal = String.valueOf(val);
		String strVal2 = val.toString();
		

	}

}
