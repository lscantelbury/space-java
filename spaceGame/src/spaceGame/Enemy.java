package spaceGame;

public class Enemy {
	private int x, y, symbol;
	private String direction;
	
	public Enemy(int x, int y, int symbol, String direction) {
		this.x = x;
		this.y = y;
		this.symbol = symbol;
		this.direction = direction;
	}
	
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public int getSymbol() {
		return this.symbol;
	}
	public String getDirection() {
		return this.direction;
	}
	public void setXY(int newX, int newY) {
		this.x = newX;
		this.y = newY;
	}
	public void setSymbol(int newSymbol) {
		this.symbol = newSymbol;
	}
	public void setDirection(String newDirection) {
		this.direction = newDirection;
	}
	
	public void movement(Enemy enemy, int limitLeft, int limitRight, boolean shoot, int bulletX, int bulletY) {
		if (enemy.direction == "right") {
			enemy.setXY(enemy.getX() + 1, enemy.getY());
		}
		if (enemy.x > limitRight){
			enemy.setDirection("left");
			enemy.setXY(enemy.getX(), enemy.getY()+1);
		}
		if (enemy.getDirection() == "left") {
			enemy.setXY(enemy.getX() - 1, enemy.getY());
		}
		if (enemy.x < limitLeft) {
			enemy.setDirection("right");
			enemy.setXY(enemy.getX(), enemy.getY() + 1);
		}
		if(shoot == true && enemy.x - 1== bulletX && enemy.y == bulletY - 1) {
			enemy.symbol = 0;
		}
	}
}
