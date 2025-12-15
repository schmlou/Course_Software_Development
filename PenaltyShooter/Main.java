package PenaltyShooter;

public class Main {
	
	public static void main(String[] args) {
		Player s1 = new Shooter("Emre Can");
		Player g1 = new Goalkeeper("Roman Weidenfeller");
	
		System.out.println(s1.getName());
		System.out.println(g1.getName());
		
		for(int i = 0; i <= 4; i++) {
			int shot = s1.chooseDirection();
			int dive = g1.chooseDirection();
			
			if(shot == dive) {
				System.out.println(g1.getName() + "was succesfull");
				g1.addScore();
			} else {
				System.out.println(s1.getName() + "was succesfull");
				s1.addScore();
			}
			
			System.out.println(g1.getName() + ": " + g1.getScore());
			System.out.println(s1.getName() + ": " + s1.getScore());
		}
	}
}