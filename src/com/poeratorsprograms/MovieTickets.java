package com.poeratorsprograms;

import java.util.Scanner;

public class MovieTickets {
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number:");
		 int a1=sc.nextInt();
		
		System.out.println("Enter age :");
		int age=sc.nextInt();
		
//		int a=200;
//		int b=300;
//		int c=500;
//		int	price=(a*10/100);
		
		
		switch(a1) {
		
		
		case 1:
			if(age>=60){
			int a=200;
            	int	price=(a*10/100);
				System.out.println("Silver:"+price);
				
			}
			
			break;
		
				case 2:
					if(age>=60) {
						int b=300;
						
						System.out.println("Gold:"+b);

			}
					break;
				case 3:
					if(age>=60){
						int c=500;
						
						System.out.println("Platinum :"+c);
					}
			break;
		}
		
		
		
	}

}
