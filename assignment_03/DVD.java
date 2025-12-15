package assignment_03;

public class DVD extends LibraryItem{
	private int duration;
	private String director;
	
	public DVD(String title, String publisher, int year, int duration, String director) {
		super(title, publisher, year);
		this.duration = duration;
		this.director = director;
	}
	
	public int getDuration () {
		return this.duration;
	}
	
	public String getDirector() {
		return this.director;
	}
	@Override
	public void displayDetails() {
		System.out.println("------DVD:");
		System.out.println("Title: " + getTitle());
		System.out.println("Publisher: " + getPublisher());
		System.out.println("Year: " + getYear());
		System.out.println("Duration: " + getDuration());
		System.out.println("Director: " + getDirector());
	}
}
