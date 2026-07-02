package myfirstjavaproject;

public class Reema {
	//instance variable
	int sid;
	String sname;
	
	//static variable
	static int collegeid;
	static String collegename;

	public static void main(String[] args) {
		
		collegeid=1233;
		collegename="vcube";
		
		
		Reema r=new Reema();
		r.sid=13;
		r.sname="vcube";
		System.out.println(r.sid);
		System.out.println(r.sname);
		System.out.println("college id :"+ collegeid);
		System.out.println("college name :"+collegename);
		
		System.out.println(collegeid);
		System.out.println(collegename);
	}

}
