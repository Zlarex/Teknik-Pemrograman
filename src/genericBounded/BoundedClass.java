package genericBounded;

public class BoundedClass
{
	public static void main(String[] args)
	{
		// creating object of sub class C and passing it
		// to Bound as a type parameter.
		Bound<C> bec = new Bound<C>(new C());
		bec.doRunTest();
		
		// creating object of sub class B and passing it
		// to Bound as a type parameter.
		Bound<B> beb = new Bound<B>(new B());
		beb.doRunTest();
		
		// similarly passing super class A
		Bound<A> bea = new Bound<A>(new A());
		bea.doRunTest();
	}
}
