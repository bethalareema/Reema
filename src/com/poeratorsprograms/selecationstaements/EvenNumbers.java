package com.poeratorsprograms.selecationstaements;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		int sum=0;

		for(int i=0;i<=n;i++) {
			
			sum=i+sum;
		
		}
		System.out.println(sum);
	}

}
