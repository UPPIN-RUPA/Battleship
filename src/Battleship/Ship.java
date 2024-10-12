package Battleship;

public class Ship {
	
	/*
	 * Carrier of size 5 represented by 'C'
	 * Battleship of size 2 represented by 'B'
	 * Cruiser Of size 3 represented by 'U'
	 * Submarine of size 3 represented by 'S'
	 * Destroyer of size 2 represented by 'D'
	 */
	private int size;
	private char letter;
	private char direction;
	private Coordinate coord;
	public Ship(char let, char dir , Coordinate coord) {
		if(let == 'C') {
			size = 5;
		}else if(let == 'B') {
			size = 4;
		}else if(let == 'U') {
			size = 3;
		}else if(let == 'S') {
			size = 3;
		}else if(let == 'D') {
			size = 2;
		}
		
	}
	public int getSize() {
		return size;
	}
	public char getLetter() {
		return letter;
	}
	public char getDirection() {
		return direction;
	}
	public Coordinate getCoord() {
		return coord;
	}

}
