package assignment_05;

public abstract class Entity {

	//private attributes to check position
	protected int x = 0;
	protected int y = 0;
	
	//Constructor for entity
	public Entity (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Getter for X- & Y-Coordinate
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	//Move method as abstract so child classes can override
	public abstract void move(char direction, Map map);
}
