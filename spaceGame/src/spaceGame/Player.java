package spaceGame;
import java.util.Scanner;

public class Player {
	
	private int pos = 0, temp, lives;
	private String condition = "alive";
	private boolean shoot;
	
	public Player(int pos, String condition, boolean shoot, int lives) {
		this.pos = pos;
		this.condition = condition;
		this.shoot = shoot;
		this.lives = lives;
	}
	public void position() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Which position do wanna go?(1,2,3,4,5)/Shoot!(0)");
		this.temp = input.nextInt();
		if (this.temp == 0) {
			this.shoot = true;
		}else {
			this.shoot = false;
			if (this.temp > 5) {
				this.pos = 5;
			}else {
			this.pos = this.temp;
			}
		}
	}
	
	public int getPosition() {
		return this.pos;
	}
	
	public String getCondition() {
		return this.condition;
	}
	
	public void setCondition(String newCondition) {
		this.condition = newCondition;
	}
	public boolean getShoot() {
		return this.shoot;
	}
	public void setShoot(boolean newShoot) {
		this.shoot = newShoot;
	}
	public int getLives() {
		return this.lives;
	}
	public void setLives(int newLives) {
		this.lives = newLives;
	}

}
