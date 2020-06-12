package com.kita.first;

public class Operator6 {

	public static void main(String[] args) {
		String str1 = "안녕1";
		String str2 = "안녕2";
		
		String str3 = str1;
				
		System.out.println(str1 == str3);
		System.out.println(str2.equals(str1));
		System.out.println("안녕1".equals(str1));
		System.out.println("안녕4".equals("안녕5"));
		System.out.println(str2.equals("안녕6"));

	}

}
