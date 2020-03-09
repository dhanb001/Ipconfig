package generics;

/**
 * This class is the driver for our Collection classes.
 * <p>
 * The classes that are actually invoked here are {@link IntegerCollection}, 
 * {@link DoubleCollection}, & {@link Collection}
 * @author Dalton
 *
 */
public class CollectionTester {
	/**
	 * Main/Driver function for generics package
	 * @param args
	 */
	public static void main(String args[]) {
		
		//==================================
		//PROPER INTEGER COLLECTION CREATION
		//==================================
		System.out.println("In this class we will demonstrate proper type checking "
				+ "and code reuse by utilizing a generic interface and an abstract class.\n\n"
				+ "First, we will create an array of Integer objects, "
				+ "and then place that array into a Collection of Integer types.\n");
		
		System.out.println("We create our Integer array by calling "
				+ "\'Integer[] intArray1 = { 1, 5, 10, 3, -2, 4};\'\n"
				+ "We then create an IntegerCollection by calling "
				+ "\'Collection<Integer> intCollect1 = new IntegerCollection(intArray1, 1);\'\n");

		Integer[] intArray1 = { 1, 5, 10, 3, -2, 4}; //Declare Integer array
		
		//Create Collection of type Integer
		Collection<Integer> intCollect1 = new IntegerCollection(intArray1, 1);

		System.out.println("Now we will print the Collection using the type-specific "
				+ "PrintCollection() methods.");
		
		intCollect1.printCollection(); //Print the Integer Collection
		
		System.out.println("Now we will print the maximum and minimum values in the Collection "
				+ "by using the Generic min() and max() found in Collection.");
		
		//Print maximum value using max() method in Collection class
		System.out.println("Maximum number in Integer Array 1 = "+(intCollect1.max()));
		//Print minimum value using min() method in Collection class
		System.out.println("Minimum number in Integer Array 1 = "+(intCollect1.min())+"\n");
		
		
		System.out.println("This is the proper output for an Integer Collection."
				+ "This happens when types are properly matched, instantiated, and invoked.\n\n");

		//====================================================================
		//IMPROPER INTEGER COLLECTION CALLING & DEMONSTRATION OF TYPE CHECKING
		//====================================================================
		System.out.println("When creating a Collection, "
				+ "proper type matching is crucial, as will be demonstrated.\n");
		
		System.out.println("To demonstrate, lets try to place a collection of type "
				+ "Integer into a Collection where the Collection type is defined as Double.\n");	

		System.out.println("First, we will create a standard Integer array by calling "
				+ "Integer[] intArray2 = {2, 6, 9, 13, 2, -5};\n");
		
		Integer[] intArray2 = {2, 6, 9, 13, 2, -5}; //Create a second integer array
		
		System.out.println("To demonstrate type checking, we will attempt to compile using the code:\n"
				+ "\'Collection<Double> intCollect2 = new IntegerCollection(intArray2, 2);\'\n");
		
		//If we try to create an integer collection but mark the Collection type as Double, an error is thrown.
		//We cannot have a type mismatch between Collection<T> and the actual collection created.
		//Collection<Double> intCollect2 = new IntegerCollection(intArray2, 2);
		
		System.out.println("If we try to create an integer collection but mark "
				+ "the Collection type as Double, an error is thrown and the code won't compile.\n"
				+ "We cannot have a type mismatch between Collection<T> "
				+ "and the actual collection created.\n");
		
		System.out.println("To fix this, we must instantiate Collection<Double> as Collection<Integer>.\n"
				+ "The proper call is \'Collection<Integer> intCollect2 = new IntegerCollection(intArray2, 2);\'\n");
		
		//Successfully create an integer collection using correct call
		Collection<Integer> intCollect2 = new IntegerCollection(intArray2, 2);
		
		System.out.println("This statement compiles properly, and will output properly, "
				+ "meaning it satisfied the type-checking set forth by the classes.\n ");
		
		System.out.println("We will now print the Integer collection and its "
				+ "maximum and minimum values.\n");
		//Print Integer Collection 2
		intCollect2.printCollection();
		//Print maximum value using max() method in Collection class
		System.out.println("Maximum number in Integer Array 2 = "+(intCollect2.max()));
		//Print minimum value using min() method in Collection class
		System.out.println("Minimum number in Integer Array 2 = "+(intCollect2.min())+"\n\n");
		
		System.out.println("We can demonstrate another example of type checking/safety by "
				+ "attempting to place a Double array parameter into an IntegerCollection.\n"
				+ "\nTo accomplish this, we will instantiate a Double array by calling "
				+ "\'Double[] doubleForInt1 = {2.2, 3.5, 9.6, 4.9, -5.8};\'\n");
		
		Double[] doubleForInt1 = {2.2, 3.5, 9.6, 4.9, -5.8}; //Instantiate Double tester array
		
		System.out.println("Now we will attempt to declare an Integer Collection "
				+ "using our Double array as a parameter.\n"
				+ "The call will be: \'Collection<Integer> doubleIntCollect1 = new IntegerCollection(doubleForInt1, 3);\'\n");
		
		//Collection<Integer> doubleIntCollect1 = new IntegerCollection(doubleForInt1, 3);
		//This code had to be commented out because it doesn't match the constructor in IntegerCollection.
		
		System.out.println("This code fails to compile because the double parameter "
				+ "doesn't match the constructor set forth by IntegerCollection.\n"
				+ "We can also attempt to compile it by changing Collection<Integer> "
				+ "to Collection<Double>, however this only throws a type mismatch error.\n");
				
		//Collection<Double> doubleIntCollect1 = new IntegerCollection(doubleForInt1, 3);
		//This code still does not compile, and it throws an additional type mismatch error.
				
		System.out.println("Changing the collection type to Double doesn't fix the "
				+ "issue of failing to match the constructor parameters.\n\n"
				+ "Therefore, Double type array can only be used to create DoubleCollections.\n"
				+ "Inversely, Integer type arrays can only be used to create IntegerCollections.\n\n\n");
		
		//=================================
		//PROPER DOUBLE COLLECTION CREATION
		//=================================
		
		System.out.println("Now that we've thorougly examined Integer Collections,"
				+ "we will now demonstrate the Double Collections.\n"
				+ "First, we will show the proper implementation & creation of a"
				+ "Double type Collection.\n");
		
		System.out.println("To start, we will create a double array by calling "
				+ "\'Double[] doubleArray1 = {1.5, 5.3, 10.2, 3.1, -2.7, 4.9};\'\n");
		
		Double[] doubleArray1 = {1.5, 5.3, 10.2, 3.1, -2.7, 4.9};//Create Double-type array
		
		System.out.println("Then we will create a Collection of type Double by calling:\n"
				+ "\'Collection<Double> doubleCollect1 = new DoubleCollection(doubleArray1, 1);\'\n");
		
		//Create collection of type Double, using doubleArray1
		Collection<Double> doubleCollect1 = new DoubleCollection(doubleArray1, 1);
		
		System.out.println("The code compiles with no errors, so we are now free to "
				+ "print the collection and display the maximum and minimum values in the set.\n");
		
		doubleCollect1.printCollection(); //Print the collection using method in DoubleCollection()
		//Print the maximum value using max() in Collection
		System.out.println("Maximum number in double Array 1 = "+(doubleCollect1.max()));
		//Print the minimum value using min() in Collection
		System.out.println("Minimum number in double Array 1 = "+(doubleCollect1.min())+"\n");
		
		System.out.println("This is the proper output for a DoubleCollection.\n"
				+ "This means that type matching, creation, and instantiation "
				+ "was done properly.\n\n");
		
		//====================================================================
		//IMPROPER DOUBLE COLLECTION CALLING & DEMONSTRATION OF TYPE CHECKING
		//====================================================================
		
		System.out.println("Just like with Integer Collections, "
				+ "proper type matching for Double Collections is essential.\n");
		
		System.out.println("To demonstrate, lets try to place a collection of type " 
				+ "Double into a Collection where the Collection type is declared as an Integer.\n");
		
		System.out.println("First we will create a standard Double array by calling "
				+ "\'Double[] doubleArray2 = {2.5, 6.3, 9.7, 13.4, 2.1, -5.9};\'");
		Double[] doubleArray2 = {2.5, 6.3, 9.7, 13.4, 2.1, -5.9}; //Create an array of doubles
		
		System.out.println("Then we will attempt to compile using the code:\n"
				+ "\'Collection<Integer> doubleCollect2 = new DoubleCollection(doubleArray2, 2);\'\n");
		
		//Collection<Integer> doubleCollect2 = new DoubleCollection(doubleArray2, 2);
		//The example statement above does not compile due to a type mismatch error, therefore it is commented out.
		//To see the error, simply uncomment the statement
		
		System.out.println("The code does not compile due to a type mismatch error between "
				+ "Collection<Integer> and DoubleCollection.\n"
				+ "This means that a Collection of type Integer cannot be a DoubleCollection, "
				+ "and the inverse is also true.\n");
		
		System.out.println("Let's try to change DoubleCollection to IntegerCollection to "
				+ "see if that solves the type mismatch problem.\n");
		
		System.out.println("Our new call would be "
				+ "\'Collection<Integer> doubleCollect2 = new IntegerCollection(doubleArray2, 2);\'\n");
		
		//Collection<Integer> doubleCollect2 = new IntegerCollection(doubleArray2, 2);
		//The example statement above does not compile due to doubleArray2 not matching the IntegerCollection constructor
		//To see the error, simply uncomment the statement
		
		System.out.println("Our change removed the type mismatch error, but now we are faced "
				+ "with an error involving the IntegerCollection constructor.\n"
				+ "The IntegerCollection constructor is undefined for a Double array, therefore "
				+ "the code won't compile. This is a demonstration of type safety.\n");
		
		System.out.println("It has been made clear that the IntegerCollection and DoubleCollection "
				+ "classes are only made to work with their specified types.\n"
				+ "Attempting to bypass the type checking/safety of the compiler will only "
				+ "result in compilation failures.\n");
		
		System.out.println("Now we will properly instantiate our Double collection by calling:\n"
				+ "\'Collection<Double> doubleCollect2 = new DoubleCollection(doubleArray2, 2);\'\n");
		
		//Successfully Create a collection of type Double
		Collection<Double> doubleCollect2 = new DoubleCollection(doubleArray2, 2);
		
		System.out.println("The call above compiles, so now we are free to print the "
				+ "Double collection and print its maximum and minimum values.\n");
		
		doubleCollect2.printCollection(); //Print Double collection
		//Print maximum value in Double array2 using max()
		System.out.println("Maximum number in double Array 2 = "+(doubleCollect2.max()));
		//Print minimum value in Double array2 using min()
		System.out.println("Minimum number in double Array 2 = "+(doubleCollect2.min())+"\n\n");
	
		System.out.println("We have now demonstrated strong type checking and code reuse through "
				+ "the use of a generic interface and an abstract Collection class.\n\n"
				+ "Because implementation of a generic interface requires type arguments "
				+ "to be specified, we were able to ensure type mismatches wouldn't occur.\n"
				+ "The strong type checking associated with generics, and the use of generics "
				+ "expanded our ability to reuse code and employ type safety.\n");
		
		System.out.println("The strong type checking found in this package caused/indicated more "
				+ "errors at compilation time, but prevented any errors during run-time.\n"
				+ "This was demonstrated by the type-mismatch errors we experienced. The "
				+ "faulty code had to be commented out to permit proper compilation.\n\n\n");
		
		System.out.println("If you are starting at the bottom of the output, please scroll "
				+ "to the top to begin the walk-through of the Generics assignment.\n\n");
		
		System.out.println("NOTE: \tThe classes associated with this project are within the Generics "
				+ "package. \n"
				+ "\tThis class' purpose is only to serve as a driver for the program.");

		
	}

}
