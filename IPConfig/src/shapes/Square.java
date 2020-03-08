package shapes;

/**This is the square class, 
 * it will be one of the three shapes used to demonstrate polymorphism.
 * <p>
 * It will directly implement the shape interface and will define the methods associated with it.
 * <p>
 * A square is created using 1 parameter, Length.
 * @author Dalton
 *
 */
public class Square implements Shape{
	//BEGIN VARIABLE DECLARATION
	/**
	* Constant String representation of the type of shape, i.e. circle, square, or rectangle
	*/
	final String type = ("Square"); //Instantiate type as Square, to allow for identification
	
	/**
	* Double representation of the perimeter of the Square, calculated within the constructor.
	*/
	private double perimeter;
	
	/**
	* Double representation of the area of the Square, calculated within the constructor.
	*/
	private double area;
	
	/**
	 * Integer representation of the side length of the square
	 */
	private int length;
	
	//END VARIABLE DECLARATION
	
	/**
	 * The non-default constructor for a Square object.
	 * <p>
	 * It takes one parameter, length.
	 * <p>
	 * NOTE: This constructor initializes area and perimeter using the given length
	 * @param l Parameter for the (int) length of the square 
	 */
	public Square(int l) {
		length = l; //Initialize length
		
		perimeter = (4*l); //Calculate perimeter using 4*length formula
		area = (l*l); //Calculate area using length * length formula
	}
	
	//BEGIN FUNCTION AREA
	
	/**
	 * Retrieves the length for this square.
	 * <p>
	 * NOTE: Method not used because it doesn't demonstrate polymorphism
	 * @return Integer representation of the square's length
	 */
	public int getLength() {
		return length;
	}
	
	/**
	 * Sets length of square to the value specified in the parameter.
	 * <p>
	 * This method also recalculates area and perimeter.
	 * <p>
	 * NOTE: Method not used because it doesn't demonstrate polymorphism
	 * @param l New (int) length of the square
	 */
	public void setLength(int l) {
		length = l; //Set length to the new parameter
		
		perimeter = (4*length); //Recalculate perimeter using 4*length formula
		area = (length*length); //Recalculate area using length * length formula
	}
	
	//OVERRIDDEN FUNCTIONS BELOW
	
	/**
	 * This overridden function retrieves the perimeter of this shape.
	 * <p>
	 * This function was specified by the Shape interface.
	 */
	@Override
	public double getPerimeter() {
		return perimeter;
	}
	
	/**
	 * This overridden function retrieves the area of this shape.
	 *<p>
	 * This function was specified by the Shape interface.
	 */
	@Override
	public double getArea() {
		return area;
	}
	
	/**
	 * This overridden function retrieves type of shape this object is, i.e. "Square" for square.
	 * <p>
	 * This function was specified by the Shape interface.
	 */
	@Override
	public String getType() {
		return type;
	}
	
	/**
	 * Overridden toString() function. 
	 * It allows square objects to be printed directly to the console.
	 * <p>
	 * This function was specified in the Shape interface
	 */
	@Override
	public String toString() {
		return ("Square:\n"
				+ "Length = "+ this.length
				+ "\nPerimeter = "+ this.perimeter +"\tArea = "+ this.area);
	}
	
	//BEGIN COMPARISON METHODS
	//These methods will enable comparison between circles, squares, and rectangles
	//They will demonstrate polymorphism through use of an interface
		
	/**
	 * Method compares the areas of two shape objects, 
	 * printing the greater area.
	 * <p>
	 * This method will be equivalent in all shape types
	 */
	public void compareArea(Shape rhs)
	{
		System.out.println(this.getType()+ " Area = "+this.getArea()+ "\t| "
				+ rhs.getType()+ " Area = "+rhs.getArea());
		System.out.println("Determining shape with greater area...");
			
		//Determine greater area using if-else statements.
		if(this.getArea()>rhs.getArea()) { //If this shape's area is greater than RHS, print below
			System.out.println("The "+this.getType()+" has the larger area.");
		}
		else if(this.getArea()==rhs.getArea()) { //If this shape's area equals RHS, print below
			System.out.println(this.getType()+"'s area is equal to "+ rhs.getType()+"'s.");
		}
		else { //RHS's area is greater than LHS(this), print below
			System.out.println("The "+rhs.getType()+" has the larger area.");
		}
	}
			
			
	/**
	 * Method compares the perimeters of two shape objects, 
	 * printing the greater perimeter.
	 * <p>
	 * This method will be equivalent in all shape types
	 */
	public void comparePerimeter(Shape rhs)
	{
		System.out.println(this.getType()+ " Perimeter = "+this.getPerimeter()+ "\t| "
				+ rhs.getType()+ " Perimeter = "+rhs.getPerimeter());
		System.out.println("Determining shape with greater perimeter...");
				
		//Determine greater perimeter using if-else statements.
		if(this.getPerimeter()>rhs.getPerimeter()) { //If this shape's perimeter is greater than RHS, print below
			System.out.println("The "+this.getType()+" has the larger perimeter.");
		}
		else if(this.getPerimeter()==rhs.getPerimeter()) { //If this shape's perimeter equals RHS, print below
			System.out.println(this.getType()+"'s perimeter is equal to "+ rhs.getType()+"'s.");
		}
		else { //RHS's perimeter is greater than LHS(this), print below
			System.out.println("The "+rhs.getType()+" has the larger perimeter.");
		}
	}		
	//END COMPARISON METHODS
		
	//END FUNCTION AREA

}
