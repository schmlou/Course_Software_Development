package monster_killer;

public class Weapon {
	private String weaponType;
	private int damagePower;
	
	Weapon(String weaponType, int damagePower) {
		this.weaponType = weaponType;
		this.damagePower = damagePower;
	}
	
	public int getDamagePower() {		//getter
		return this.damagePower;
	}
}
