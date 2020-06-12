package com.kita.first;

public class Variable2 {
	
	public static void main(String[] args) {
		int num = 10;		
		int num2, num3 = 20;		
		int num4 = 10, num5 = 20;
		
		//이름 주의사항!
		//1. 소문자 시작!! (가능한 카멜 케이스 기법 사용) int myMaxHeight;
		//2. 특수기호는 _(언더바), $(달러)만 사용 가능 - 특수기호로 시작해도 무방!
		//3. 숫자로 시작 NoNo해!!, 뒤에 붙이는 건 Ok! e.g) int 12a (x);  , int top10; int top10Good (o)
		//4. 예약어(보라색) 사용 금지! e.g) int char;
		//5. 변수명 띄우시면 NoNO해! e.g) int aa aa;
		//6. 대소문자를 가린다. e.g.) int aa, aA, Aa, AA;
		
		final int MY_MAX_HIEGHT = 1_000_000;
		
		final int HEIGHT;
		HEIGHT = 100;
		//HEIGHT = 120;
		System.out.println(MY_MAX_HIEGHT);

	}
	
}
