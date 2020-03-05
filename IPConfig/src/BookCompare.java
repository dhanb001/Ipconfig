/**
 * This Book class is a collection of book-related data values 
 * (i.e. Title, Author, Number of Pages, and if it has a hard cover),
 *  allowing the author to demonstrate object comparison.
 *  <p>
 *  The data values inside of this class are private, 
 *  allowing access only through getter methods.
 *
 * 
 * @author Dalton
 *
 */
class Book {
		
	//Declaration of private Book Variables
	
	private String title, author; //Declares book string variables, title and author
	
	private int numPages; //Number of pages in book
		
	private boolean hardCover; //True if book has hard cover, false otherwise

	
	/**This is the non-default book constructor,
	 * <p>
	 * This constructor takes the following data parameters and creates a book object
	 * 
	 * 
	 * 
	 * @param bookTitle
	 * @param bookAuthor 
	 * @param pageNum 
	 * @param hasHardCover
	 */
	
	public Book(String bookTitle, String bookAuthor, int pageNum, boolean hasHardCover) {
		
		//Private variables initialized here, using constructor input
		title = bookTitle;
		
		author = bookAuthor;
		
		numPages = pageNum;
		
		hardCover = hasHardCover;
		
		///END CONSTRUCTOR
	}
	
	/**This method demonstrates comparison by value.
	 * 
	 * It takes data members from the respective book objects 
	 * and directly compares them.
	 *  @param o A book object to be compared
	 */
	boolean equals(Book o) {
		
		/* If a value does not match, status will be set to false
		 *  otherwise, default to true
		 */
		boolean status = true;
		
		//Check if titles are the same
		if (this.title.equals(o.getTitle())==false) { 
			System.out.println("Titles do not match:\t\t" //Print error message
			+ this.title + " does not equal " + o.getTitle());
			
			status = false; //Set status as false, otherwise remain true
		}
		
		
		//Check if authors are the same
		if (this.author.equals(o.getAuthor())==false) { 
			System.out.println("Authors do not match:\t\t" //Print error message
			+ this.author + " does not equal " + o.getAuthor());
			
			status = false; //Set status as false, otherwise remain true
		}
		
		//Check if page counts are the same
		if (this.getNumPages()!=o.getNumPages()) {
			System.out.println("Page Counts do not match:\t" //Print error message
			+ this.getNumPages() + " does not equal " + o.getNumPages());
			
			status = false; //Set status as false, otherwise remain true
		}
		
		//Check if books have same type of cover
		if (this.getHardCover()!=o.getHardCover()) {
			System.out.println("Cover types do not match"); //Print error message
		
			status = false; //Set status as false, otherwise remain true
		}
		
		
		return status; //Return status
	}
	

	/** Returns the title of associated Book object
	 * 
	 * @return String-title of Book
	 */
	String getTitle() {
		return title;
	}
	
	/** Returns the author of associated Book object
	 * 
	 * @return String-author of Book
	 */
	String getAuthor() {
		return author;
	}
	
	/** Returns the number of pages in the associated Book object
	 * 
	 * @return Integer-numPages of Book
	 */
	int getNumPages() {
		return numPages;
	}
	
	/** Returns a boolean determining if the Book has a hard cover
	 * 
	 * @return Boolean-if Book has hard cover
	 */
	boolean getHardCover() {
		return hardCover;
	}
	
	
	public String toString() {
		return ("Title: "+this.title +"\tAuthor: "+this.author
				+"\tPage Count: "+this.numPages
				+"\tHas hard cover: "+this.getHardCover());
	}
	
	
}
/** This class creates book objects and compares them, it functions as a driver
 * 
 * @author Dalton
 *
 */
class BookCompare {
	//This is the main method, simply responsible for running this particular class
	public static void main(String args[]) {
		Book firstBook = new Book("Java", "Oracle", 300, true);
		Book secondBook = new Book("Java", "Microsoft", 200, false);
		Book thirdBook = new Book("C++", "Oracle" , 300, true);
		
		///Print book data values using overridden toString method
		System.out.println("Book one:\n"+ firstBook
				+ "\n\nBook two:\n"+ secondBook
				+ "\n\nBook three:\n" + thirdBook + "\n");
		
		System.out.println("Checking if book one is equal to book two...\n");
		//Compare two book objects using overloaded equals method
		if(firstBook.equals(secondBook))
			System.out.println("Therefore, Book one is equal to Book two!");
		else
			System.out.println("\nTherefore, Book one does not equal Book two!");
		
		System.out.println("\nNow checking if book one is equal to book three...\n");
		if (firstBook.equals(thirdBook))
			System.out.println("Therefore, Book one is equal to Book three!");
		else
			System.out.println("\nTherefore, Book one does not equal Book three!");
	}

}
