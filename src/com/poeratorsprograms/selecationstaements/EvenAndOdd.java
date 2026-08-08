package com.poeratorsprograms.selecationstaements;
import java.util.Scanner;

public class EvenAndOdd {
	
	 static void evenodd(int n) {
		for(int i=0;i<=n;i++) {
	      if(i!=0&&i%2==0) {
	    	  System.out.println(i);
	    	  
	      }
	      System.out.println("................");
			
		}
		for(int i=0;i<=n;i++) {
		      if(i!=0&&i%2==1) {
		    	  System.out.println(i);
		      }
				
			}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int even=sc.nextInt();
		
		evenodd(even);
		

	}

}
