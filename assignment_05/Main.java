package assignment_05;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Initialise game objects
		Scanner scanner = new Scanner(System.in);
		Map map = new Map(6);
		Player player = new Player();

		// place guard at random position, but not at 0,0
		Random random = new Random();
		int guardX;
		int guardY;
		do {
		    guardX = random.nextInt(map.getSize());
		    guardY = random.nextInt(map.getSize());
		} while ((guardX == 0 && guardY == 0) || map.getTile(guardX, guardY).getWall());


		Guard guard = new Guard(guardX, guardY);

		// game variables
		boolean gameRunning = true;
		boolean playerWon = false;

		System.out.println("Use w, a, s, d to move and find all the treasures! But don't get caught by the Guard!!!");

		// game loop
		while (gameRunning) {

			// Get input
			System.out.print("Move (W/A/S/D/Q): ");
			String input = scanner.nextLine().toUpperCase().trim();

			if (input.isEmpty()) {
				System.out.println("Wrong input!");
				continue;
			}

			char move = input.charAt(0);

			// Player moves
			boolean moved = player.move(move, map);

			if (!moved) {
				System.out.println("There is a wall!");
				continue;
			}

			// Check treasure
			if (map.hasTreasure(player.getX(), player.getY())) {
				player.collectedTreasures();
				map.pickUpTreasure(player.getX(), player.getY());
				System.out.println("You have found a treasure!");
			} else {
				System.out.println();
			}

			// Guard moves randomly
			guard.move('X', map);

			// Check if caught
			if (guard.capturePlayer(player)) {
				System.out.println("Oh no! The guard caught you!");
				gameRunning = false;
			}

			// Check if won
			if (map.allTreasuresFound()) {
				playerWon = true;
				gameRunning = false;
			}
		}
		if (playerWon) {
			System.out.println("You found all the treasures!");
		} else {
			System.out.println("You Lost!");
		}

		System.out.println("Treasures found: " + player.getCollectedTreasures());
		scanner.close();

	}
}