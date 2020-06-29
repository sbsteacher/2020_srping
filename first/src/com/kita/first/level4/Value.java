package com.kita.first.level4;

public class Value {	
	private int val;
	
	public Value(int val) {
		this.val = val; 
	}

	public int getVal() {
		return val;
	}
	
	@Override
	public boolean equals(Object obj) {
		Value objValue = (Value)obj;
		return this.val == objValue.getVal();
	}
}






