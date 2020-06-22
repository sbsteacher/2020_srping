package com.kita.first.level3;

//사용자 정의 클래스
public class Tv {
	String name;
	boolean power;
	int channel;
	
	void changePower() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
}
