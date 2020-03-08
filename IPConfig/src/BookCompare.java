/**
 * This Book class is a collection of book-related data values 
 * (i.e. Title, Author and Number of Pages),
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
	 * @param nextTitle The String that will become the new title
	 */
	void setTitle(String newTitle) {
		this.title = newTitle; //Replaces current title with parameter
	}
	
	/** Takes a String parameter and sets a new author for the Book object
	 * 
	 * @param nextTitle The String that will become the new author
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
/** This class creates book objects and compares them, it functions as a driver
 * 
 * @author Dalton
 *
 */
class BookCompare {
	//This is the main method, simply responsible for running this particular class
	public static void main(String args[]) {
		Book firstBook = new Book("Java", "Oracle", 300);
		Book secondBook = new Book("Java", "Oracle", 300);
		Book thirdBook = new Book("C++", "Bell" , 200);
		
		///Print book data values using overridden toString method
		
		System.out.println("In this program, we will demonstrate instance comparison"
				+ " by reference and by value.\nThis will be accomplished using an "
				+ "arbitrary book object.\n\nBook objects have three private data values:\n"
				+ "1)String title   (The title of the book)\n"
				+ "2)String author  (The author of the book)\n"
				+ "3)Int numPages   (The number of pages in the book)\n");
		
		System.out.println("First, we must create three book objects.\n"
				+ "The first two books will have the same values.\n"
				+ "The third book will have different values from the first two.\n");
		
		System.out.println("The values of the created books will be printed below.\n"
				+ "This is accomplished by overriding the toString() method "
				+ "to accept Book objects.\n\n"
				+ "Book one:\n"+ firstBook
				+ "\n\nBook two:\n"+ secondBook
				+ "\n\nBook three:\n" + thirdBook + "\n");
		
		System.out.println("Now that we have created and displayed our book objects, "
				+ "we can now begin comparing the instances of this class.\n"
				+ "In order to accomplish comparison by value, "
				+ "the default equals() method must be overloaded.\n\n"
				+ "The overloaded equals() method will return true if and only if "
				+ "the books are identical, i.e. all the values are the same.\n");
		
		System.out.println("We will now compare two instances of our book class.\n"
				+ "The first book and the second book will be compared using "
				+ "the equals() method defined in the Book class.\n"
				+ "Because the two books have identical values, "
				+ "they will match when we compare them by value.\n");
		
		System.out.println("Result = " +firstBook.equals(secondBook) + "<-"
				+ "(Output from the Book equals() method)\n");
		
		System.out.println("We will now demonstrate that the equals() method"
				+ " within Book can actually detect mistakes.\n"
				+ "To do so, we will compare the first book to the third book.\n"
				+ "This will help demonstrate the validity of the overloaded method.\n");
		
		System.out.println("Book one:\n"+firstBook + "\n");
		System.out.println("Book three:\n"+thirdBook + "\n");
		
		System.out.println("Result = "+firstBook.equals(thirdBook) + "<-"
				+ "(Output from the Book equals() method)\n");
		
		System.out.println("In order to save space, and to test all of the checks, "
				+ "we will change the title of Book 3 to match Book 1 and then check for equality.\n");
		
		thirdBook.setTitle("Java"); ///Change the title of Book 3 to match Book 1
		
		System.out.println("Book three:\n"+thirdBook + "\n");
		
		System.out.println("Now we will compare the first book to the third book again."
				+ "This time the titles will be equal, but the other values will differ.\n");
		
		System.out.println("Result = "+firstBook.equals(thirdBook) + "<-"
				+ "(Output from the Book equals() method)\n");
		
		System.out.println("As you can see, we successfully compared the titles, only receiving an error statement for the authors.\n"
				+ "Now to ensure maximum utilization of the equals method, we will change the authors to match, "
				+ "leaving only the number of pages as a differing value.\n");
		
		thirdBook.setAuthor("Oracle"); ///Change the author of Book 3 to match Book 1
		
		System.out.println("Book three:\n"+thirdBook + "\n");
		
		System.out.println("Now we will compare the first book to the third book for a final time."
				+ "This time the titles and the authors will be equal.\n");
		
		System.out.println("Result = "+firstBook.equals(thirdBook) + "<-"
				+ "(Output from the Book equals() method)\n"); 
		
		System.out.println("Now that we have proven the validity of our overloaded equals() method,"
				+ "we can now move on to comparison by reference.\n\n");
		
		System.out.println("Now that we have compared two instances of our class by value, "
				+ "let's try comparing two identical instances by Reference instead.\n"
				+ "In order to compare by reference, the == operator will be used.\n"
				+ "The == operator compares whether two object "
				+ "references point to the same object "
				+ "instead of comparing the values inside the objects.\n");
		
		System.out.println("For easy differentiation between value-based and reference-based "
				+ "comparisons, we are going to compare the first book to the second book again.\n"
				+ "We will be using the == operator to check "
				+ "if the two books reference the same memory location/object.\n");
		
		System.out.println("Comparison by reference:\n"
				+ "Does firstBook == secondBook?\n"
				+ "Result = "+ (firstBook==secondBook));
		
		System.out.println("\nAs you can see above, even though the two book objects "
				+ "have the same values, they don't point to the same memory address.\n"
				+ "Therefore comparing by reference isn't useful when comparing unique objects.");
		
		
		System.out.println("Now, we will demonstrate when comparison by reference is useful.\n"
				+ "Comparing by reference is useful if two objects point to the same memory location.\n"
				+ "This will be demonstrated by making a fourth book, and making it equal the first book.\n");
		
		System.out.println("The fourth book will be declared and instantiated as follows:\n"
				+"Book fourthBook = firstBook;");
		
		Book fourthBook = firstBook; //Declare fourthbook as a reference to firstbook
		
		System.out.println("Now, the fourth book is a reference to the first book,"
				+ "meaning that comparison by reference will prove true.\n");
		
		System.out.println("We will now test this property by comparing "
				+ "fourthBook to firstBook using the == operator.\n"
				+ "This will check if the two books are referencing the same object/memory location.\n");
		
		System.out.println("Comparison by Reference part 2:\n"
				+ "Does fourthBook == firstBook?\n"
				+ "Result = " + (fourthBook == firstBook));
		
		System.out.println("\nThus, comparison of instances of a class by reference"
				+ " and value has been demonstrated.\n"
				+ "An equals() function was defined for book, and successfully used,"
				+ "demonstrating comparison by value.\n"
				+ "To demonstrate comparison by value, the default == operator was used.\n "
				+ "The == operator checked if memory address locations/object references matched.\n");
		
		System.out.print("Please run the program and read through the entire console output for a "
				+ "detailed explanation of class instance comparison by reference and value.");
	}

}
