package shapes;

/**This is the shape interface, it is the basis for our other square and triangle class.
 * <p>
 * It is not declared as public to ensure that it can only be accessed by package members.
 * <p>
 * It includes several methods, such as calculatePerimeter(), calculateArea(), and toString()
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
	
	/**This function is responsible for retrieving the perimeter of the given shape
	 * <p>
	 * This function will return the double representation of the perimeter
	 */
	double getPerimeter();
	
	/**This function is responsible for retrieving the area of the given shape
	 * <p>
	 * This function will return the double representation of the area
	 */
	double getArea();

	/**This function will overload the default toString method, allowing shape data to be printed directly to console
	 * 
	 * @return String representation of a shape
	 */
	String toString();
}
