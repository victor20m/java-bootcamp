package ShoppingCart;

import java.util.ArrayList;

public class Database {
	/* Contains the list of all products */
	ArrayList<Product> productList;
	ArrayList<User> userDatabase;

	public Database() {
		userDatabase = new ArrayList<User>();
		productList = new ArrayList<Product>();
		productList.add(new Product("Android phone", "Technology", 100, 600));
		productList.add(new Product("Levono Laptop", "Technology", 60, 1000));
		productList.add(new Product("T-shirt", "Clothes", 100, 20));
	}
}
