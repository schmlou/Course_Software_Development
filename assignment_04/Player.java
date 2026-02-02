package assignment_04;

public class Player {

	//The needed information of the player in this maze game
	private int x;	//the location of the player on x axes (left & right)
	private int y;	//the location of the player on y axes (up & down)
	private int energy;		//the energy-level = the amount of moves of the player
	
	//The constructor of the player with position always 0|0; the energy is set when initiating
	public Player (int energy) {
		this.x = 0;
		this.y = 0;
		this.energy = energy;
	}
	//grid with 0|0 in bottom left corner
	//move right increases x
	//move up increases y
	//other way round for left and down
	
	
	//get information about the x-position
	public int getX() {
		return this.x;
	}
	//set new x-position
	public void setX(int x) {
		this.x = x;
	}
	//get information about the y-position
	public int getY() {
		return this.y;
	}
	//set new y-position
	public void setY(int y) {
		this.y = y;
	}
	//player moves right
	public void moveRight() {
		this.x += 1;
	}
	//player moves left
	public void moveLeft() {
		this.x -= 1;
	}
	//player moves up
	public void moveUp() {
		this.y += 1;
	}
	//player moves down
	public void moveDown() {
		this.y -= 1;
	}
	//player loses energy for every move
	//therefore we need to know how much energy is available
	
	//get information of available energy
	public int getEnergy() {
		return this.energy;
	}
	//lose 1 energy for each move
	public void loseEnergy() {
		this.energy -= 1;
	}
}
