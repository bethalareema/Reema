package com.poeratorsprograms.selecationstaements;
import java.util.Scanner;

public class EvenAndOdd {
	
	 static void even(int n) {
		for(int i=0;i<=n;i=i+2) {
	      if(i!=0&&i%2==0) {
	    	  System.out.print(i+" ");
	    	  
	      }
	      
		}
		System.out.println();
	 System.out.println("....................");

	for(int i=0;i<=n;i++) {
		      if(i!=0&&i%2==1) {
		    	  System.out.print(i+" ");
		      }
				
			}
	 }

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		
		even(n);
		
		

	}

}
