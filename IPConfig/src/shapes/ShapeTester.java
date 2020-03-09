package shapes;

/**This is the driver for the shapes package. We will use this to test the
 * polymorphism between our 3 shapes, {@linkplain shapes.Circle}, 
 * {@linkplain shapes.Rectangle}, and {@linkplain shapes.Square}.
 * <p>
 * The shapes will be compared using the implemented versions of {@linkplain shapes.Shape#compareArea(Shape)}
 * and {@linkplain shapes.Shape#comparePerimeter(Shape)}
 * <p>
 * The implemented versions of the compare methods will demonstrate Polymorphism.
 * 
 * @author Dalton
 *
 */
public class ShapeTester {
	
	/**
	 * The main method/driver function for the shapes package
	 * @param args
	 */
	public static void main(String args[]) {
		System.out.println("According to Oracle's definition of polymorphism:\n"
				+ "\"Subclasses of a class can define their own unique behaviors "
				+ "and yet share some of the same functionality of the parent class.\"\n");
		
		
		System.out.println("In this class, I will demonstrate polymorphism "
				+ "through the use of a Shape interface");
		
		System.out.println("The shape interface is used to create three types of shapes.\n"
				+ "The three types are a Circle, Rectangle, and Square.\n");
		
		System.out.println("All three shapes have shared methods from the Shape interface, "
				+ "along with unique methods for their class.\n");
		System.out.println("The shared/implemented methods from Shape are:\n"
				+ "getPerimeter()\n"
				+ "getArea()\n"
				+ "getType()\n"
				+ "toString()\n"
				+ "compareArea(Shape rhs)\n"
				+ "comparePerimeter(Shape rhs)\n");
	
		System.out.println("Each shape uses and implements the functions listed above.\n"
				+ "However, the only ones that are best suited to prove polymorphism are "
				+ "compareArea and comparePerimeter.\n");
		
		System.out.println("CompareArea and comparePerimeter enable "
				+ "the comparison of two shape objects without having to provide both as parameters.\n"
				+ "Thus, compareArea or comparePerimeter can be called from "
				+ "a shape and compare itself to another.\n\n"
				+ "Example: Square1.compareArea(Circle1); would be a valid command "
				+ "even though they are two different shapes.\n");
		
		System.out.println("We will now create 3 shape objects, one of each type, and print them using "
				+ "the implemented toString method.\n");
		
		//CREATE 3 SHAPE OBJECTS: CIRCLE, SQUARE, AND RECTANGLE
		
		Shape Circle1 = new Circle(2); //Create a circle with radius of 2
		Shape Rectangle1 = new Rectangle(2, 2); //Create a rectangle with length 2 and height 2
		Shape Square1 = new Square(2); //Create a square with side length of 2
		
		//NOW PRINT THE SHAPE OBJECTS USING IMPLEMENTED TOSTRING METHODS
		
		System.out.println(Circle1+"\n\n"+Rectangle1+"\n\n"+Square1+"\n");
		
		System.out.println("Now that we have printed the values and types of "
				+ "our individual shape objects, we will now compare them.");
		System.out.println("The first method we will use is compareArea, "
				+ "and we will be comparing the Circle's area to the Rectangle's area.\n");
		
		System.out.println("The code called is \'Circle1.compareArea(Rectangle1);\'\n");
		
		
		Circle1.compareArea(Rectangle1); //COMPARE AREA OF CIRCLE TO AREA OF RECTANGLE
		//NOTE: Results are automatically printed from the compareArea method.
		
		System.out.println("\nAs demonstrated above, 2 different shapes can be compared "
				+ "using the compareArea method provided by the shape interface.\n\n"
				+ "It should be pointed out that most interface methods are public and abstract, "
				+ "meaning they cannot be implemented in the interface.\n"
				+ "This means that the classes implementing the interface "
				+ "must provide their own implementations of any methods.\n");
		
		System.out.println("In the example above, Circle's compareArea() implementation was used "
				+ "since it was the one who called the function.\n"
				+ "Let's try the same comparison, but using Rectangle's compareArea instead.\n");
		
		System.out.println("The code called is \'Rectangle1.compareArea(Circle1);\'\n");
		
		Rectangle1.compareArea(Circle1); //COMPARE AREA OF RECTANGLE TO AREA OF CIRCLE
		//NOTE: Results automatically printed from compareArea method.
		
		System.out.println("\nThe result from the call was the same, the only thing that changed was "
				+ "the class implementation used.\n\n"
				+ "Rather than using Circle's implementation of CompareArea, we used Rectangle's.\n"
				+ "The only difference between the two implementations is "
				+ "the order in which comparisons are made and the printing of areas.\n");
		
		//INTERFACE METHOD & IMPLEMENTATION EXPLANAINED ABOVE
		
		System.out.println("Now that we have successfully demonstrated interface function implementation, "
				+ "let's go ahead and compare Square to Rectangle and Square to Circle.\n"
				+ "The first comparison will be Square to Rectangle.\n");
		
		System.out.println("The code called is \'Square1.compareArea(Rectangle1);\'\n");
		
		Square1.compareArea(Rectangle1); //NOW COMPARE AREA OF SQUARE TO AREA OF RECTANGLE
		
		System.out.println("\nNow we will compare Square to Circle.\n");
		
		System.out.println("The code called is \'Square1.compareArea(Circle1);\'\n");
		
		Square1.compareArea(Circle1); //COMPARE AREA OF SQUARE TO AREA OF CIRCLE
		
		System.out.println("\nOther matches could be made to test the Area comparisons between each object,"
				+ "but an ommission will be made for the sake of time.\n"
				+ "If you wish to test every possible combination for compareArea, "
				+ "just un-comment the code from line 122-130 (in eclipse).\n");
		
		//BEGIN 2 FINAL TESTS OF COMPAREAREA() METHOD
		//THIS WAS OMITTED FROM NORMAL PROGRAM FOR TIME'S SAKE
		/*
		System.out.println("The code called is \'Circle1.compareArea(Square1);\'\n");
		
		Circle1.compareArea(Square1); //COMPARE AREA OF CIRCLE TO AREA OF SQUARE
		
		System.out.println("\nThe code called is \'Rectangle1.compareArea(Square1);\'\n");
		
		Rectangle1.compareArea(Square1); //COMPARE AREA OF RECTANGLE TO AREA OF SQUARE
		 */
		
		System.out.println("\nNow that we have covered and used the compareArea method defined in Shape, "
				+ "we will now use the comparePerimeter method.\n");
		System.out.println("First, we will compare the perimeter of Circle and Rectangle.\n");
		
		System.out.println("The code called is \'Circle1.comparePerimeter(Rectangle1);\'\n");
		
		Circle1.comparePerimeter(Rectangle1);//COMPARE PERIMETER OF CIRCLE TO PERIMETER OF RECTANGLE
		//NOTE: Results automatically printed from comparePerimeter
		
		System.out.println("\nSince we just used Circle's implementation of comparePerimeter, "
				+ "we will use Rectangle's next.\n");
		
		System.out.println("The code called is\'Rectangle1.comparePerimeter(Circle1);\'\n");
		
		Rectangle1.comparePerimeter(Circle1);//COMPARE PERIMETER OF RECTANGLE TO PERIMETER OF CIRCLE
		
		System.out.println("\nJust like with the compareArea method,"
				+ "the only difference between them is the order of comparison "
				+ "and the printing of perimeter.\n");
		
		System.out.println("We will now compare perimeters using Square.\n"
				+ "The first comparison will be between Square and Rectangle.\n");
		
		System.out.println("The code called is \'Square1.comparePerimeter(Rectangle1);\'\n");
		
		Square1.comparePerimeter(Rectangle1); //COMPARE PERIMETER OF SQUARE TO PERIMETER OF RECTANGLE
		
		System.out.println("\nNow we will compare the perimeters of Square and Circle.\n");
		
		System.out.println("The code called is \'Square1.comparePerimeter(Circle1);\'\n");
		
		Square1.comparePerimeter(Circle1); //COMPARE PERIMETER OF SQUARE TO PERIMETER OF CIRCLE
		
		System.out.println("\nMore tests can be conducted to further prove the validity of the comparePerimeter method, "
				+ "but they will be omitted.\n"
				+ "If you wish to include these tests, you are encouraged to un-comment the code "
				+ "from line 172 to line 180 (in eclipse).\n");
		
		//BEGIN OMITTED TESTS
		//THESE MAY BE INCLUDED IF DESIRED, BUT ARE NOT NEEDED TO FURTHER DEMONSTRATE POLYMORPHISM
		/*
		System.out.println("The code called is \'Rectangle1.comparePerimeter(Square1);\'\n");
		
		Rectangle1.comparePerimeter(Square1); //COMPARE PERIMETER OF RECTANGLE TO PERIMETER OF SQUARE
		
		System.out.println("The code called is \'Circle1.comparePerimeter(Square1);\'\n");
		
		Circle1.comparePerimeter(Square1); //COMPARE PERIMETER OF CIRCLE TO PERIMETER OF SQUARE
		*/
		System.out.println("==========================SUMMARY==========================");
		System.out.println("In this package, we created a shape interface, "
				+ "we then used that interface to create 3 shapes: Rectangle, Square, and Circle.\n"
				+ "Then we used the compareArea and comparePerimeter methods "
				+ "declared in the shape interface to compare "
				+ "different shape objects.\n");
		System.out.println("The compareArea and comparePerimeter functions worked "
				+ "regardless of the shape invoking them, demonstrating Polymorphism from Shape.\n\n");
		

		System.out.println(">>>>>>Please SCROLL TO THE BEGINNING of the output in the console "
				+ "for a step by step demonstration.<<<<<<");
		System.out.println("NOTE:\tThe ShapeTester class only demonstrates through output, "
				+ "it does not contain relevant methods.\n"
				+ "\tThe other classes in the SHAPE package will show you the actual code.");

		//END DRIVER AND DEMONSTRATION
	}

}
