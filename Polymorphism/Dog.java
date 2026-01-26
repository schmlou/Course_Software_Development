package Polymorphism;

public class Dog extends Animal {

	@Override
	public void makeSound() {
		System.out.println("Wuff");
	}

	@Override
	public String toString() {
		return "This is ma dawg!";
	}
}