package assignment_04;

public class Tile {
	
	//check if there is a wall/exit on the tile 
	private boolean isWall;
	private boolean isExit;
	
	//create an empty tile
	public Tile() {
		this.isWall = false;
		this.isExit = false;
	}
	
	//create an tile either wall or exit
		public Tile(boolean isWall, boolean isExit) {
			this.isWall = false;
			this.isExit = false;
		}
	
	//check if this tile is a Wall
	public boolean getWall() {
		return this.isWall;
	}
	//check if this tile is the Exit
	public boolean getExit() {
		return this.isExit;
	}
	
	//set if this tile is a wall, if the tile isWall=True
	public void setWall(boolean isWall) {
		this.isWall = isWall;
	}
	//set if this tile is a exit, if the tile isExit=True
	public void setExit(boolean isExit) {
		this.isExit = isExit;
	}
}
