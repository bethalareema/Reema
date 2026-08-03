package com.poeratorsprograms;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first Number :");
		int a = sc.nextInt();
		System.out.println("Enter Second Number :");
		int c = sc.nextInt();

		System.out.println("Enter operator(+ or -):");
		char s = sc.next().charAt(0);

		//int result = (s.equalsIgnoreCase("+")) ? (a + c) : (a - c);
		int result =(s=='+')?(a+c):(a-c);
		
		System.out.println(result );

	}

}
