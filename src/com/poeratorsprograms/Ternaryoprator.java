package com.poeratorsprograms;

public class Ternaryoprator {

	public static void main(String[] args) {
		
	    int a=-2;
	    
		String s=(a>0)?"pastive":"negative";
		System.out.println(s);
		System.out.println("............................");
		
	     int marks=90;
		String st=(marks>=90)?"A":(marks>=75)?"B":(marks>=60)?"C":(marks>=40)?"D":"fail";
		System.out.println(st);
		
	}

}
