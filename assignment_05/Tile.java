package assignment_05;
//represents one specific tile of the map
public class Tile {
	private boolean isWall;
	private boolean hasTreasure;
	
	//create empty tile
	public Tile() {
		this.isWall = false;
		this.hasTreasure = false;
	}
	
	//create tile with specific value
	public Tile(boolean isWall, boolean hasTreasure) {
		this.isWall = isWall;
		this.hasTreasure = hasTreasure;
	}
	
	//getter to check if tile has specific "status"
	
	//check if tile is Wall
	public boolean getWall() {
		return this.isWall;
	}
	
	//check if Tile has a Treasure on it
	public boolean getTreasure () {
		return this.hasTreasure;
	}
	
	//setters to set a specific "state" of tile
	
	//set a wall on tile
	public void setWall(boolean isWall) {
		this.isWall = isWall;
	}
	//put a treasure on tile
	public void setTreasure(boolean hasTreasure) {
		this.hasTreasure = hasTreasure;
	}
	
	//if player finds a treasure this treasure needs to be removed from tile
	public void pickUpTreasure () {
		this.hasTreasure = false;
	}
}
