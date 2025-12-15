package assignment_03;

public class Magazine extends LibraryItem{
	private int issueNumber;
	private String month;
	
	public Magazine(String title, String publisher, int year, int issueNumber, String month) {
		super(title, publisher, year);
		this.issueNumber = issueNumber;
		this.month = month;
	}
	
	public int getIssueNumber() {
		return this.issueNumber;
	}
	
	public String getMonth() {
		return this.month;
	}
	@Override
	public void displayDetails() {
		System.out.println("------Magazine:");
		System.out.println("Title: " + getTitle());
		System.out.println("Publisher: " + getPublisher());
		System.out.println("Year: " + getYear());
		System.out.println("Issue Number: " + getIssueNumber());
		System.out.println("Month: " + getMonth());
	}
}
