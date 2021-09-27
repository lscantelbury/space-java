package spaceGame;

public class Bullet {
	 
	private int  x, y, speed, symbol;
	private boolean shooted;
	
	public Bullet(int x, int y, int speed, int symbol, boolean shooted) {
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.symbol = symbol;
		this.shooted = shooted;
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
	public int getSymbol() {
		return this.symbol;
	}
	public boolean getShooted() {
		return this.shooted;
	}
	
	public void setXY(int newX, int newY) {
		this.x = newX;
		this.y = newY;
	}
	public void setShooted(boolean newShooted) {
		this.shooted = newShooted;
	}
}
