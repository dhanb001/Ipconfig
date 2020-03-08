package shapes;

/**This is the rectangle class, 
 * it will be one of the three shapes used to demonstrate polymorphism.
 * <p>
 * It will directly implement the shape interface and will define the methods associated with it.
 * <p>
 * A rectangle is created using 2 parameters, Length and Height.
 * @author Dalton
 *
 */
class Rectangle implements Shape {
	//BEGIN VARIABLE DECLARATION
	/**
	* Constant String representation of the type of shape, i.e. circle, square, or rectangle
	*/
	final String type = ("Rectangle"); //Instantiate type as Rectangle, to allow for identification
	
	/**
	* Double representation of the perimeter of the Rectangle, calculated within the constructor.
	*/
	private double perimeter;
	
	/**
	* Double representation of the area of the Rectangle, calculated within the constructor.
	*/
	private double area;
	
	/**
	 * Integer representation of the width of the rectangle
	 */
	private int length;
	
	/**
	 * Integer representation of the height of the rectangle
	 */
	private int height;
	//END VARIABLE DECLARATION 
	
	/**
	 * The non-default constructor for a Rectangle object.
	 * <p>
	 * It takes two parameters, length and height.
	 * <p>
	 * NOTE: This constructor initializes area and perimeter using the given length and height.
	 * @param l Parameter for the (int) length of the rectangle 
	 * @param h Parameter for the (int) height of the rectangle 
	 */
	public Rectangle(int l, int h) {
		length = l; //Initialize length
		height = h; //Initialize height
		
		perimeter = ((2*l) + (2*h)); //Calculate perimeter using 2*length + 2*height formula
		area = (l*h); //Calculate area using length * height formula
	}
	
	//BEGIN FUNCTION AREA
	
	/**
	 * Retrieves the length for this rectangle.
	 * <p>
	 * NOTE: Method not used because it doesn't demonstrate polymorphism
	 * @return Integer representation of the rectangle's length
	 */
	public int getLength() {
		return length;
	}
	
	/**
	 * Retrieves the height for this rectangle.
	 * <p>
	 * NOTE: Method not used because it doesn't demonstrate polymorphism
	 * @return Integer representation of rectangle's height
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * Sets length of rectangle to the value specified in the parameter.
	 * <p>
	 * This method also recalculates area and perimeter.
	 * <p>
	 * NOTE: Method not used because it doesn't demonstrate polymorphism
	 * @param l New (int) length of the rectangle
	 */
	public void setLength(int l) {
		length = l; //Set length to the new parameter
		
		area = (length * height); //Recalculate area
		perimeter = ((2*length) + (2*height)); //Recalculate perimeter
	}
	
	/**
	 * Sets height of rectangle to the value specified in the parameter.
	 * <p>
	 * This method also recalculates area and perimeter.
	 * <p>
	 * NOTE: Method not used because it doesn't demonstrate polymorphism
	 * @param h New (int) height of the rectangle 
	 */
	public void setheight(int h) {
		height = h; //Set height to the new parameter
		
		area = (length * height); //Recalculate area
		perimeter = ((2*length) + (2*height)); //Recalculate perimeter
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
	 * This overridden function retrieves type of shape this object is, i.e. "Rectangle" for rectangle.
	 * <p>
	 * This function was specified by the Shape interface.
	 */
	@Override
	public String getType() {
		return type;
	}
	
	/**
	 * Overridden toString() function. 
	 * It allows rectangle objects to be printed directly to the console.
	 * <p>
	 * This function was specified in the Shape interface
	 */
	@Override
	public String toString() {
		return ("Rectangle:\n"
				+ "Length = "+ this.length+"\tHeight = "+ this.height
				+ "\nPerimeter = "+ this.perimeter+"\tArea = "+ this.area);
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
