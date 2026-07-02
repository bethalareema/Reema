package myfirstjavaproject;

public class Employee {
	
	//static variable
	static String companyname;
	static String location;
	//instance variable
	int salary;
	String employeename;
	

		static{
		companyname="vcube";
		location="Hyderabad";
		//System.out.println("static block");

	}
		void display(){
			
            System.out.println("employeename:"+employeename );
            System.out.println("salary:"+ salary);

            System.out.println("companyname:"+ companyname);
            System.out.println("location:"+ location);
		}
	
		
	public static void main(String[] args) {
		
		
		Employee e1 =new Employee();
		e1.salary=400000;
		e1.employeename="Reema";
		e1.display();
		Employee e2 =new Employee();
		e2.salary=500000;
		e2.employeename="Mary";
		e2.display();
		
		
	
	



	}

}
