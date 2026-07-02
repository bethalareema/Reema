package myfirstjavaproject;

public class Employee1 {
	
	protected void finalize() {
		System.out.println("object removed");
	}
	

	public static void main(String[] args) {
		
		Employee1 e1=new Employee1();
		System.out.println(e1);
		
		Employee1 e2=new Employee1();
		System.out.println(e2);
		
		Employee1 e3=new Employee1();
		System.out.println(e3);
		
		Employee1 e4=new Employee1();
		System.out.println(e4);
		
		Employee1 e5=new Employee1();
		System.out.println(e5);
		
		e1=null;
		e2=null;
		e5=null;
		System.gc();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e5);
		
	}	


}
