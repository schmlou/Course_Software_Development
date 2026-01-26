package Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>(); 

		animals.add(new Dog());
		animals.add(new Cat());
		
		for (Animal a : animals) {
			System.out.println(a);
		}
	}
}
