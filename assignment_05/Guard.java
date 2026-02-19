package assignment_05;

import java.util.Random;

//guard extends parent-class entity
public class Guard extends Entity {
	// random needed for random movement of guard
	// numbers as direction
	private Random random;

	public Guard(int X, int Y) {
		super(X, Y);
		this.random = new Random();
	}

	// Override the move method from Entity
	@Override
	public boolean move(char direction, Map map) {
		// Guard ignores "direction" and moves randomly
		// keeps trying till he can move -> no walls in his way
		int randomMove = random.nextInt(4);
		boolean moveMade = false;

		// try move up -> random number = 0
		if (randomMove == 0) {
			if (this.entityY < map.getSize() - 1) {
				Tile nextTile = map.getTile(this.entityX, this.entityY + 1);
				if (nextTile != null && !nextTile.getWall()) {
					this.entityY++;
					moveMade = true;
				}
			}
		}
		// try move left -> random number = 1
		if (randomMove == 1) {
			if (this.entityX > 0) {
				Tile nextTile = map.getTile(this.entityX - 1, this.entityY);
				if (nextTile != null && !nextTile.getWall()) {
					this.entityX--;
					moveMade = true;
				}
			}
		}
		// try move down -> random number = 2
		if (randomMove == 2) {
			if (this.entityY > 0) {
				Tile nextTile = map.getTile(this.entityX, this.entityY - 1);
				if (nextTile != null && !nextTile.getWall()) {
					this.entityY--;
					moveMade = true;
				}
			}
		}
		// try move left -> random number = 3
		if (randomMove == 3) {
			if (this.entityX < map.getSize() - 1) {
				Tile nextTile = map.getTile(this.entityX + 1, this.entityY);
				if (nextTile != null && !nextTile.getWall()) {
					this.entityX++;
					moveMade = true;
				}
			}
		}
		return moveMade;
	}

	// check if guard can capture the player
	public boolean capturePlayer(Player player) {
		// if guard is on tile of player
		if (this.entityX == player.getX() && this.entityY == player.getY()) {
			// if on same tile then capture
			return true;
		}
		// if not on same tile then player is safe
		return false;
	}
}
