/**
 * @author Ihsan Fauzan Hanif
 */

package genericExample;

public class Food extends Consumable
{
	private boolean isFree;
	public Food(String name, int price, boolean isFree)
	{
		super.setName(name);
		super.setPrice(price);
		this.isFree = isFree;
	}
	@Override
	public String toString()
	{
		return super.getName() + " adalah makanan " + (isFree? "gratis" : "yang dijual") + " seharga Rp. " + super.getPrice();
	}
}
