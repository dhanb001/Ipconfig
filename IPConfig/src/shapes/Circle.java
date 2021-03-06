package shapes;

/**This is the circle class, 
 * it will be one of the three shapes used to demonstrate polymorphism.
 * <p>
 * It will directly implement the shape interface and will define the methods associated with it.
 * <p>
 * A circle is created using 1 parameter, Radius.
 * @author Dalton
 *
 */
class Circle implements Shape{
	
	/**
	 * Constant String representation of the type of shape, i.e. circle, square, or rectangle
	 */
	 final String type = ("Circle"); //Instantiate type as circle, to allow for identification
	
	/**
	 * The integer representation of the circle's radius.
	 * <p>
	 * This variable will be instantiated by the constructor.
	 */
	int radius;
	
	/**
	 * Double representation of the perimeter of the Circle, calculated within the constructor.
	 */
	private double perimeter;
	
	/**
	 * Double representation of the area of the Circle, calculated within the constructor.
	 */
	private double area;
	
	/**
	 * The primary constructor for the circle class. 
	 *The parameter, r, will become the radius of the declared circle.
	 *<p>
	 *This constructor also initializes area and perimeter using the radius.
	 * 
	 * @param r Is the parameter for the circle's radius. 
	 * It will be used to instantiate the circle's radius.
	 */
	public Circle(int r) {
		radius = r; //Set circle's radius equal to the given parameter
		
		area = pi * (r * r); //Initialize area using the formula pi * r^2
		perimeter = 2 * pi * r; //Initialize perimeter using the formula, 2*pi*r
		///END CONSTRUCTOR
	}
	
	/**
	 * Retrieves the radius for this circle.
	 * <p>
	 * NOTE: Method not used because it doesn't demonstrate polymorphism
	 * @return Integer representation of the circle's radius
	 */
	public int getRadius() {
		return radius;
	}
	
	/**
	 * Sets radius of circle to the value specified in the parameter.
	 * <p>
	 * This method also recalculates area and perimeter.
	 * <p>
	 * NOTE: Method not used because it doesn't demonstrate polymorphism
	 * @param r The value that will become the circle's radius
	 */
	public void setRadius(int r) {
		area = pi * (r * r); //Calculate area using the formula pi * r^2
		perimeter = 2 * pi * r; //Calculate perimeter using the formula, 2*pi*r
		radius = r;
	}
	
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
	 * This overridden function retrieves type of shape this object is, 
	 * i.e. "Circle" for circle.
	 * <p>
	 * This function was specified by the Shape interface.
	 */
	@Override
	public String getType() {
		return type;
	}
	
	/**
	 * Overridden toString() function. 
	 * It allows circle objects to be printed directly to the console.
	 * <p>
	 * This function was specified in the Shape interface
	 */
	@Override
	public String toString() {
		return ("Circle:\n"
				+ "Radius = "+ this.radius+"\nPerimeter = "+ this.perimeter
				+"\tArea = "+ this.area);
	}
	
	
	 //Comparison methods below
	 //These methods will enable comparison between circles, squares, and rectangles
	 //They will demonstrate polymorphism through use of an interface
	
	/**
	 * Method compares the areas of two shape objects, printing the greater area.
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
	 * Method compares the perimeters of two shape objects, printing the greater perimeter.
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
}
