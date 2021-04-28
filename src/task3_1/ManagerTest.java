package task3_1;

public class ManagerTest
{
	public static void main(String[] args)
	{
		Employee[] staff = new Employee[3];
		// changed to see the sorting effect
		staff[0] = new Employee("Antonio Rossi", 12_000_000, 1, 10, 1989);
		staff[1] = new Manager("Maria Bianchi", 2_500_000, 1, 12, 1991);
		staff[2] = new Employee("Isabel Vidal", 3_000_000, 1, 11, 1993);
		int i;
		for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
		for (i = 0; i < 3; i++) staff[i].print();
		Sortable.shell_sort(staff);
		System.out.println();
		for (i = 0; i < 3; i++) staff[i].print();
	}
}
