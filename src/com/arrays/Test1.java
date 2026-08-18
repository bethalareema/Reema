package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	
	static void test1() {
//		int number[]=new int[size];
//		System.out.println("Odd numbers");
//		for(int a=0;a<size;a++) {
//			if(number[a] %2 ==1) {
//				System.out.println(number[a]);
//				
//			}
//	}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size :");
		int size=sc.nextInt();
		
		System.out.println("Enter the elements:");
		int number[]=new int[size];	//10---0 to 9
    	for(int i=0;i<size;i++) {
    		//System.out.print(number[i]+ " ");
			number[i]=sc.nextInt();
		}
	System.out.println("even nubers");
	for(int i=0;i<size;i++) {
		if(number[i] % 2 ==0) {
			System.out.println(number[i]);
			
		}
	}
		System.out.println("Odd numbers");
		for(int a=0;a<size;a++) {
			if(number[a] %2 ==1) {
				System.out.println(number[a]);
				
			}
	}
	System.out.println(Arrays.toString(number));
	}
}
