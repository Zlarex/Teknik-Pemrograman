package task1_3;
/**
 * The circle class models a circle with a radius and color
 */
public class Circle
{
	// private instance variable, not accessible from outside this class
	private double radius;
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
	public Circle(double radius, String color) // 3rd constructor
	{
		this.radius = radius;
		this.color = color;
	}
	// returns the radius
	public double getRadius() { return radius; }
	// returns the color
	public String getColor() { return color; }
	// sets the radius
	public void setRadius(double radius) { this.radius = radius; }
	// sets the color
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
