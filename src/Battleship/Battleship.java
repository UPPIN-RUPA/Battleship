package Battleship;

public class Battleship {
	
	public static void main(String args[]) {
		Player p = new Player();
		Computer c = new Computer();
		
		System.out.println("Welcome to the Battleship Game! You will be playing against the computer.");
		p.PlayerSetUp();
		c.compSetUp();
		

		    // Print the computer's boards
		    System.out.println("Computer's Board A:");
		    c.printBoardA();
		    
		    System.out.println("Computer's Board B:");
		    c.printBoardB();
		while(!p.verifyPlayerWin(c) && !c.verifyCompW(p)) {
			//Player attacking the computer
			
			Coordinate attackOnComputer = p.playerGuessAttack();
			p.fireAttackComp(c, attackOnComputer);
			
			//Computer attacking the player
			
			Coordinate attackPlayer = c.getPredictedCoord(p);
			c.fireAndAttackPlayer(p, attackPlayer);
			
			//Print out Player Boards
			
			System.out.println("Your Board A :");
			p.printBoard(p.getBoardA());
			
			System.out.println("Your Board B : ");
			p.printBoard(p.getBoardB());
		}
		
		if(p.verifyPlayerWin(c)) {
			System.out.println("GAME OVER ! YOU WON");
		}else if(c.verifyCompW(p)) {
			System.out.println("GAME OVER! YOU LOST");
		}
	}
	
	

}
