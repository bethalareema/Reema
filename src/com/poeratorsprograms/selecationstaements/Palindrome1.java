package com.poeratorsprograms.selecationstaements;

import java.util.Scanner;

public class Palindrome1 {
	static boolean ispalindro(int n){
		boolean result=false;
		int temp=n;
		int rev=0;
		int r=0;
		for(int i=0;i<=n;i++){
			r=temp%10;
			temp=temp/10;
			rev=rev+temp;
		
			
		if(temp==rev) {
			return true;
		}else {
			return false;
		}
	}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		
		boolean result=ispalindro(n);
		
		if(result) {
			System.out.println("Palindrome");
			
		}else {
			System.out.println("not Palindrome ");
		}
	
		

	}

}
