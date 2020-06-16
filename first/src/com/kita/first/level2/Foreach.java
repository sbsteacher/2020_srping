package com.kita.first.level2;

public class Foreach {
	public static void main(String[] args) {
		int[] arr = {3, 10, 44, 10, 90, 76, 100};
		/*
			foreach문은 sequence가 있는 객체(배열, ArrayList 등)는 모두 사용가능
			객체가 가지고 있는 값을 순차적으로 하나씩 넘겨준다.
			(자신이 가지고 있는 길이만큼)
		 */		
		for(int val : arr) {
			System.out.println(val);
		}		
		//아래 문장과 같은 의미!!
		for(int i=0; i<arr.length; i++) {
			int val = arr[i];
			System.out.println(val);
		}		
	}

}
