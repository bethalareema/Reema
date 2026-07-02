package myfirstjavaproject;

public class Frindes {
	
	static {
		System.out.println("static block");
	}
	
	
	public static void main(String[] args) {
		System.out.println("main method loaded");
		
		{
			System.out.println("instance block");
		}
		
		{
			System.out.println("instance block");
		}
		
	}

}
