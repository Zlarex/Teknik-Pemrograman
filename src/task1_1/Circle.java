package task1_1;
/**
 * The circle class models a circle with a radius and color
 */
public class Circle
{
	/**
	 * Modify class Circle, add :
	 * 1. variable color : string
	 * 2. Constructor Circle(radius : double, color : string)
	 * 3. Getter and setter for color
	 * You can reuse the Circle class above.
	 */
	// private instance variable, not accessible from outside this class
	private double radius;
	// 1.1 --> 1. variable color:string
	private String color;
	
	// Constructors
	/** Construct a Circle instance with default value for radius and color */
	public Circle() // 1st (default) constructor
	{
		radius = 1.0;
		color = "red";
	}
	/** Construct a Circle instance with the given radius and default color */
	public Circle(double radius) // 2nd constructor
	{
		this.radius = radius;
		color = "red";
	}
	/** Construct a Circle instance with the given radius and color */
	// --> 2. Constructor Circle(radius:double,color:string)
	public Circle(double radius, String color)
	{
		this.radius = radius;
		this.color = color;
	}
	// returns the radius
	public double getRadius() { return radius; }
	// returns the color
	// 1.1 --> 3. Getter for color
	public String getColor() { return color; }
	// sets the radius
	public void setRadius(double radius) { this.radius = radius; }
	// sets the color
	// 1.1 --> 3. Setter for color
	public void setColor(String color) { this.color = color; }
	// return the area of this Circle instance
	public double getArea()
	{
		return radius * radius * Math.PI;
	}
	public String toString()
	{
		return "Circle[radius="+ radius + ",color="+ color +"]";
	}
}
