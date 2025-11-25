package firstproject;

public class Car {
	private String brand;
	private int speed;
	private Person owner;
	
	Car (String brand, int speed, Person owner) {	//constructor
		this.brand = brand;
		this.speed = speed;
		this.owner = owner;
	}
	
	public void setSpeed(int newSpeed) {	//setter
		if (newSpeed < 0) {
			System.out.println("The speed cannot be negative");
		}	else {
		this.speed = newSpeed;
		}
	}
	
	public int getSpeed() {		//getter
		return this.speed;
	}
	public void setBrand(String newBrand) {
		this.brand = newBrand;
	}
	
	public String getBrand() {
		return this.brand;
	}
	public void setOwner(Person newOwner) {
		this.owner = newOwner;
	}
	
	public Person getOwner() {
		return this.owner;
	}
	
	void braking() {
	System.out.println("Hau in die Eisen du hooond");
	}
}
