package construcoter;
import java.util.Scanner;

public class HosptialPatientBill {
	String Patient;
	int age;
	int roomcharegeperdays;
	int numberofdaysadmitted;
	
	HosptialPatientBill (String Patient,int age,int roomcharegeperdays,int  numberofdaysadmitted){
		this.Patient= Patient;
		this.age=age;
		this.roomcharegeperdays=roomcharegeperdays;
		this.numberofdaysadmitted=numberofdaysadmitted;
	}
	void calculate() {
		int totalhospitalbill=roomcharegeperdays*numberofdaysadmitted;
		System.out.println("Enter totalhospitalbill :"+totalhospitalbill);
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Patient Nmae :");
		String Patinet =sc.next();
		
		
		System.out.println("Enter Age :");
		int age=sc.nextInt();
		
		System.out.println("Enter Room charge per days :");
		int roomcharegeperdays=sc.nextInt();
		
		System.out.println("Enter number of days admitted :");
		int numberofdaysadmitted=sc.nextInt();
		
		
		HosptialPatientBill h=new HosptialPatientBill(Patinet,age,roomcharegeperdays,numberofdaysadmitted);
		h.calculate();
		
	}

}
