package task2_1;

public class TestShape
{
	public static void main(String[] args)
	{
		Shape shape = new Shape();
		Circle circle = new Circle(7);
		Rectangle rectangle = new Rectangle(4, 10);
		Square square = new Square(5);
		
		System.out.println(shape.toString());
		System.out.println(circle.toString() + ", area=" + circle.getArea() + ", perimeter=" + circle.getPerimeter());
		System.out.println(rectangle.toString() + ", area=" + rectangle.getArea() + ", perimeter=" + rectangle.getPerimeter());
		System.out.println(square.toString() + ", area=" + square.getArea() + ", perimeter=" + square.getPerimeter());
	}
}
