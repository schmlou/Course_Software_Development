package firstproject;

public class Person {
	String name;
	int age;
	
	Person (String name, int age) {	//constructor
		this.name = name;
		this.age = age;
	}
	
	void walk() {
		System.out.println("I'm walking!");
	}
	public void sayHi() {
		if (name == "Markus") {
			System.out.println("Du geile Sau!");
		}	else if (name == "Tizi") {
			System.out.println("Ich war schon laufen, surfen und im Gym");
		} 	else {
			System.out.println("Ich bin nicht Markus und Tizi");
		}
	}
}