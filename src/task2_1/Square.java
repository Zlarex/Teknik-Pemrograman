package task2_1;

public class Square extends Rectangle
{
	/**
	 * Write a class called Square, as a subclass of Rectangle. Convince yourself that Square can be 
	 * modeled as a subclass of Rectangle. Square has no instance variable, but inherits the instance 
	 * variables width and length from its superclass Rectangle
	 * • Provide the appropriate constructors (as shown in the class diagram)
	 * • Override the toString() method to return "A Square with side=xxx, which is a subclass 
	 * of yyy", where yyy is the output of the toString() method from the superclass.
	 * • Do you need to override the getArea() and getPerimeter()? Try them out.
	 * • Override the setLength() and setWidth() to change both the width and length, so as to 
	 * maintain the square geometry.
	 */
	// --> constructor
	public Square()
	{
		super();
	}
	// --> one arg constructor
	public Square(double side)
	{
		super(side, side);
	}
	// --> method toString
	@Override
	public String toString()
	{
		return "A Square with side=" + super.getWidth() + ", which is a subclass of " + super.toString();
	}
	// --> method getArea
	// technically this method isn't necessary needed
	// because the parent method returns the same value
	@Override
	public double getArea()
	{
		return super.getWidth() * super.getLength();
	}
	// --> method getPerimeter
	// technically this method isn't necessary needed
	// because the parent method returns the same value
	@Override
	public double getPerimeter()
	{
		return 4 * super.getWidth();
	}
	// --> method setSide
	public void setSide(double side)
	{
		super.setLength(side);
		super.setWidth(side);
	}
	// --> method setLength
	@Override
	public void setLength(double length)
	{
		setSide(length);
	}
	// --> method setWidth
	@Override
	public void setWidth(double width)
	{
		setSide(width);
	}
}
