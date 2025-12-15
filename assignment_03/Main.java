package assignment_03;

public class Main {
	
	public static void main(String[] args) {
		LibraryItem b1 = new Book("Prisoners of Geography", "Elliott & Thompson", 2015, "Tim Marshall", 256);
		LibraryItem b2 = new Book("The power of Geography", "Elliott & Thompson Limited", 2021, "Tim Marshall", 360);
		LibraryItem m1 = new Magazine("Nature", "Nature Portfolio", 2021, 27-10, "October");
		LibraryItem m2 = new Magazine("Science", "American Association for the Advancement of Science", 1880, 23456, "June");
		LibraryItem d1 = new DVD("Cars", "Disney", 2006, 116, "John Lasseter");
		System.out.println("Library:");
		b1.displayDetails();
		b2.displayDetails();
		m1.displayDetails();
		m2.displayDetails();
		d1.displayDetails();
		
		
		//extra Task
		int year = 2009;
		System.out.println("------ Published before " + year);
		
		System.out.println(b1.getTitle() + ": " + (b1.isPublishedBefore(year) ? "Yes" : "No"));
		System.out.println(b2.getTitle() + ": " + (b2.isPublishedBefore(year) ? "Yes" : "No"));
		System.out.println(m1.getTitle() + ": " + (m1.isPublishedBefore(year) ? "Yes" : "No"));
		System.out.println(m2.getTitle() + ": " + (m2.isPublishedBefore(year) ? "Yes" : "No"));
		System.out.println(d1.getTitle() + ": " + (d1.isPublishedBefore(year) ? "Yes" : "No"));
	}
}