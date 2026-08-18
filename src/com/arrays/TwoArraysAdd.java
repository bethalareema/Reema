package com.arrays;

import java.util.Arrays;

public class TwoArraysAdd {

	public static void main(String[] args) {
		
		int a1[]= {1,3,5,6};
		int a2[]= {4,5,7,8,9,2};
		
		int a3[]=new int[a1.length+a2.length];
		
		for(int i=0;i<a1.length;i++) {
			a3[i]=a1[i];
			
		}
			for(int i=0;i<a2.length;i++) {
				a3[a1.length+1]=a2[i];
				System.out.print(a3[i]+" ");
			}
			System.out.println(Arrays.toString(a3));
			
	}

}
