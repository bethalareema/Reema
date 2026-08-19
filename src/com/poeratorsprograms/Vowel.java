package com.poeratorsprograms;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Simple intpu 1:");
		int b=sc.nextInt();
		
		System.out.println("Enter character :");
		char s = sc.next().charAt(0);
		
		System.out.println("Simple output 1:");
		int a=sc.nextInt();
		
		String result =(s =='a')&(s=='b')?"vowel":"consonant";
		System.out.println(result);
		
		
		

	}

}
