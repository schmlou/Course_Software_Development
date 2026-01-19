package grid_world;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		World w = new World(2);
		Player p = new Player("huan son");

		boolean hasFound = false;
		
		System.out.println("Search for the treasure...");
		
		while (!hasFound) {
			String inputString = scanner.nextLine().toUpperCase();
			if (inputString.equals("W")) {
				if (p.getPlayerY() > 0) {
					p.moveUp();
				} else {
					System.out.println("Stooooop! This is a wall!! Yu Stupid");
				}

			} else if (inputString.equals("S")) {
				if (p.getPlayerY() < w.getSize()) {
					p.moveDown();
				} else {
					System.out.println("Stooooop! This is a wall!! Yu Stupid");
				}

			} else if (inputString.equals("A")) {
				if (p.getPlayerX() > 0) {
					p.moveLeft();
				} else {
					System.out.println("Stooooop! This is a wall!! Yu Stupid");
				}

			} else if (inputString.equals("D")) {
				if (p.getPlayerX() < w.getSize()) {
					p.moveRight();
				} else {
					System.out.println("Stooooop! This is a wall!! Yu Stupid");
				}
			} else {
				System.out.println("Are yo dump??? This doesn't work");
			}

			if (w.hasTreasure(p.getPlayerX(), p.getPlayerY())) {
				hasFound = true;
			} 
		}

	}
}
