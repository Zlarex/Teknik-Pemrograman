/**
 * @author Ihsan Fauzan Hanif
 */

package genericExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VendingMachine<T extends Consumable> implements Calculate<T>
{
	private List<T> stock;
	public VendingMachine()
	{
		stock = new ArrayList<T>();
	}
	public List<T> getStock() { return stock; }
	void add(T t)
	{
		stock.add(t);
	}
	public T getAt(int index)
	{
		Iterator<T> i = stock.iterator();
		int idX = 0;
		T retVal = null;
		while (i.hasNext())
		{
			T t = i.next();
			if (index == idX) retVal = t;
			idX++;
		}
		return retVal;
	}
	
	@Override
	public void count() {
		Iterator<T> ptr = stock.iterator();
		int totalStock = 0;
		int hargaAkhir = 0;
		
		while (ptr.hasNext())
		{
			T t = ptr.next();
			totalStock++;
			hargaAkhir += t.getPrice();
		}
		System.out.println("Jumlah stok pada vending machine: " + totalStock + " buah");
		System.out.println("Apabila semua terjual, maka jumlah uang yang didapat: Rp. " + hargaAkhir);
	}

}
