package spaceGame;

public class Board{

	private Player player;
	private Bullet bullet;
	
	static Enemy enemyOne = new Enemy(0,0,3, "right");
	static Enemy enemyTwo = new Enemy(1,0,3, "right");
	static Enemy enemyThree = new Enemy(0,1,3, "right");
	static Enemy enemyFour = new Enemy(1,1,3, "right");
	
	public Board(Player spaceShip, Bullet bullet) {
		this.player = spaceShip;
		this.bullet = bullet;
	}
	
	public Player getPlayer() {
		return this.player;
	}
	
//	detecting collisions
	public void collision() {
		if (enemyOne.getY() == 5){
			player.setLives(player.getLives() - 1);
			enemyOne.setXY(0, 0);
			enemyTwo.setXY(1, 0);
			enemyThree.setXY(0, 1);
			enemyFour.setXY(1, 1);
		}
		if (enemyTwo.getY() == 5) {
			player.setLives(player.getLives() - 1);
			enemyOne.setXY(0, 0);
			enemyTwo.setXY(1, 0);
			enemyThree.setXY(0, 1);
			enemyFour.setXY(1, 1);
		}
		if (enemyThree.getY() == 5) {
			player.setLives(player.getLives() - 1);
			enemyOne.setXY(0, 0);
			enemyTwo.setXY(1, 0);
			enemyThree.setXY(0, 1);
			enemyFour.setXY(1, 1);
		}
		if ( enemyFour.getY() == 5) {
			player.setLives(player.getLives() - 1);
			enemyOne.setXY(0, 0);
			enemyTwo.setXY(1, 0);
			enemyThree.setXY(0, 1);
			enemyFour.setXY(1, 1);
		}
		if (player.getLives() == 0) {
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
		
		if (player.getShoot() == true) {
			bullet.setShooted(true);
			bullet.setXY(player.getPosition(), bullet.getY());
		}
		if (bullet.getShooted() == true) {
			bullet.setXY(bullet.getX(), bullet.getY());
			board[bullet.getY()][bullet.getX() - 1] = bullet.getSymbol();
		}
		
		board[6][player.getPosition() - 1] = 4;
		
		board[enemyOne.getY()][enemyOne.getX()] = enemyOne.getSymbol();
		board[enemyTwo.getY()][enemyTwo.getX()] = enemyTwo.getSymbol();
		board[enemyThree.getY()][enemyThree.getX()] = enemyThree.getSymbol();
		board[enemyFour.getY()][enemyFour.getX()] = enemyFour.getSymbol();
		
		System.out.println("Lives: " + player.getLives());
		System.out.println("-----");
		
		for(int[] row : board) {
			for(int	 column : row) {
				System.out.print(column);
			}
			System.out.println();
		}
		System.out.println("-----");
		
		collision();
		
//		moving enemyOne
		enemyOne.movement(enemyOne, 1, 3, bullet.getShooted(), bullet.getX(), bullet.getY());

//		moving enemyTwo
		enemyTwo.movement(enemyTwo, 2, 4, bullet.getShooted(), bullet.getX(), bullet.getY());

//		moving enemyThree
		enemyThree.movement(enemyThree, 1, 3, bullet.getShooted(), bullet.getX(), bullet.getY());
		
//		moving enemyFour
		enemyFour.movement(enemyFour, 2, 4, bullet.getShooted(), bullet.getX(), bullet.getY());
		

		
		if (bullet.getY() == 0) {
			bullet.setShooted(false);
			bullet.setXY(bullet.getX(), 5);
		}
		if(bullet.getShooted() == true) {
			bullet.setXY(bullet.getX(), bullet.getY()-1);
		}
	}
}
