package monster_killer;

public class Main {
	
	public static void main(String[] args) {
		Weapon w1 = new Weapon("Sword", 50);
		//System.out.println(w1);
		
		Player p1 = new Player("Peter", w1);
		//System.out.println(p1);
		
		Monster m1 = new Monster("Undav");
		//System.out.println(m1.isAlive());
		
		m1.attack(p1);
		
		m1.getStatus();
		p1.getStatus();
		
		p1.attack(m1, w1);
		
		m1.getStatus();
		p1.getStatus();
		
		p1.attack(m1, w1);
		
		m1.getStatus();
		p1.getStatus();
		
		
		System.out.println(m1.isAlive());
		
	}
}