package myfirstjavaproject;

public class Student {
	
	int studentId;
	String studentName;
	
	public static void main(String[] args) {
		
		
	    Student s=new Student();
	    s.studentId=513;
		s.studentName="Reema";
		System.out.println(s.studentId);
		System.out.println(s.studentName);
		

		Student r=new Student();
	    r.studentId=525;
		r.studentName="anu";
		System.out.println(r.studentId);
		System.out.println(r.studentName);
		
		
	}

}
