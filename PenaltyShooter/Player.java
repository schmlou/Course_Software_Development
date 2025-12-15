package PenaltyShooter;

import java.util.Scanner;

public abstract class Player {
	private String name;
	private int score = 0;
	Scanner scanner = new Scanner(System.in);
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void addScore() {
		this.score = this.score + 1; 
	}
	public int chooseDirection() {
		System.out.println(this.getName() + "! It's your turn! 1,2 or 3?");
		int direction = scanner.nextInt();
		return direction;
	}
}
