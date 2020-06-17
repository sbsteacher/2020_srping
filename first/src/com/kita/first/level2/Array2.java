package com.kita.first.level2;

public class Array2 {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		arr[0][0] = 10;
		arr[0][1] = 20;
		
		
		int[][] arr2 = {
				{10, 20, 30},
				{12, 13, 14}, 
				{1, 2, 3}
		};
		
		
		for(int i=0; i<arr2.length; i++) {
			for(int z=0; z<arr2[i].length; z++) {
				System.out.print(arr2[i][z] + ", ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
