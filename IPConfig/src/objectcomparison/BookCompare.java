package objectcomparison;
/** This class creates book objects and compares them, it functions as a driver for {@link Book}
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
				+ "The now-overloaded equals() method will return true if and only if "
				+ "the books are identical, i.e. all the values are the same.\n");
		
		System.out.println("We will now compare two instances of our book class.\n"
				+ "The first book and the second book will be compared using "
				+ "the equals() method defined in the Book class.\n\n"
				+ "Because the two books have identical values, "
				+ "they will match when we compare them by value.\n");
		
		System.out.println("Result = " +firstBook.equals(secondBook) + " <-"
				+ "(Output from the Book equals() method)\n");
		
		System.out.println("We will now demonstrate that the equals() method"
				+ " within Book can actually detect mistakes.\n"
				+ "To do so, we will compare the first book to the third book.\n"
				+ "This will demonstrate the validity of the overloaded method.\n");
		
		System.out.println("Book one:\n"+firstBook + "\n");
		System.out.println("Book three:\n"+thirdBook + "\n");
		
		System.out.println("Result = "+firstBook.equals(thirdBook) + " <-"
				+ "(Output from the Book equals() method)\n");
		
		System.out.println("In order to save space, and to test all of the checks, "
				+ "we will change the title of Book 3 to match Book 1 and then check for equality.\n");
		
		thirdBook.setTitle("Java"); ///Change the title of Book 3 to match Book 1
		
		System.out.println("Book three:\n"+thirdBook + "\n");
		
		System.out.println("Now we will compare the first book to the third book again."
				+ "This time the titles will be equal, but the other values will differ.\n");
		
		System.out.println("Result = "+firstBook.equals(thirdBook) + " <-"
				+ "(Output from the Book equals() method)\n");
		
		System.out.println("As you can see, we successfully compared the titles, only receiving an error statement for the authors.\n"
				+ "Now to ensure maximum utilization of the equals method, we will change the authors to match, "
				+ "leaving only the number of pages as a differing value.\n");
		
		thirdBook.setAuthor("Oracle"); ///Change the author of Book 3 to match Book 1
		
		System.out.println("Book three:\n"+thirdBook + "\n");
		
		System.out.println("Now we will compare the first book to the third book for a final time."
				+ "This time the titles and the authors will be equal.\n");
		
		System.out.println("Result = "+firstBook.equals(thirdBook) + " <-"
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
				+ "Therefore comparing by reference isn't useful when comparing unique objects.\n");
		
		
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
				+ " and by value has been demonstrated.\n"
				+ "An equals() function was defined for book, and successfully used, "
				+ "demonstrating comparison by value.\n"
				+ "To demonstrate comparison by reference, the default == operator was used.\n"
				+ "The == operator checked if memory address locations/object references matched.\n");
		
		System.out.print("Please run the program and read through the entire console output for a "
				+ "detailed explanation of class instance comparison by reference and value.");
	}

}
