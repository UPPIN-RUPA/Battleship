package Battleship;

public class Boards {
	private char[][] boardA = new char[11][11];
	private char[][] boardB = new char[11][11];
	
	private int numCarrierPlay = 0;
	private int numBattleShipPlay = 0;
	private int numSubmarinePlay = 0;
	private int numCruiserPlay = 0;
	private int numDestroyerPlay = 0;
	
	private int numCarrierComp = 0;
	private int numBattleshipComp = 0;
	private int numSubmarineComp = 0;
	private int numCruiserComp = 0;
	private int numDestroyerComp = 0;
	
	public Boards() {
		initBoardA();
		initBoardB();
	}
	
	public void initBoardA() {
		boardA[0][0] = ' ';
		int num = 1;
		for(int i =48;i<=57;i++) {
			boardA[num][0] = (char)i;
			num ++;
		}
		// first row
		num =1;
		for(char i = 48;i<=57;i++) {
			boardA[0][num]=i;
			num++;
		}
		//Rest of the board
		for(int i =1;i<boardA.length;i++) {
			for(int j =1;j<boardA.length;j++) {
				boardA[i][j] = '~';
			}
		}
	}
	public void initBoardB() {
		boardB[0][0] = ' ';
		int num = 1;
		for(int i =48;i<=57;i++) {
			boardB[num][0] = (char)i;
			num ++;
		}
		// first row
		num =1;
		for(char i = 48;i<=57;i++) {
			boardB[0][num]=i;
			num++;
		}
		//Rest of the board
		for(int i =1;i<boardB.length;i++) {
			for(int j =1;j<boardB.length;j++) {
				boardB[i][j] = '~';
			}
		}
	}
	public boolean isValidLocation(Coordinate crd, Ship s) {
		int xCoordinate = crd.getX()+1;
		int yCoordinate =crd.getY()+1;
		
		if(xCoordinate <1 || xCoordinate >= boardA[0].length) {
			return false;
		}
		if(yCoordinate < 1 || yCoordinate >= boardA.length) {
			return false;
		}
		// Checking all cases of all the directions
		if(s.getDirection()=='u') {
			if(yCoordinate - (s.getSize()+1)<1) {
				return false;
			}
			for(int i=yCoordinate;i> yCoordinate - s.getSize();i--) {
				if(boardA[i][xCoordinate] != '~') {
					return false;
				}
			}
		}else if(s.getDirection()=='d') {
			if(yCoordinate + (s.getSize()+1)>= boardA.length) {
				return false;
			}
			for(int i=yCoordinate;i <= yCoordinate +(s.getSize()-1);i++) {
				if(boardA[i][xCoordinate] != '~') {
					return false;
				}
			}
		}else if(s.getDirection()=='r') {
			if(xCoordinate + (s.getSize()-1)>= boardA[0].length) {
				return false;
			}
			for(int i=xCoordinate;i <= xCoordinate +(s.getSize()-1);i++) {
				if(boardA[yCoordinate][i] != '~') {
					return false;
				}
			}
	
		}else if(s.getDirection()=='l') {
			if(xCoordinate - (s.getSize()+1)<1) {
				return false;
			}
			for(int i=xCoordinate;i > xCoordinate -s.getSize();i--) {
				if(boardA[yCoordinate][i] != '~') {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean isValidAttack(Coordinate crd) {
		
		int yCoordinate = crd.getY()+1;
		int xCoordinate = crd.getX()+1;
		if(xCoordinate < 1 || xCoordinate >= boardA[0].length) {
			return false;
		}
		if(yCoordinate < 1 || xCoordinate >= boardA.length) {
			return false;
		}
		return true;
		
	}
	
	public char resultHitMissComp(Coordinate crd , Computer opposition) {
		int yCoordinate = crd.getY()+1;
		int xCoordinate = crd.getX()+1;
		
		if(opposition.getBoardA()[yCoordinate][xCoordinate]=='C') {
			numCarrierComp++;
			if(numCarrierComp == 5) {
				System.out.println("You sunk your opponent's Carrier ship");
			}
		}else if(opposition.getBoardA()[yCoordinate][xCoordinate]== 'B') {
			numBattleshipComp++;
			if(numBattleshipComp == 4) {
				System.out.println("You sunk you opponent's battleship");
			}
		}else if(opposition.getBoardA()[yCoordinate][xCoordinate]=='U') {
			numCruiserComp++;
			if(numCruiserComp == 3) {
				System.out.println("You sunk your opponent's Cruiser ship");
			}
		}else if(opposition.getBoardA()[yCoordinate][xCoordinate] == 'S') {
			numSubmarineComp++;
			if(numSubmarineComp == 3) {
				System.out.println("You sunk your opponent's Submarine");
			}
		}else if(opposition.getBoardA()[yCoordinate][xCoordinate]== 'D') {
			numDestroyerComp++;
			if(numDestroyerComp == '2') {
				System.out.println("You sunk your opponent's Destroyer ship");
			}
			
		}
		if(opposition.getBoardA()[yCoordinate][xCoordinate] != '~') {
			this.getBoardB()[yCoordinate][xCoordinate] = 'H';
			opposition.getBoardA()[yCoordinate][xCoordinate] = 'X';
			return 'H';
			
		}
		this.getBoardB()[yCoordinate][xCoordinate] ='M';
		return 'M';
		
	}
	public char resultHitMissPlayer(Coordinate crd , Player opposition) {
		int yCoordinate = crd.getY()+1;
		int xCoordinate = crd.getX()+1;
		
		if(opposition.getBoardA()[yCoordinate][xCoordinate]=='C') {
			numCarrierPlay++;
			if(numCarrierPlay == 5) {
				System.out.println("Your opponent sunk your Carrier ship");
			}
		}else if(opposition.getBoardA()[yCoordinate][xCoordinate]== 'B') {
			numBattleShipPlay++;
			if(numBattleShipPlay == 4) {
				System.out.println("Your opponent sunk your battleship");
			}
		}else if(opposition.getBoardA()[yCoordinate][xCoordinate]=='U') {
			numCruiserPlay++;
			if(numCruiserPlay == 3) {
				System.out.println("Your opponent sunk your Cruiser ship");
			}
		}else if(opposition.getBoardA()[yCoordinate][xCoordinate] == 'S') {
			numSubmarinePlay++;
			if(numSubmarinePlay == 3) {
				System.out.println("Your opponent sunk your Submarine");
			}
		}else if(opposition.getBoardA()[yCoordinate][xCoordinate]== 'D') {
			numDestroyerPlay++;
			if(numDestroyerPlay == '2') {
				System.out.println("Your opponent sunk your Destroyer ship");
			}
			
		}
		if(opposition.getBoardA()[yCoordinate][xCoordinate] != '~') {
			this.getBoardB()[yCoordinate][xCoordinate] = 'H';
			opposition.getBoardA()[yCoordinate][xCoordinate] = 'X';
			return 'H';
			
		}else {
		this.getBoardB()[yCoordinate][xCoordinate] ='M';
		return 'M';
		}
		
	}
	
	public void printResult(char result) {
		if(result == 'M') {
			System.out.println("You Missed");
		}
		else {
			System.out.println("It's a strike");
		}
	}
	public void placeShips(Coordinate crd , Ship s) {
		int yCoordinate = crd.getY()+1;
		int xCoordinate = crd.getX()+1;
		
		boardA[yCoordinate][xCoordinate] = s.getLetter();
		if(s.getDirection()=='u') {
			for(int i = yCoordinate; i>= yCoordinate - (s.getSize()-1);i--) {
				  boardA[i][xCoordinate]= s.getLetter();
			}
		}else if(s.getDirection()=='d') {
			for(int i = yCoordinate; i <= yCoordinate + (s.getSize()-1);i++) {
				  boardA[i][xCoordinate]= s.getLetter();
			}
		}else if(s.getDirection()=='r') {
			for(int i = xCoordinate; i <= xCoordinate + (s.getSize()-1);i++) {
				  boardA[yCoordinate][i]= s.getLetter();
			}
		}else if(s.getDirection()=='l') {
			for(int i = xCoordinate; i >=  xCoordinate - (s.getSize()-1);i--) {
				  boardA[yCoordinate][i]= s.getLetter();
			}
		}
	}
	
	public char[][] getBoardA(){
		return boardA;
	}
	public char[][] getBoardB(){
		return boardB;
	}
	public void printBoardA() {
		for(int i=0;i<boardA.length;i++) {
			for(int j=0;j<boardA[0].length;j++) {
				System.out.print(boardA[i][j]);
			}
			System.out.println();
		}
	}
	public void printBoardB() {
		for(int i=0;i<boardB.length;i++) {
			for(int j=0;j<boardB[0].length;j++) {
				System.out.print(boardB[i][j]);
			}
			System.out.println();
		}
	}
	}
