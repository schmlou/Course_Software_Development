package racing_game;

public abstract class Vehicle {
	private String name;
	private int position = 0;
	
	public Vehicle(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPosition() {
		return this.position;
	}
	
	public void advance(int step) {
		this.position = this.position + step;
	}
	
	public abstract void move();
}
