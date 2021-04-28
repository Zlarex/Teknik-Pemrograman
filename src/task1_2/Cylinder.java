package task1_2;

public class Cylinder extends Circle
{
	// private variable
	private double height;
	public Cylinder()
	{
		super();
		height = 1.0;
	}
	public Cylinder(double height)
	{
		super();
		this.height = height;
	}
	public Cylinder(double radius, double height)
	{
		super(radius);
		this.height = height;
	}
	public double getHeight() { return height; }
	public double getVolume()
	{
		return getArea() * height;
	}
	
	// 1.2 --> 1. Overriding the getArea method
	@Override
	public double getArea()
	{
		// return = (2 * PHI x radius x height) + (2 * base area)
		return (2 * Math.PI * super.getRadius() * height) + (2 * super.getArea());
	}
}
