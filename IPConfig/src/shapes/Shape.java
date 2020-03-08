package shapes;

/**This is the shape interface, it is the basis for our other square and triangle class.
 * <p>
 * It is not declared as public to ensure that it can only be accessed by package members.
 * <p>
 * It includes several methods that will be used in the shapes that implement it.
 * @author Dalton
 *
 */
interface Shape {
	
	/**
	 * Constant representation of Pi for use in circle class
	 * <p>
	 * pi = 3.1415
	 */
	final double pi = 3.1415; 
	
	/**This function is responsible for retrieving the perimeter of the given shape.
	 * <p>
	 * This function will return the double representation of the perimeter.
	 */
	double getPerimeter();
	
	/**This function is responsible for retrieving the area of the given shape.
	 * <p>
	 * This function will return the double representation of the area.
	 */
	double getArea();
	
	/**
	 * This function returns the type of shape the particular object is.
	 * <p>
	 * Ex: "Circle" will be returned for the Circle class, "Square" for Square, etc.
	 * @return A string representation of the type of shape the object is
	 */
	String getType();
	

	
	/**
	 * Overloads default toString method, allowing shape to be printed directly
	 * @return String representation of a shape
	 */
	String toString();
	
	
	/*
	 * ============================================================================
	 * COMPARISON METHODS: These are responsible for showing POLYMORPHISM
	 * These methods will allow two DIFFERENT shapes to be compared to one another.
	 * compareArea and comparePerimeter will accomplish this goal.
	 * ============================================================================
	 */
	
	/**
	 * Compares two shapes, outputting the higher area.
	 * @param rhs Shape object being compared to.
	 */
	void compareArea(Shape rhs);
	
	/**
	 * Compares two shapes, outputting the higher perimeter.
	 * @param rhs Shape object being compared to.
	 */
	void comparePerimeter(Shape rhs);

	/*
	 * ============================================================================
	 * END COMPARISON METHODS
	 * Again, these two methods will be responsible for showing Polymorphism.
	 *============================================================================
	 */
	
}
