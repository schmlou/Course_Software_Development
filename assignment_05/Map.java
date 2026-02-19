package assignment_05;

import java.util.Random;

public class Map {
	private Tile[][] grid;
	private int size;
	private int treasureCount;
	private Random random;

	// construct map with given size
	public Map(int size) {
		this.size = size;
		this.random = new Random();
		this.grid = new Tile[size][size];
		this.treasureCount = 0;
		// methods needed to generate the map
		generateGrid();
		placeWalls();
		placeTreasure();
	}

	// get size of map
	public int getSize() {
		return this.size;
	}

	// generate map with only empty tiles
	private void generateGrid() {
		for (int x = 0; x < size; x++) {
			for (int y = 0; y < size; y++) {
				grid[x][y] = new Tile(false, false);
			}
		}
	}

	// place wall randomly on map with probability of 21% per tile
	private void placeWalls() {
		int amountCells = size * size;
		int maxWalls = (int) (amountCells * 0.21);
		int walls = 0;

		for (int x = 0; x < size && walls < maxWalls; x++) {
			for (int y = 0; y < size && walls < maxWalls; y++) {
				// no walls on 0,0 -> player start & not on tile with treasure
				if (!(x == 0 && y == 0) && !grid[x][y].getTreasure() && random.nextDouble() < 0.21) {
					grid[x][y].setWall(true);
					walls++;
				}
			}
		}
	}

	// place treasures in map with chance of 7%
	private void placeTreasure() {
		int amountCells = size * size;
		int maxTreasures = (int) (amountCells * 0.07);
		int treasures = 0;

		while (treasures < maxTreasures) {
			int randomX = random.nextInt(size);
			int randomY = random.nextInt(size);

			// place if not on 0,0 and not a wall and not already with treasure
			if (!(randomX == 0 && randomY == 0) && !grid[randomX][randomY].getWall()
					&& !grid[randomX][randomY].getTreasure()) {
				grid[randomX][randomY].setTreasure(true);
				treasures++;
				treasureCount++;

			}
		}
	}

	// get status of tile
	public Tile getTile(int x, int y) {
		if (x >= 0 && x < size && y >= 0 && y < size) {
			return grid[x][y];
		}
		return null;
	}

	// check if treasure is on tile
	public boolean hasTreasure(int x, int y) {
		Tile tile = getTile(x, y);
		if (tile != null && tile.getTreasure()) {
			return true;
		}
		return false;
	}

	// remove treasure from specific tile --> needed after player picks up treasure
	public void pickUpTreasure(int x, int y) {
		Tile tile = getTile(x, y);
		if (tile != null && tile.getTreasure()) {
			tile.pickUpTreasure();
			treasureCount--;
		}
	}

	// check if all treasures are collected
	public boolean allTreasuresFound() {
		return treasureCount == 0;
	}

	// get number of treasures remaining on map
	public int getTreasuresCount() {
		return this.treasureCount;
	}
}
