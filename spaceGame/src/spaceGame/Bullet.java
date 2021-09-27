package spaceGame;

public class Bullet {
	 
	private int  x, y, speed, symbol;
	
	public Bullet(int x, int y, int speed, int symbol) {
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.symbol = symbol;
	}
	
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public int getSpeed() {
		return this.speed;
	}
	
	public void setXY(int newX, int newY) {
		this.x = newX;
		this.y = newY;
	}
}
