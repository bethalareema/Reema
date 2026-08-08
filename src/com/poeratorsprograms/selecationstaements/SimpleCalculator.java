package com.poeratorsprograms.selecationstaements;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String yn=" ";
		
	do {
		
		System.out.println("Enter the A value :");
		int a=sc.nextInt();
		
		System.out.println("Entre the B Value :");
		int b=sc.nextInt();
		
		System.out.println("Enter the Symbol :");
		String symbol=sc.next();
		
		
		switch(symbol) {
		
		case "+"->System.out.println(a + b);
		case "-" ->System.out.println(a - b);
		case "*" -> System.out.println(a * b);
		case "/"->System.out.println(a / b);
		case "%"->System.out.println(a % b);
			
			default->System.out.println("Entered Nuknow Symbol to proceed");
		}
		System.out.println("do you want to contiune! clike y for yes, n for no!");
		yn=sc.next();
	   

	}while(yn.equalsIgnoreCase("N"));
	System.out.println("Exit for the program!");
		
		}

}
