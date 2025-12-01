package racing_game;

public class Main {
	
	public static void main(String[] args) {
		Car c1 = new Car("Omid's car");
		Truck t1= new Truck("Tanmay's truck");
		Motorcycle m1 = new Motorcycle("Yaya's moped");
		
		System.out.println(t1.getName() + " Starts at: " + t1.getPosition());
		System.out.println(m1.getName() + " Starts at: " + m1.getPosition());
		System.out.println(c1.getName() + " Starts at: " + c1.getPosition());
		System.out.println("----------------------");
		
		t1.move();
		c1.move();
		m1.move();
		
		System.out.println(t1.getName() + " now at: " + t1.getPosition());
		System.out.println(m1.getName() + " now at: " + m1.getPosition());
		System.out.println(c1.getName() + " now at: " + c1.getPosition());
		System.out.println("----------------------");
		
		t1.move();
		c1.move();
		m1.move();
		
		System.out.println(t1.getName() + " now at: " + t1.getPosition());
		System.out.println(m1.getName() + " now at: " + m1.getPosition());
		System.out.println(c1.getName() + " now at: " + c1.getPosition());
		System.out.println("----------------------");
		
		t1.move();
		c1.move();
		m1.move();
		
		System.out.println(t1.getName() + " now at: " + t1.getPosition());
		System.out.println(m1.getName() + " now at: " + m1.getPosition());
		System.out.println(c1.getName() + " now at: " + c1.getPosition());
		System.out.println("----------------------");
		
		t1.move();
		c1.move();
		m1.move();
	}
}