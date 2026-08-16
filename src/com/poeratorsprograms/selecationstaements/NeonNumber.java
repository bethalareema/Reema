package com.poeratorsprograms.selecationstaements;

import java.util.Scanner;

public class NeonNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The number :");
		int n=sc.nextInt();
		
		int s=n*n;//s=9*9=81
		int sum=0;
		
         for (;s>0;s=s/10){//81>0 81=81/10=
			int digit=s%10;//last digit kavali ante using % 81%10=1
			sum=sum+digit;//0+8=8
			s=n/10;	
			
         if(s==0) {
			System.out.println(n +" is a neon number");
		}else {
			System.out.println(n +" is a not neon number");
		}
		
         }
	}
}
		