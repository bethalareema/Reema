package com.poeratorsprograms.selecationstaements;

import java.util.Scanner;
//input 9
//output 
//9 X 1 = 9..

public class Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=sc.nextInt();
		
		System.out.println("How many times to print:");
		int n1=sc.nextInt();
		
		
		for(int i=1;i<=n1;i++) {
			System.out.println(n + " X " + i + " = " + n * i);
		}
	}

}
