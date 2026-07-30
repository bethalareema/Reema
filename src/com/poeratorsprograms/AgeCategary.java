package com.poeratorsprograms;

import java.util.Scanner;

public class AgeCategary {
	
//	0–5 → Baby
//	6–12 → Child
//	13–19 → Teenager
//	20–35 → Young Adult
//	36–59 → Adult
//	60 and above → Old Person / Senior Citizen
//	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age :");
		int age=sc.nextInt();
		
		if(age>=0&&age>=100) {
			System.out.println("Baby");
		}else if(age>=6&&age<=12) {
			System.out.println("Child");
		}else if(age>=13&&age<=19) {
			System.out.println("Teenager");
		}else if(age>=20&&age<=35) {
			System.out.println("young");
		}else if(age>=36&&age<=59) {
			System.out.println("Adult");
		}else if(age>=60&&age<=70) {
			System.out.println("old person");
		}
		else {
			System.out.println("invalide age");
		}
	}

}
