package assignment_03;

public class Book extends LibraryItem{
	private String author;
	private int numPages;
	
	public Book(String title, String publisher, int year, String author, int numPages) {
		super(title, publisher, year);
		this.author = author;
		this.numPages = numPages;
	}
	
	
	public int getNumPages() {
		return this.numPages;
	}
	@Override
	public void displayDetails() {
		System.out.println("------Book:");
		System.out.println("Title: " + getTitle());
		System.out.println("Author: " + author);
		System.out.println("Publisher: " + getPublisher());
		System.out.println("Year: " + getYear());
		System.out.println("Number of Pages: " + getNumPages());
	}
}