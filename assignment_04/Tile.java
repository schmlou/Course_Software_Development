package assignment_04;

public class Tile {
	
	//check if there is a wall/exit on the tile 
	private boolean isWall;
	private boolean isExit;
	
	//set that tile should be wall
	public void setWall (boolean wall) {
		this.isWall = wall;
	}
	//set that tile should be exit
	public void setExit(boolean exit) {
		this.isExit = exit;
	}
	//check if this tile is a Wall
	public boolean getWall() {
		return this.isWall;
	}
	//check if this tile is the Exit
	public boolean getExit() {
		return this.isExit;
	}
}
