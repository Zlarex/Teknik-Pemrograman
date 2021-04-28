package task2_1;

public class Circle extends Shape
{
	/**
	 * The Circle class contains:
	 * • An instance variable radius (double).
	 * • Three constructors as shown. The no-arg constructor initializes the radius to 1.0.
	 * • Getter and setter for the instance variable radius.
	 * • Methods getArea() and getPerimeter().
	 * • Override the toString() method inherited, to return "A Circle with radius=xxx, which is 
	 * a subclass of yyy", where yyy is the output of the toString() method from the superclass
	 */
	 // --> instance variable
	private double radius;
	// --> no  constructor
	public Circle()
	{
		super();
		radius = 1.0;
	}
	// --> one arg constructor
	public Circle(double radius)
	{
		super();
		this.radius = radius;
	}
	// --> 3 args constructor
	public Circle(double radius, String color, boolean filled) 
	{
		super(color, filled);
		this.radius = radius;
	}
	// --> accessor & mutator
	public double getRadius() { return radius; }
	public void setRadius(double radius) { this.radius = radius; }
	// --> method getArea
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
	// --> method getPerimeter
	public double getPerimeter()
	{
		return 2 * Math.PI * radius;
	}
	// --> method toString
	@Override
	public String toString()
	{
		return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
	}
}
