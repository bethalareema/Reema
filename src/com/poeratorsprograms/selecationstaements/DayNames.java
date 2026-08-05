package com.poeratorsprograms.selecationstaements;
import java.util.Scanner;

public class DayNames {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=" ";
		
	do {
		 System.out.println("Enter the Number :");
		 int Day =sc.nextInt();
		 
		switch(Day) {
		case 1:
			System.out.println("Monday");
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesaday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		case 7:
			System.out.println("sunday");
			break;
			
			default:
			System.out.println("Invalide Day Number");
		}
		System.out.println("Be contiun the dats ");
		S=sc.next();
	  }while(S.equalsIgnoreCase("s"));
	System.out.println("Exist..Day..");
	}

}
