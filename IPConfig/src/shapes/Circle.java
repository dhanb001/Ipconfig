package shapes;

/**This is the circle class, 
 * it will be one of the two shapes used to demonstrate polymorphism.
 * <p>
 * It will directly implement the shape interface and will define the methods associated with it.
 * <p>
 * This class will also have its own methods associated with it.
 * @author Dalton
 *
 */
class Circle implements Shape{
	
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
	 * @param r Is the parameter for the circle's radius. It will be used to instantiate the circle's radius.
	 */
	public Circle(int r) {
		radius = r; ///Set circle's radius equal to the given parameter
		
		area = pi * (r * r); //Initialize area using the formula pi * r^2
		perimeter = 2 * pi * r; //Initialize perimeter using the formula, 2*pi*r
	
		///END CONSTRUCTOR
	}
	
	
	/**
	 * This overridden function will retrieve the private perimeter variable from the circle.
	 * <p>
	 * This function was specified by the Shape interface.
	 */
	@Override
	public double getPerimeter() {
		return perimeter;
	}
	
	
	/**
	 * This overridden function will retrieve the private area variable from the circle.
	 *<p>
	 * This function was specified by the Shape interface.
	 */
	@Override
	public double getArea() {
		return area;
	}
	
	/**
	 * This function will retrieve the radius of the specified circle.
	 * @return Integer representation of the radius of the circle
	 */
	public int getRadius() {
		return radius;
	}
	
	/**
	 * Sets radius of circle to the value specified in the parameter.
	 * <p>
	 * This method also recalculates area and perimeter.
	 * @param r The value that will become the radius of the circle.
	 */
	public void setRadius(int r) {
		area = pi * (r * r); //Calculate area using the formula pi * r^2
		perimeter = 2 * pi * r; //Calculate perimeter using the formula, 2*pi*r
		radius = r;
	}
	
	/**
	 * Overridden toString() function. It 
	 * allows circle objects to be printed directly to the console.
	 * <p>
	 * This function was specified in the Shape interface
	 */
	public String toString() {
		return ("Circle:\n"
				+ "Radius = "+ this.radius+"\tPerimeter = "+ this.perimeter
				+"\tArea = "+ this.area);
	}



}
