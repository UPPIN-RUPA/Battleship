package Battleship;

import java.util.Scanner;

public class Player {
	
	Boards bds = new Boards();
	Scanner sc = new Scanner(System.in);
	
	public Player() {
		bds.initBoardA();
		bds.initBoardB();
	}
	
	public void PlayerSetUp() {
		System.out.println("Now its time to set your ships!");
		bds.printBoardA();
		
		//placing Carrier 
		
		System.out.println("The first ship is carrier of size 5");
		System.out.println("What direction would you like to place the ship? Enter 'u' for up ,'d' for down , 'r' for right , 'l' for left");
		char dir = sc.next().charAt(0);
		
		System.out.println("Now enter the X-Coordinate of where the location is : ");
		int xCord = sc.nextInt();
		
		System.out.println("Now enter the Y-Coordinate of where the location is : ");
		int yCord = sc.nextInt();
		
		Coordinate crd = new Coordinate(xCord, yCord);
		Ship Carrier = new Ship('C',dir,crd);
		while(bds.isValidLocation(crd, Carrier)== false) {
			System.out.println("That is an invalid location , please enter again");
			System.out.println("Enter the X-Coordinate of where the location is : ");
			int newX = sc.nextInt();
			
			System.out.println("Enter the Y-Coordinate of where the location is : ");
			int newY = sc.nextInt();
			
			crd = new Coordinate(newX, newY);
		}
		bds.placeShips(crd, Carrier);
		bds.printBoardA();
		
		//Place the battleship
		System.out.println("The second ship is battleship of size 4");
		System.out.println("What direction would you like to place the ship? Enter 'u' for up ,'d' for down , 'r' for right , 'l' for left");
		dir = sc.next().charAt(0);
		
		System.out.println("Now enter the X-Coordinate of where the location is : ");
		xCord = sc.nextInt();
		
		System.out.println("Now enter the Y-Coordinate of where the location is : ");
		yCord = sc.nextInt();
		
		crd = new Coordinate(xCord, yCord);
		Ship battleship = new Ship('B',dir,crd);
		while(bds.isValidLocation(crd, battleship)== false) {
			System.out.println("That is an invalid location , please enter again");
			System.out.println("Enter the X-Coordinate of where the location is : ");
			int newX = sc.nextInt();
			
			System.out.println("Enter the Y-Coordinate of where the location is : ");
			int newY = sc.nextInt();
			
			crd = new Coordinate(newX, newY);
		}
		bds.placeShips(crd, battleship);
		bds.printBoardA();
		
		//Place the Submarine
		System.out.println("The third ship is submarine of size 3");
		System.out.println("What direction would you like to place the ship? Enter 'u' for up ,'d' for down , 'r' for right , 'l' for left");
		dir = sc.next().charAt(0);
		
		System.out.println("Now enter the X-Coordinate of where the location is : ");
		xCord = sc.nextInt();
		
		System.out.println("Now enter the Y-Coordinate of where the location is : ");
		yCord = sc.nextInt();
		
		crd = new Coordinate(xCord, yCord);
		Ship submarine = new Ship('S',dir,crd);
		while(bds.isValidLocation(crd, submarine)== false) {
			System.out.println("That is an invalid location , please enter again");
			System.out.println("Enter the X-Coordinate of where the location is : ");
			int newX = sc.nextInt();
			
			System.out.println("Enter the Y-Coordinate of where the location is : ");
			int newY = sc.nextInt();
			
			crd = new Coordinate(newX, newY);
		}
		bds.placeShips(crd, submarine );
		bds.printBoardA();
		
		//Place the Crusive 
		
		System.out.println("The fourth ship is cruiser of size 3");
		System.out.println("What direction would you like to place the ship? Enter 'u' for up ,'d' for down , 'r' for right , 'l' for left");
		dir = sc.next().charAt(0);
		
		System.out.println("Now enter the X-Coordinate of where the location is : ");
		xCord = sc.nextInt();
		
		System.out.println("Now enter the Y-Coordinate of where the location is : ");
		yCord = sc.nextInt();
		
		crd = new Coordinate(xCord, yCord);
		Ship Cruiser = new Ship('U',dir,crd);
		while(bds.isValidLocation(crd, Cruiser)== false) {
			System.out.println("That is an invalid location , please enter again");
			System.out.println("Enter the X-Coordinate of where the location is : ");
			int newX = sc.nextInt();
			
			System.out.println("Enter the Y-Coordinate of where the location is : ");
			int newY = sc.nextInt();
			
			crd = new Coordinate(newX, newY);
		}
		bds.placeShips(crd, Cruiser);
		bds.printBoardA();
		
		//place Destroyer
		
		System.out.println("The fifth ship is destroyer  of size 2");
		System.out.println("What direction would you like to place the ship? Enter 'u' for up ,'d' for down , 'r' for right , 'l' for left");
		dir = sc.next().charAt(0);
		
		System.out.println("Now enter the X-Coordinate of where the location is : ");
		xCord = sc.nextInt();
		
		System.out.println("Now enter the Y-Coordinate of where the location is : ");
		yCord = sc.nextInt();
		
		crd = new Coordinate(xCord, yCord);
		Ship Destroyer = new Ship('D',dir,crd);
		while(bds.isValidLocation(crd, Destroyer)== false) {
			System.out.println("That is an invalid location , please enter again");
			System.out.println("Enter the X-Coordinate of where the location is : ");
			int newX = sc.nextInt();
			
			System.out.println("Enter the Y-Coordinate of where the location is : ");
			int newY = sc.nextInt();
			
			crd = new Coordinate(newX, newY);
		}
		bds.placeShips(crd, Destroyer);
		bds.printBoardA();
		
		System.out.println("You are finished setting up your board");
		
	}
	
	public Coordinate playerGuessAttack() {
		System.out.println("Now enter the X-Coordinate of where you want to attack the computer board : ");
		int attackX = sc.nextInt();
		
		System.out.println("Now enter the Y-Coordinate of where you want to attack the computer board  : ");
		int attackY = sc.nextInt();
		
		Coordinate attack = new Coordinate(attackX, attackY);
		
		while(bds.isValidAttack(attack)== false) {
			System.out.println("That is an invalid attack location , please enter again");
			System.out.println("Enter the X-Coordinate of where you want to attack the computer board  : ");
			int newXAttack = sc.nextInt();
			
			System.out.println("Enter the Y-Coordinate of where you want to attack the computer board  : ");
			int newYAttack = sc.nextInt();
			
			attack = new Coordinate(newXAttack, newYAttack);
		}
		return attack;
	}
	
	public void fireAttackComp(Computer comp,Coordinate attack) {
		bds.printResult(bds.resultHitMissComp(attack, comp));
	}
	
	public void printBoard(char[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	public boolean verifyPlayerWin(Computer c) {
		for(int i=1;i<c.getBoardA().length;i++) {
			for(int j=1;j<c.getBoardA()[0].length;j++) {
				if(c.getBoardA()[i][j] != '~' && bds.getBoardB()[i][j] != 'H') {
					return false;
				}
			}
		}
		return true;
	}
	public char[][] getBoardA(){
		return bds.getBoardA();
	}
	public char[][] getBoardB(){
		return bds.getBoardB();
	}
}
