/**
 * @author Ihsan Fauzan Hanif
 * 
 * Program.java
 * Titik entri dari Program. Program bertujuan untuk mengambil data yang
 * terdapat pada file product.json, menyimpannya pada collection, kemudian
 * menampilkannya pada terminal.
 */

package javacollection;

// Local library
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

// External library
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

public class Program
{
	public static void main(String[] args)
	{
		// instansiasi object, products untuk menyimpan kumpulan Product,
		// dan gson untuk menghandle JSON
		List<Product> products = new ArrayList<Product>();
		Gson gson = new Gson();
		
		// coba untuk mengambil file
		try
		{
			// data produk pada file product.json merupakan JSON array, maka perlu
			// membuat tipe baru untuk mengambil datanya dengan bentuk ArrayList
			//
			// referensi: https://howtodoinjava.com/gson/gson-parse-json-array/
			Type productType = new TypeToken<ArrayList<Product>>(){}.getType();
			products = gson.fromJson(new FileReader("D:\\Kuliah\\Program\\Teknik Pemrograman\\product.json"), productType);
		}
		// tangkap error dengan jenis dibawah apabila dilemparkan oleh program
		catch (JsonSyntaxException | JsonIOException | FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		// format string yang ditampilkan pada terminal
		// - 		--> rata kiri, jika dihilangkan maka rata kanan
		// <angka>s --> padding 20 karakter
		String format = "|%-20s|%-10s|%-10s|%-15s|%-25s|%-15s|%-10s|\n";
		System.out.format(format, "productName", "quantity", "weight", "destination", "servicePackage", "service Value", "Total");
		
		// loop setiap data yang terdapat pada products
		for (Product temp : products)
		{
			System.out.format(format,
				temp.getProductName(),
				temp.getQuantity(),
				temp.getWeight(),
				temp.getCity().getDestination(),
				temp.getServicePackage().getService(),
				temp.getServicePackage().getValue(),
				// harga total = (harga barang * kuantitas) + ongkos kirim
				(temp.getPriceItem() * temp.getQuantity()) + temp.getServicePackage().getValue()
			);
		}
	}
}
