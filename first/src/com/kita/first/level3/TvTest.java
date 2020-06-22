package com.kita.first.level3;

public class TvTest {
	
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		
		System.out.println("name: " + tv1.name);
		System.out.println("power: " + tv1.power);
		System.out.println("channel : " + tv1.channel);
		
		System.out.println("----------------");
		tv1.name = "삼성Tv";
		System.out.println("name: " + tv1.name);
		tv1.changePower();
		System.out.println("power: " + tv1.power);
		tv1.changePower();
		System.out.println("power: " + tv1.power);
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		System.out.println("channel : " + tv1.channel);
	}

}
