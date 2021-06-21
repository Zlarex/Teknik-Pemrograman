/**
 * @author Ihsan Fauzan Hanif
 */

package genericExample;

import java.util.List;

public class Main
{
	public static <T extends Consumable> void main(String[] args)
	{
		VendingMachine<Consumable> vend = new VendingMachine<>();
		Food f1 = new Food("Nasi Goreng", 10000, true);
		Food f2 = new Food("Mie Goreng", 12500, false);
		Food f3 = new Food("Nasi Padang", 15000, false);
		Drink d1 = new Drink("Boba Vanila", 8000, false);
		Drink d2 = new Drink("Max Coffee", 10000, true);
		Drink d3 = new Drink("Teh Manis", 5000, true);
		
		vend.add(f1);
		vend.add(f2);
		vend.add(f3);
		vend.add(d1);
		vend.add(d2);
		vend.add(d3);
		
		Consumable t = vend.getAt(0);
		System.out.println("Menampilkan nama stock pertama pada vend: " + t.getName());
		System.out.println("==========================================================================");
		System.out.println("Menampilkan kalkulasi dari vend: ");
		vend.count();
		System.out.println("==========================================================================");
		System.out.println("Menampilkan isi dari vend: ");
		printVendingMachine(vend.getStock());
		System.out.println("==========================================================================");
	}
	
	public static void printVendingMachine(List<?> data)
	{
		for (Object o : data)
		{
			System.out.println(o);
		}
	}
}
