package com.poeratorsprograms.selecationstaements;

import java.util.Scanner;

//Factors of number are whole number
//that didide the number exactly without leaving a remainder.

//wap to print factor or divisor of a given number ..?
//input number---6
//output number ----- 2 3 1 =6 perfect number,28
public class Factors {
	void factorinfo(int n) {
		for(int i=1;i<=n/2;i++) {
			
		  if(n % i ==0) {
			System.out.print(i +" ");
		}
		
	}
//	System.out.println(n);
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		
		Factors f=new Factors ();
		f.factorinfo(n);
		
	}

}
