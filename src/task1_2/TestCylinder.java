package task1_2;

public class TestCylinder
{
	public static void main(String[] args)
	{
		// declare and allocate a new instance of the cylinder
		// with default color, radius, and height
		Cylinder c1 = new Cylinder();
		System.out.println("Cylinder:"
				+ c1.toString()
				+ " height=" + c1.getHeight()
				+ " base area=" + c1.getArea()
				+ " volume=" + c1.getVolume());
		
		// declare and allocate a new instance of the cylinder
		// specifying height, with default color and radius
		Cylinder c2 = new Cylinder(10.0);
		System.out.println("Cylinder:"
				+ c2.toString()
				+ " height=" + c2.getHeight()
				+ " base area=" + c2.getArea()
				+ " volume=" + c2.getVolume());
		
		// declare and allocate a new instance of the cylinder
		// specifying radius and height, with default color
		Cylinder c3 = new Cylinder(2.0, 10.0);
		System.out.println("Cylinder:"
				+ c3.toString()
				+ " height=" + c3.getHeight()
				+ " base area=" + c3.getArea()
				+ " volume=" + c3.getVolume());
		
		// declare and allocate a new instance of the cylinder
		// specifying radius and height, with default color
		Cylinder c4 = new Cylinder(2.0, 10.0);
		c4.setColor("black");
		System.out.println("Cylinder:"
				+ c4.toString()
				+ " height=" + c4.getHeight()
				+ " base area=" + c4.getArea()
				+ " volume=" + c4.getVolume());
	}

}
