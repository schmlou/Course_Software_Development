package assignment_05;

//Player extends parent-class Entity
public class Player extends Entity {
	// assign a name to a player
	private int collectedTreasures;

	// Constructor for player at position 0, 0
	public Player() {
		super(0, 0);
		this.collectedTreasures = 0;
	}

	// movement of the player whit keyboard-input
	@Override
	public boolean move(char direction, Map map) {
		direction = Character.toUpperCase(direction);
		// Up
		if (direction == 'W') {
			// check if move up is possible in regards of map size
			if (this.entityY < map.getSize() - 1) {
				// check if next tile is a wall
				Tile nextTile = map.getTile(this.entityX, this.entityY + 1);
				if (nextTile != null && !nextTile.getWall()) {
					this.entityY++;
					return true;
				}
			}
			// if you would hit a wall
			return false;
		}
		// Left
		else if (direction == 'A') {
			// check if move left is possible in regards of map size
			if (this.entityX > 0) {
				// check if next tile is a wall
				Tile nextTile = map.getTile(this.entityX - 1, this.entityY);
				if (nextTile != null && !nextTile.getWall()) {
					this.entityX--;
					return true;
				}
			}
			// if you would hit a wall
			return false;
		}
		// Down
		else if (direction == 'S') {
			// check if move down is possible in regards of map size
			if (this.entityY > 0) {
				// check if next tile is a wall
				Tile nextTile = map.getTile(this.entityX, this.entityY - 1);
				if (nextTile != null && !nextTile.getWall()) {
					this.entityY--;
					return true;
				}
			}
			// if you would hit a wall
			return false;
		}
		// Right
		else if (direction == 'D') {
			// check if move right is possible in regards of map size
			if (this.entityX < map.getSize() - 1) {
				// check if next tile is a wall
				Tile nextTile = map.getTile(this.entityX + 1, this.entityY);
				if (nextTile != null && !nextTile.getWall()) {
					this.entityX++;
					return true;
				}
			}
			// if you would hit a wall
			return false;
		}
		return false;
	}

//Count the found treasures
	public void collectedTreasures() {
		this.collectedTreasures++;
	}

//get the number of found treasures
	public int getCollectedTreasures() {
		return this.collectedTreasures;
	}
}
