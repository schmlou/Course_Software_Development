package firstproject;

import java.util.Arrays;

public class Main {
//every project needs a main.java file
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 13;
		double speed = 3.66;
		double secondNumber =  156.01;
		boolean isStudent = true;
				
		for (int i = 0; i <= 20; i++) {
			//System.out.println("Im a student " + i);
		}
		
		int j = 0;
		while (j < 20 ) {
			//System.out.println("I'm a student " + j);
			j = j +1;
		}
		
		
		if (age >= 18) {
			//System.out.println("You are an adult!");
		} else {
			//System.out.println("You are a minor!");
		}
		
		int[] grades = {10, 5, 9, 7};
		//int myGrades = grades[0];
		
		//System.out.println(Arrays.toString(grades));
		//System.out.println(grades.length);
		
		for (int i = 0; i < grades.length; i++) {
			//System.out.println(grades[i]);
		}
		
		double[] numbers = {9.2, 3.3, 4.9, 6.9, 5.1};
		double sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		double average = sum/numbers.length;
		//System.out.println(average);
		
		double myOutput = getAverage(numbers);
		System.out.println(myOutput);
		
	}
	//function for calculating average in any array
	static double getAverage(double[] arr) {
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		double avrg = sum/arr.length;
		return avrg;
	}
	
		double[] [] numbComp = {
				{9.2, 3.3, 4.9, 6.9, 5.1},
				{1.5, 1.4, 5.6, 7.1, 2.1}
		};
		
	static double compare(double [][] arr) {
		double winner = Double.NEGATIVE_INFINITY; 
		for (int i = 0; i < arr.length; i++) {
			double x = arr[0][i];
			double y = arr[1][i];
			double larger = (x > y) ? x: y;
			
			if (larger > winner) {
			winner = larger;
			}
		return winner;
			}
		} */
	
	public static void main(String[] args) {
		Person p1 = new Person("Louis", 23);
		Person p2 = new Person("Maria", 20);
		Person p3 = new Person("Tizi", 25);
		//System.out.println(p1.name);
		//System.out.println(p2.name);
		p1.walk();
		p2.walk();
		
		Car c1 = new Car("VW", 69, new Person("Markus", 26));
		Car c2 = new Car("Benz", 187, p1);
		c1.setSpeed(-50);
		
		System.out.println(c1.getOwner());
		
		p3.sayHi();
		
	}
}
