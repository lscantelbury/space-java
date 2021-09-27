package spaceGame;

public class Main {
	
	public static void main(String[] args) {
		Player spaceShip = new Player(3, "alive");
		Board board = new Board(spaceShip);
		
		do {
			board.printBoard();
		}while(spaceShip.getCondition() == "alive");
	}

}
