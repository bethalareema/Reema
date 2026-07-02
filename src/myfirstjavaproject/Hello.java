package myfirstjavaproject;

public class Hello {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method started !");
		
		//Bootstrap class loader is loading below classes
		Class.forName("java.long.Sysatem");
		Class.forName("java.long.string");
		
		//Application class loader is loading below classes
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("main methode ended !");


		
	}

}
