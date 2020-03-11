package objectcomparison;

/**
 * This Book class is a collection of book-related data values 
 * (i.e. Title, Author and Number of Pages),
 *  allowing me to demonstrate object comparison.
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
	
	/**
	 * String representation of book's title
	 */
	private String title;
	
	/**
	 * String representation of book's author
	 */
	private String author; 
	
	/**
	 * Number of pages in book
	 */
	private int numPages;
		

	
	/**This is the non-default book constructor,
	 * <p>
	 * This constructor takes the following data parameters and creates a book object
	 * 
	 * @param bookTitle Parameter for the title of the book
	 * @param bookAuthor Parameter for the author of the book
	 * @param pageNum Parameter for the number of pages found in the book
	 * 
	 */
	
	public Book(String bookTitle, String bookAuthor, int pageNum) {
		
		//Private variables initialized here, using constructor input
		title = bookTitle;
		
		author = bookAuthor;
		
		numPages = pageNum;
		
		///END CONSTRUCTOR
	}

	///GETTER METHODS
	

	/** Returns the title of associated Book object
	 * 
	 * @return (String) Title of Book
	 */
	String getTitle() {
		return title;
	}
	
	/** Returns the author of associated Book object
	 * 
	 * @return (String) Author of Book
	 */
	String getAuthor() {
		return author;
	}
	
	/** Returns the number of pages in the associated Book object
	 * 
	 * @return Integer representation of pages in book
	 */
	int getNumPages() {
		return numPages;
	}
	
	/** Takes a String parameter and sets a new title for the Book object
	 * 
	 * @param newTitle The String that will become the new title
	 */
	void setTitle(String newTitle) {
		this.title = newTitle; //Replaces current title with parameter
	}
	
	/** Takes a String parameter and sets a new author for the Book object
	 * 
	 * @param newAuthor The String that will become the new author
	 */
	void setAuthor(String newAuthor) {
		this.author = newAuthor; //Replaces current author with parameter
	}
	/** Takes an integer parameter and sets a new number of pages for the Book object
	 * 
	 * @param newPages The integer value that will become the new number of pages
	 */
	void setNumPages(int newPages) {
		this.numPages = newPages; //Replaces current number of pages with parameter
	}
	

	
	/** Overload of the toString method, allowing printing of Book objects in console
	 * <p>
	 * The values that will be printed are as follows:
	 * <p>Name + Author + Page Count 
	 * @return String representation of a book object
	 */
	@Override
	public String toString() {
		return ("Title: "+this.title +"\tAuthor: "+this.author
				+"\tNumber of Pages: "+this.numPages);
	}
	
	/**Overload of the equals method, allowing us to compare two books by value
	 * <p>
	 * NOTE: This function will print out where the values did not match
	 * 
	 * @param b The Book object being compared
	 * @return Boolean representing whether the books are equal
	 */
	public boolean equals(Book b) {
		boolean status = false; //Default to false, true only if all values match
		
		/*Compare values of two book objects,
		 * using getter methods and nested if statements.
		 * 
		 * NOTE: Else statements are only for identifying where values didn't match
		 */
		System.out.println("Comparing titles...");
		if (this.getTitle().equals(b.getTitle())) { //Compare Strings using .equals
			System.out.println("Titles match! Comparing authors...");
			if (this.getAuthor().equals(b.getAuthor())) {
				System.out.println("Authors match! Comparing number of pages...");
				if(this.getNumPages()==b.getNumPages()) { //Compare integers using ==
					System.out.println("Number of Pages Match!");
					status = true; //Change status to true iff all values match
				}
				else { //Print statement if number of pages did not match
					System.out.println("Number of pages did not match.");
				}
			}
			else { //Print statement if authors did not match
				System.out.println("Authors did not match.");
			}
		}
		else {//Print statement if titles did not match
			System.out.println("Titles did not match.");
		}
		
		//Check if the status is true
		if(status==true) { //Print success statement if status==true
			System.out.println("Therefore, the books match when compared by value!");
		}
		else {//Print failure statement if status==false
			System.out.println("Therefore, the books do not match when compared by value!");
		}
			
		
		return status; //Return the boolean value
	}
}
	