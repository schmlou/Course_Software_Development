package monster_killer;

public class Player {
	private String name;
	private int health;
	private Weapon weapon;
	
	Player(String name, Weapon weapon) {
		this.name = name;
		this.weapon = weapon;
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
	
	public void attack(Monster m, Weapon w) {
		m.setHealth(m.getHealth() - w.getDamagePower());
	}
	
}