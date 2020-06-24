package com.kita.first.level3;

import java.util.Arrays;

public class MyListTest {
	public static void main(String[] args) {
		MyList list = new MyList();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(1, 1200);
		
		list.remove();
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		
		
	}
}

class MyList {	
	private int[] arr;
	
	MyList() {
		init();
	}
	
	private void init() {
		arr = new int[0];
	}
	
	int size() {
		return arr.length;
	}
	
	int get(int idx) {
		return arr[idx];
	}
	
	int remove(int idx) {
		int[] temp = new int[arr.length - 1];
		for(int i=0; i<temp.length; i++) {
			temp[i] = arr[i < idx ? i : i + 1];
		}
		int delVal = arr[idx];
		arr = temp;
		return delVal;
	}	
	int remove() {
		return remove(arr.length - 1);
	}
	
	void add(int idx, int num) {
		int[] temp = new int[arr.length + 1];		
		for(int i=0; i<arr.length; i++) {
			temp[(i < idx) ? i : i + 1] = arr[i];
		}		
		temp[idx] = num;
		arr = temp;
	}
	
	void add(int num) {
		add(arr.length, num);
	}
}




