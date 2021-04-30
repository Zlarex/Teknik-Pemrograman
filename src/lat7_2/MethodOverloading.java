package lat7_2;

public class MethodOverloading
{
	public static void main(String args[])
	{
		Overload obj = new Overload();
		double result;
		obj.demo(10);
		obj.demo(10, 20);
		result = obj.demo(5.5);
		System.out.println("O/P : " + result);
	}
}
