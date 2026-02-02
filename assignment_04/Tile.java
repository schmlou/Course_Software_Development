package assignment_04;

public class Tile {
	
	//check if there is a wall/exit on the tile 
	private boolean isWall;
	private boolean isExit;
	
	//check if this tile is a Wall
	public boolean getWall() {
		return this.isWall;
	}
	//check if this tile is the Exit
	public boolean getExit() {
		return this.isExit;
	}
}
