package genericsInterface;

public interface MinMax<T extends Comparable<T>>
{
	T max();
}
