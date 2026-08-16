package com.poeratorsprograms.selecationstaements;

import java.util.Scanner;

public class Palindrome {
	static void palind(int n) {
		int orginal=n;
		int revers=0;
		
		for(int i=n;n>0;n=n/10){
			int digit=n%10;
			revers=revers*10+digit;	
			
		}
		if(orginal==revers) {
			System.out.println("Palindrome");
			
		}else {
			System.out.println("not Palindrome ");
		}
	

		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		
		palind(n);
		
	}

}
