/**
 * This class will demonstrate Object Comparison
 * 
 * the book will have comparable data members
 * 
 * data members will demonstrate comparisons
 * 
 * @author dhanbury
 *
 */
public class Book {
		
	private String title, author; //Declares book string variables
	
	private int numPages; //Number of pages in book
		
	private boolean hardCover; //True if book has hard cover, false otherwise

	
	/**This is the non-default book constructor
	 * 
	 * it takes data parameters and creates a book object
	 * 
	 * this simplifies object creation
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
	}
	
}
