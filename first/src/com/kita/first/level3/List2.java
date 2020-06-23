package com.kita.first.level3;

import java.util.ArrayList;
public class List2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(10);
		
		list.add(2, 11);
		
		list.remove(list.size() - 1);
		list.remove(list.size() - 1);
		
		int value = list.get(2);
		System.out.println(value);
		
		for(Integer val : list) {			
			System.out.print(val + ", ");
		}

	}

}









