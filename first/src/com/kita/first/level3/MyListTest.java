package com.kita.first.level3;

public class MyListTest {
	public static void main(String[] args) {
		MyList list = new MyList();
		list.add(10);
		list.add(15);
		list.add(20);
	
		list.remove(0); //1번 인덱스 방 삭제
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		//ex) 1,2,3,4 > 1,3,4
		
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
	
	void remove(int idx) {
		int[] temp = new int[arr.length - 1];
		for(int i=0; i<temp.length; i++) {
			if(i < idx) {
				temp[i] = arr[i];
			} else {
				temp[i] = arr[i+1];
			}
		}
		arr = temp;
	}
	
	void remove() {
		int[] temp = new int[arr.length - 1];
		for(int i=0; i<temp.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}
	
	void add(int num) {
		int[] temp = new int[arr.length + 1];
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = num;
		arr = temp;
	}
}




