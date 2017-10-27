import com.example.Die;

public class Die {

	public static {
		
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
	
}
