package spaceGame;

public class Main {
	
	public static void main(String[] args) {
		Player spaceShip = new Player(3, "alive", false, 3);
		Bullet bullet = new Bullet(spaceShip.getPosition(), 5, 1, 1, false);
		Board board = new Board(spaceShip, bullet);
		
		System.out.println("SPACE IN JAVA! - A CLI GAME");
		System.out.println();
		System.out.println("*4 = SpaceShip");
		System.out.println("*3 = Alien");
		System.out.println("*1 = Laser");
		System.out.println();
		System.out.println("DON'T LET THEM GET TO YOU!");
		System.out.println("--------------------------");
		
		do {
			board.printBoard();
		}while(spaceShip.getCondition() == "alive");
		System.out.println("Lives: "+ spaceShip.getLives());
		System.out.println("YOU'RE DEAD");
	}

}
