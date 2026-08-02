package myfirstjavaproject;

import java.util.Scanner;

public class StudentResult {

	void displayNmae(String name) {
		System.out.println("my name is : " + name);

	}

	void calculateTotal(int m1, int m2, int m3) {
		int total=m1+m2+m3;
		System.out.println("Total markes :" + total);
	}

	void calculateAverage(int m1, int m2, int m3) {
		System.out.println("Average Marks :" +( m1+m2+m3)/2);
	}


	void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("My Name is:");

		String name = sc.next();
		System.out.println("Total marks1:");
		int m1=sc.nextInt(); 
		System.out.println("Total marks2:");
		int m2=sc.nextInt();
		System.out.println("Total marks3:");
        int m3=sc.nextInt();
	
		
		//All methods call
		displayNmae(name);
		calculateTotal(m1,m2,m3);
		calculateAverage(m1,m2,m3);
	}

}
