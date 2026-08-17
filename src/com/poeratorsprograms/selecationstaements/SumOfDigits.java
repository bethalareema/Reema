package com.poeratorsprograms.selecationstaements;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Digits :");
		int n=sc.nextInt();
		
		int digit=digit(n);
		System.out.println("sum of digite :");
		System.out.println(digit);
		
		
	}
	static int digit(int n) {
		 int sum=0;
		 int r=0;
		 
//		 while(n>0)
		 for(int i=1;i<=n;){
			 r=n%10;//123%10=3--12%10=2---1%10=1
			 n=n/10;//123/10=2---12/10=1---1/10=0
			 sum=sum+r;//0+3=3---3+2=5--5+1=6 
		 }
		 return sum; 
	}
}

