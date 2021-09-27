package spaceGame;
import java.util.Scanner;

public class Player {
	
	private int pos = 0;
	private String condition = "alive";
	
	public Player(int pos, String condition) {
		this.pos = pos;
		this.condition = condition;
	}
	public void position() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Which position do wanna go?(1,2,3,4,5)");
		this.pos = input.nextInt();
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

}
