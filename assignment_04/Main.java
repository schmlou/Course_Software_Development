package assignment_04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//need a scanner to check the user input
		Scanner scanner = new Scanner(System.in);
		//need to generate grid to play
		Maze maze = new Maze(5);
		//need a player 
		Player player = new Player(15);
	}
}
