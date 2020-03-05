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
		
		/*
		 * If a value does not match, status will be set to false
		 *  Status will be returned at the end of the method
		*/
		boolean status = true;
		
		
		//Check if titles are the same
		if (this.title.equals(o.getTitle())==false) { 
			//If false, print error output and set status to false
			System.out.println("Titles do not match\n"
			+ this.title + " does not equal " + o.getTitle());
			
			status = false; //Set status as false
		}
		
		
		//Check if authors are the same
		if (this.author.equals(o.getAuthor())==false) { 
			//If false, print error output and set status to false
			System.out.println("Authors do not match\n"
			+ this.author + " does not equal " + o.getAuthor());
			
		}
		return status; //Return status
	}
	

	/** Retrieves the title of associated Book object
	 * 
	 * @return title of specified Book
	 */
	String getTitle() {
		return title;
	}
	
	/** Retrieves the author of associated Book object
	 * 
	 * @return author
	 */
	String getAuthor() {
		return author;
	}
	
	int getNumPages()
	
}
/** This class creates book objects and compares them, it functions as a driver
 * 
 * @author Dalton
 *
 */
class BookCompare {
	//This is the main method, simply responsible for running this particular class
	public static void main(String args[]) {

		
	}

}
