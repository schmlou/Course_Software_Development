package racing_game;

import java.util.Random;

public class Car extends Vehicle {
	private Random rand = new Random();
	
	public Car(String name) {
		super(name);
	}
	
	
	public void move() {
		int step = rand.nextInt(4) + 2;		//[2-5]
		advance(step);
	}
	
}