package spaceGame;

public class Main {
	
	public static void main(String[] args) {
		Player spaceShip = new Player(3, "alive", false);
		Bullet bullet = new Bullet(spaceShip.getPosition(), 5, 1, 1, false);
		Board board = new Board(spaceShip, bullet);
		
		do {
			board.printBoard();
		}while(spaceShip.getCondition() == "alive");
		System.out.println();
		System.out.println("YOU'RE DEAD");
	}

}
