package PenaltyShooter;

public class Shooter extends Player{
	
	public Shooter(String name) {
		super(name);
	}
	public int chooseDirection() {
		System.out.println(this.getName() + "! It's your turn! 1,2 or 3?");
		int direction = scanner.nextInt();
		return direction;
	}
}
