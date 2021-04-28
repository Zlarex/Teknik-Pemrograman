package task2_1;

public class Rectangle extends Shape
{
	/**
	 * The Rectangle class contains:
	 * • Two instance variables width (double) and length (double).
	 * • Three constructors as shown. The no-arg constructor initializes the width and length to 1.0.
	 * • Getter and setter for all the instance variables.
	 * • Methods getArea() and getPerimeter().
	 * • Override the toString() method inherited, to return "A Rectangle with width=xxx and 
	 * length=zzz, which is a subclass of yyy", where yyy is the output of 
	 * the toString() method from the superclass.
	 */
	// --> instance variables
	private double width;
	private double length;
	 // --> no args constructor
	public Rectangle() 
	{
		super();
		this.width = 1.0;
		this.length = 1.0;
	}
	 // --> two args constructor
	public Rectangle(double width, double length)
	{
		super();
		this.width = width;
		this.length = length;
	}
	// --> 4 args constructor
	public Rectangle(double width, double length, String color, boolean filled)
	{
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	// --> accessor & mutator
	public double getWidth() { return width; }
	public double getLength() { return length; }
	public void setWidth(double width) { this.width = width; }
	public void setLength(double length) { this.length = length; }
	// --> method getArea
	public double getArea()
	{
		return width * length;
	}
	// --> method getPerimeter
	public double getPerimeter()
	{
		 return 2 * (width + length);
	}
	// --> method toString
	@Override
	public String toString()
	{
		return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
	}
}
