package myfirstjavaproject;

import java.util.Scanner;

public class SimpleInterst{
	
	double calculateinterst(double principal,double rate,int time) {
	 double interest=(principal*rate*time)/100;
	return interest;
	
	}


	 void main(String[] args) {
		 
		//System.out.println("simple interest"+ return);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principal amount :");
		double principal =sc.nextDouble();
		
		System.out.println("Enter rate of interst :");
		double rate =sc.nextDouble();
		
		System.out.println("Enter time(2 years) :");
		int time =sc.nextInt();
		
		calculateinterst(principal,rate,time);
		
		
	}

}
