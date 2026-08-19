package com.arrays;

public class TwoDArray {

	public static void main(String[] args) {
		
		int [][]numbers=new int[3][4];//0 1 2-----0 1 2 3 4
		
		System.out.println(numbers.length);
		System.out.println(numbers[1].length);
		System.out.println(numbers[2].length);
		System.out.println(numbers[0].length);
		
		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[0][2] = 30;
		numbers[0][3] = 40;

		numbers[1][0] = 50;
		numbers[1][1] = 60;
		numbers[1][2] = 70;
		numbers[1][3] = 80;

		numbers[2][0] = 90;
		numbers[2][1] = 100;
		numbers[2][2] = 110;
		numbers[2][3] = 120;
		

		
//		for(int[] n1:numbers) {
//			for(int n:n1) {
//				System.out.print(n+" ");
//				
//			}
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers.length;j++) {
				
				System.out.print(numbers[i][j]+" ");
				
			}
			System.out.println( );
		}
	}

}
