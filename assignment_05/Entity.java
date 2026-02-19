package assignment_05;

public abstract class Entity {

	//private attributes to check position
	protected int entityX = 0;
	protected int entityY = 0;
	
	//Constructor for entity
	public Entity (int entityX, int entityY) {
		this.entityX = entityX;
		this.entityY = entityY;
	}
	
	//Getter for X- & Y-Coordinate
	public int getX() {
		return this.entityX;
	}
	public int getY() {
		return this.entityY;
	}
	
	//Move method as abstract so child classes can override
	public abstract boolean move(char direction, Map map);
}
