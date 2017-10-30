package com.example;

public class SimpleCraps implements BettingGame {

	@Override
	public int playGame(int betAmount) {
		
		int rollTotal=0;
		int finalTotal=0;
		int player1Total=0;
		int player1final=0;
		
		while(rollTotal!=7) {
			// TODO Auto-generated method stub
			Die die1=new Die(); 
			Die die2=new Die(); 
			rollTotal=die1.roll()+die2.roll();
			System.out.println("The total is: " + rollTotal);
			finalTotal+=rollTotal;
		}
		
		System.out.println(finalTotal);
		
		while(player1Total!=7) {
			// TODO Auto-generated method stub
			Die die1=new Die(); 
			Die die2=new Die(); 
			player1Total=die1.roll()+die2.roll();
			System.out.println("The total is: " + player1Total);
			player1final+=player1Total;
		}
		
	
	System.out.println(player1final);
	
	
	if (player1final>finalTotal){
		System.out.println("The player wins: "+player1final);
	} else if (player1final<finalTotal) {
		System.out.println("The player loses: -"+player1final);
	} else System.out.println("It's a draw: " + 0);
	}
	
	// TODO Add your code here. Return the amount the user won (or a negative number if they lost!)
		
		//To create a die, use:
		//Die die = new Die();
		
		//To roll the die you created, use:
		//int rollResult = die.roll();
		
		//If the result is a win, return betAmount:
		//return betAmount;
		
		//If the result is a loss, return -betAmount:
		//return -betAmount;
		
		//If the result is a draw, return 0:
		return 0;
	}

	@Override
	public String getGameName() {
		return "SimpleCraps";
	}

}
