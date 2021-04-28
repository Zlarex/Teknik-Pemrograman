package task3_1;

// --> abstract class
public abstract class Sortable
{
	/**
	 * There is an abstract class named Sortable.
	 * abstract class Sortable{ 
	 *    public abstract int compare(Sortable b);
	 *    public static void shell_sort(Sortable[] a){ 
	 *    //Shell sort body
	 *  }
	 * }
	 * When Sortable extended to Employee class, the method compare will be implemented
	 */
	public abstract int compare(Sortable b);
	public static void shell_sort(Sortable[] a)
	{
		// shell sort body
		// source: https://www.geeksforgeeks.org/shellsort/
		int n = a.length;
		for (int gap = n/2; gap > 0; gap /= 2)
		{
			for (int i = gap; i < n; i++)
			{
				Employee temp = (Employee) a[i];
				int j;
				for (j = i; j >= gap && a[j - gap].compare(temp)> 0; j -= gap)
				{
					a[j] = a[j - gap];
				}
				a[j] = temp;
			}
		}
	}
}
