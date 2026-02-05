package assignment_04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// need a scanner to check the user input
		Scanner scanner = new Scanner(System.in);
		// need to generate grid to play
		Maze maze = new Maze(5);
		// need a player
		Player player = new Player(15);

		// set the starting boolean conditions of the game state
		boolean gameRunning = true;
		boolean exitFound = false;

		System.out.println("Make a move with W (Up), A (Left), S (Down), D (Right)");

		// main game loop
		while (gameRunning) {
			// show the current state of the game
			gameState(player);
			// get user input an make upper case for easier input implementation
			String inputString = scanner.nextLine().toUpperCase();
			// check if there is input
			if (inputString.isEmpty()) {
				System.out.println("That's not how i works! Use W, A, S, D");
				continue;
			}

			// if-loop for every valid user input
			// all the same structure, but with different values

			// Move up
			if (inputString.equals("W")) {
				// First: check if y-coordinat < size -->can move up
				if (player.getY() < maze.getSize() - 1) {
					// Second: Check if tile is Wall
					Tile nextTile = maze.getTile(player.getX(), player.getY() + 1);
					if (nextTile != null && !nextTile.getWall()) {
						player.moveUp();
						player.loseEnergy();
						exitFound = checkWin(player, maze);
					} else {
						System.out.println("Stooop! Can't go there, it's a wall!");
					}
				} else {
					System.out.println("Stooop! Can't go there, it's a wall!");
				}
			}

			// Move down
			else if (inputString.equals("S")) {
				// First: check if y-coordinat > 0, because 0 is bottom of grid
				if (player.getY() > 0) {
					// Second: Check if tile is Wall
					Tile nextTile = maze.getTile(player.getX(), player.getY() - 1);
					if (nextTile != null && !nextTile.getWall()) {
						player.moveDown();
						player.loseEnergy();
						exitFound = checkWin(player, maze);
					} else {
						System.out.println("Stooop! Can't go there, it's a wall!");
					}
				} else {
					System.out.println("Stooop! Can't go there, it's a wall!");
				}
			}

			// Move left
			else if (inputString.equals("A")) {
				// First: check if x-coordinat > 0, because 0 is left side of grid
				if (player.getX() > 0) {
					// Second: Check if tile is Wall
					Tile nextTile = maze.getTile(player.getX() - 1, player.getY());
					if (nextTile != null && !nextTile.getWall()) {
						player.moveLeft();
						player.loseEnergy();
						exitFound = checkWin(player, maze);
					} else {
						System.out.println("Stooop! Can't go there, it's a wall!");
					}
				} else {
					System.out.println("Stooop! Can't go there, it's a wall!");
				}
			}

			// Move Right
			else if (inputString.equals("D")) {
				// First: check if x-coordinat > grid size --> can move right
				if (player.getX() < maze.getSize() - 1) {
					// Second: Check if tile is Wall
					Tile nextTile = maze.getTile(player.getX() + 1, player.getY());
					if (nextTile != null && !nextTile.getWall()) {
						player.moveRight();
						player.loseEnergy();
						exitFound = checkWin(player, maze);
					} else {
						System.out.println("Stooop! Can't go there, it's a wall!");
					}
				} else {
					System.out.println("Stooop! Can't go there, it's a wall!");
				}
			} else {
				System.out.println("This doesn't work....");
			}

			// check if player has 0 energy and therefore lost the game
			if (checkLose(player)) {
				gameRunning = false;
			}

		}
		// display the result of the game
		if (exitFound) {
			System.out.println("You escaped the Maze!");
		} else {
			System.out.println("Game over! Better Luck next time...");
		}

		scanner.close();

	}
	
	private static void gameState(Player player) {
		System.out.println("Position: (" + player.getX() + ", " + player.getY() + ")");
		System.out.println("Energy: " + player.getEnergy());
	}
	//check if player is standing on exit and therefore if the game is won
	public static boolean checkWin(Player player, Maze maze) {
		Tile currentTile = maze.getTile(player.getX(), player.getY());
		if (currentTile != null && currentTile.getExit()) {
			return true;
		}
		return false;
	}
	//check if player has more than 0 energy
	//if player has 0 energy then game is lost
	private static boolean checkLose(Player player) {
		return player.getEnergy() <=0;
	}
	
}
