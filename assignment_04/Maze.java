package assignment_04;

import java.util.Random;

public class Maze {

	// Attributes from Assignment
	private Tile[][] grid;
	private int size;
	private Random random;

	public Maze(int size) {
		this.size = size;
		// create grid with new tiles, without walls/exit
		this.grid = new Tile[size][size];
		// generate a grid with empty tiles
		generateGrid();
		// place walls and exits
		createWalls();
		placeExit();
	}

	// this is to generate a grid with a given size without any walls or exits
	private void generateGrid() {
		for (int x = 0; x < size; x++) {
			for (int y = 0; y < size; y++) {
				grid[x][y] = new Tile(false, false);
			}
		}
	}

	
	// place exit anywhere but 0|0
	private void placeExit() {

		int ranX;
		int ranY;

		// generate random numbers inside the range of size
		// should loop till the random numbers aren't 0|0
		while (true) {
			ranX = random.nextInt(size);
			ranY = random.nextInt(size);
			// if its not 0|0 = valid then the given random integers should be used
			if (ranX != 0 || ranY != 0) {
				break;
			}
		}
		// safe the position & place exit on grid
		grid[ranX][ranY] = new Tile(false, true);
	}

	
	// create walls
	private void createWalls() {
		// make a maximum amount of cells (25%) to be walls
		int allCells = size * size;
		// make it an int so full cells get used as wall and not e.g. half
		int maxWalls = (int) (allCells * 0.25);
		// keep track of how many walls are already placed
		int walls = 0;

		for (int x = 0; x < size && walls < maxWalls; x++) {
			for (int y = 0; y < size && walls < maxWalls; y++) {
				//checks if placed at 0|0, is the exit and in the random
				//if one i true, then no wall is placed
				if (!(x == 0 && y == 0) && !grid[x][y].getExit() && random.nextDouble() < 0.25) {
					grid[x][y].setWall(true);
					//+1 count of walls
					walls++;
				}
			}
		}
	}

	
	public Tile getTile(int x, int y) {
		// Check if coordinates of a tile are within grid boundaries
		if (x >= 0 && x < size && y >= 0 && y < size) {
			return grid[x][y];
		} else {
			return null;
		}
	}

	
	// get the size of the grid
	public int getSize() {
		return this.size;
	}
}