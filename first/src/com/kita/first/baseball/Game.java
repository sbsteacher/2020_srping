package com.kita.first.baseball;

public class Game {

	public static void main(String[] args) {
		int gameCnt = 3;
		Baseball ball = new Baseball(gameCnt);
		MyBall myBall = new MyBall(gameCnt);
		
		myBall.setNumbers();
		
		//숫자1: 3
		//숫자2: 6
		//숫자3: 8
		

	}

}
