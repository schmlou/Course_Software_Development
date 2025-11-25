package monster_killer;

import java.util.Random;

public class Monster {
	private String name;
	private int health;
	
	Monster(String name) {
		this.name = name;
		this.health = 100;
	}
	
	public int getHealth() {		//getter
		return this.health;
	}
	
	public void setHealth(int h) {	//setter
		this.health = h;
	}
	
	public boolean isAlive() {
		//return health > 0;
		if (this.health <= 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public void getStatus() {
		System.out.println(this.name + " has " + this.health + "% health!");
	}
	
	public void attack(Player p) {
		Random randomGenerator = new Random();
		p.setHealth(p.getHealth() - randomGenerator.nextInt(100));
	}
}
