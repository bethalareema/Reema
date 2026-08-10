package com.poeratorsprograms.selecationstaements;

import java.util.Scanner;
public class Factors {
	void factorinfo(int n) {
		for(int i=1;i<=n/2;i++) {
			
		  if(n % i ==0) {
			System.out.println(i +"");
		}
		
	}
	System.out.println(n);
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		
		Factors f=new Factors ();
		f.factorinfo(n);
		
	}

}
