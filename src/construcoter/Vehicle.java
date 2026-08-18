package construcoter;

//parent or super or base
public class Vehicle {
	String modal="classic";
	String brand="yamaha";
	double price=2000000;

	public static void main(String[] args) {
		System.out.println("main method strated from vehicle");
	}
	

}
//child or sub derived 
class Bike extends Vehicle{
	String modal="z";
	String brand="reema";
	double price=390000;

	
	public static void main(String[] args) {
		System.out.println("main method strated from bike");
		
		//by using child object reference, 
		//we can access both child & parent class functionalities
		Bike b=new Bike();
		b.vehicleinf1();
		b.vehicleinf2();
		
		
		
	}
	void vehicleinf2() {
		
		 System.out.println("modal of Vehicle :"+this.modal);
		 System.out.println("brand of Vehicle :"+ this.brand);
		 System.out.println("price of Vehicle :"+this.price);
	}
	void vehicleinf1() {
		
		 System.out.println("modal of Vehicle :"+super.modal);
		 System.out.println("brand of Vehicle :"+super.brand);
		 System.out.println("price of Vehicle :"+super.price);
	}
	
	
}
