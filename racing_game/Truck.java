package racing_game;

import java.util.Random;

public class Truck extends Vehicle {
	private Random rand = new Random();
	
	public Truck(String name) {
		super(name);
	}
	
	public void move() {
		int step = rand.nextInt(3) + 1;		//[1-3]
		advance(step);
	}
	
}