package com.kita.first.level6;

public abstract class Player {	
	public abstract void play();	
	public void stop() {
		System.out.println("재생을 멈췄다.");
	}
}

abstract class CDPlayer extends Player {	
	public abstract void ff();	
}

class CDDPlayer extends CDPlayer {
	@Override
	public void play() {
		System.out.println("CD를 재생합니다.");		
	}

	@Override
	public void ff() {
	}
}

class DVDPlayer extends Player {
	@Override
	public void play() {
		System.out.println("DVD를 재생합니다.");		
	}
	
}

