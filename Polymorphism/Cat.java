package Polymorphism;

public class Cat extends Animal {

	@Override
	public void makeSound() {
		System.out.println("Meow");
	}
	
	@Override
	public String toString() {
		return "This is my cat!";
	}
}