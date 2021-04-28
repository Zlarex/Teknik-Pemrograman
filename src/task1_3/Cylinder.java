package task1_3;

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
	
	@Override
	public double getArea()
	{
		return (2 * Math.PI * super.getRadius() * height) + (2 * super.getArea());
	}
	// 1.3 --> Provide toString method (override)
	@Override
	public String toString()
	{
		return "Cylinder: subclass of " + super.toString() + " height=" + height;
	}
}
