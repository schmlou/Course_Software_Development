package assignment_03;

public abstract class LibraryItem {
	private String title;
	private String publisher;
	private int year;
	
	public LibraryItem (String title, String publisher, int year) {
		this.title = title;
		this.publisher = publisher;
		this.year = year;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getPublisher() {
		return this.publisher;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public abstract void displayDetails();
	
	
	//extra task
	public boolean isPublishedBefore(int year) {
		return this.year < year;
	}
}