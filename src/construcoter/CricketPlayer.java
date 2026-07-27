package construcoter;

import java.util.Scanner;

public class CricketPlayer {
	String playerName;
	int Matches;
	int totalRuns;
	
	CricketPlayer(String playerName,int matches,int totalRuns){
		this.playerName=playerName;
		this.Matches=matches;
		this.totalRuns=totalRuns;
		
	}
	void calculate() {
		 int AvregeRuns =totalRuns/Matches;
		System.out.println("Enter Player Name :"+playerName);
		System.out.println("Enter Matches :"+Matches);
		System.out.println("Enter Player Runs :"+totalRuns);
		System.out.println("Average Runs :"+AvregeRuns);
	}
	

	   public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Player Name :");
		String playerName=sc.next();
		
		System.out.println("Enter Matches :");
		int Matches=sc.nextInt();
		
		System.out.println("Enter Player Runs :");
		int totalRuns=sc.nextInt();
		
		CricketPlayer c=new CricketPlayer(playerName,Matches,totalRuns);
		c.calculate();
		
		
   }

}
