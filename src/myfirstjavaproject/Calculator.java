package myfirstjavaproject;
import java.util.Scanner;

public class Calculator {
	
	void add(int a,int b){
		System.out.println("addition ="+(a+b));
		
	}
	void subtract(int a,int b){
		System.out.println("subtraction ="+(a-b));
		
	}
	void multiply(int a,int b) {
		System.out.println("multiplacation ="+(a*b));
		
	}
	void divide(int a,int b) {
		System.out.println("division ="+(a/b));
		
	}

	 void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number :");
		int a=sc.nextInt();
		
		System.out.println("Enter second number :");
		int b=sc.nextInt();
		
		add(a,b);
		subtract(a,b);
		multiply(a,b);
		divide(a,b);


	}

}
