package racing_game;

import java.util.Random;

public class Motorcycle extends Vehicle {
	private Random rand = new Random();
	
	public Motorcycle(String name) {
		super(name);
	}
	
	public void move() {
		int step;
		if (rand.nextDouble() < 0.2) {
			step = 0;						//motorcycles can slip
		} else {
			step = rand.nextInt(5) + 2;		//[2-6]
		}
		advance(step);
	}
	
}