package myfirstjavaproject;

public class CricketPlayer {
	
	    //static variable
		static String teamname;
		
		//instance variable
		int runs;
		String playerName;
		
		public static void main(String[] args) {	
		//object creation
		CricketPlayer player1=new CricketPlayer();
		CricketPlayer player2=new CricketPlayer();
		
		//initialization
		player1.playerName= "virat";
		player1.runs= 120;
		player2.playerName= "Dhoni";
		player2.runs= 85;
		teamname="India";
		
		System.out.println("teamname:"+teamname);  
	    System.out.println("playerName:"+ player1.playerName);
		System.out.println("runs:"+player1.runs);
		
		System.out.println("teamname:"+teamname);   
		System.out.println("playerName:"+ player2.playerName);
		System.out.println("runs:"+player2.runs);
	  
	

        
    }
		
}
