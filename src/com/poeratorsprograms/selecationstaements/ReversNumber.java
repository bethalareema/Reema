package com.poeratorsprograms.selecationstaements;

import java.util.Scanner;

public class ReversNumber {
	static int isrevers(int n) {
		
		int rev=0;
		int r=0;

		while(n>0){ 
			r=n%10;//12%10=2 
		    n=n/10;//12/10=1
		    rev=rev*10+r;//0*10=0
			
		}
		return rev;
	}


	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number :");
	int n=sc.nextInt();
	
	 int rev=isrevers(n);
	System.out.println("revers number print" +  rev);
	
	}

}
