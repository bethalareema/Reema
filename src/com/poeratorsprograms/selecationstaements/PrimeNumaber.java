package com.poeratorsprograms.selecationstaements;

import java.util.Scanner;

public class PrimeNumaber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Prime Number :");
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++) {
		if(isprime(i)) {
			System.out.println(i);
			
		}
	  }
	}
static boolean isprime(int n) {
		boolean prime=true;
			if(n==0||n==1) {
				return false;
				
			}
			for(int i =2;i<=n/2;i++) {
				if(n%i==0) {
					prime=false;
					break;
				}
			}
			
		
		return prime;
		
	}
			
		
}
