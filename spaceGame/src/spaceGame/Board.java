package spaceGame;

public class Board{

	private Player player;
	
	static Enemy enemyOne = new Enemy(0,0,1, "right");
	static Enemy enemyTwo = new Enemy(1,0,3, "right");
	static Enemy enemyThree = new Enemy(0,1,3, "right");
	static Enemy enemyFour = new Enemy(1,1,3, "right");
	
	public Board(Player spaceShip) {
		this.player = spaceShip;
	}
	
	public Player getPlayer() {
		return this.player;
	}
	
//	detecting collisions
	public void collision() {
		if (enemyOne.getX() == player.getPosition() && enemyOne.getY() == 6){
			player.setCondition("dead");
		}
		if (enemyTwo.getX() == player.getPosition() && enemyTwo.getY() == 6) {
			player.setCondition("dead");
		}
		if (enemyThree.getX() == player.getPosition() && enemyThree.getY() == 6) {
			player.setCondition("dead");
		}
		if (enemyFour.getX() == player.getPosition() && enemyFour.getY() == 6) {
			player.setCondition("dead");
		}
	}	
	
	
	public void printBoard() {
		
		int[][] board = new int[7][5];
		for (int i = 0; i < 7; i++){
			for (int j = 0; j < 4; j++) {
				board[i][j] = 0;
		}
	}
		
		player.position();
		
		board[6][player.getPosition() - 1] = 4;
		
		board[enemyOne.getY()][enemyOne.getX()] = enemyOne.getSymbol();
		board[enemyTwo.getY()][enemyTwo.getX()] = enemyTwo.getSymbol();
		board[enemyThree.getY()][enemyThree.getX()] = enemyThree.getSymbol();
		board[enemyFour.getY()][enemyFour.getX()] = enemyFour.getSymbol();
		
		for(int[] row : board) {
			for(int	 column : row) {
				System.out.print(column);
			}
			System.out.println();
		}
		System.out.println("-----");
		
//		moving enemyOne
		enemyOne.movement(enemyOne, 1, 3);

//		moving enemyTwo
		enemyTwo.movement(enemyTwo, 2, 4);

//		moving enemyThree
		enemyThree.movement(enemyThree, 1, 3);
		
//		moving enemyFour
		enemyFour.movement(enemyFour, 2, 4);
		
		collision();
	}
}
