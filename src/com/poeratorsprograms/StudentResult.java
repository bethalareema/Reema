package com.poeratorsprograms;
import java.util.Scanner;
public class StudentResult {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Attendance :");
		int Attendance =sc.nextInt();
		
		if(Attendance>=75) {
			System.out.println("Attendance is Sufficient!");
			System.out.println("Enter Your markes :");
			int markes=sc.nextInt();
			
			
			if(markes>=35) {
				System.out.println("Border pass in exam");
				System.out.println("Grade :E");
				
				if(markes>=50) {
					System.out.println("pass in exam");
					System.out.println("Grade :D");
					
					if(markes>=65) {
						System.out.println("Good");
						System.out.println("Grade :C");
						
						if(markes>=75) {
							System.out.println("Very Good");
							System.out.println("Grade :B");
							
							if(markes>=90) {
								System.out.println("Exellent");
								System.out.println("Grade :A+");
								
							}else {
								System.out.println("Need to improvement");
							}
						}else {
							System.out.println("need to improvement");
						}
					}else {
						System.out.println("need to improvement");
					}
				}else {
					System.out.println("Need more perparation");
				}
			
			}else {
				System.out.println("Failed in exam..");
			}
		}else {
			System.out.println("Attendance is below 75 :");
		}
	}

}
