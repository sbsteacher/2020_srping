package com.kita.first.level8;

import java.lang.ClassNotFoundException;

public class TryCatchTest {

	public static void main(String[] args) {
		meth();
		
		meth2();
		
		System.out.println("dddd");
		int a = div(10, 2);
		System.out.println("a : " + a);
	}
	
	public static int div(int n1, int n2) {
		try {
			return n1 / n2;	
		} catch(Exception e) {
			
			return 0;
		}		
	}
	
	public static void meth2() throws ClassNotFoundException {
		Class.forName("dsddd");
		
	}
	
	public static void meth() {
		int result = 2;
		try {
			//result = 10 / 0;
			
			Class.forName("dd");
		} catch(ClassNotFoundException e) {
			
		} catch(Exception e) {
			e.
			e.printStackTrace();
			System.out.println("예외가 발생하였습니다.");
		} finally {
			System.out.println("finally");
		}
		System.out.println("result : " + result);
		System.out.println("종료!");
	}

}
