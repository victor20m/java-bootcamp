package ShoppingCart;

import java.util.ArrayList;

public class ShoppingCartImp implements ShoppingCart {
	Database databaseConnection;
	ArrayList<Product> productsInCart;

	protected ShoppingCartImp() {
		databaseConnection = new Database();
		productsInCart = new ArrayList<Product>();
	}

	@Override
	public String putItems(Product product, int quantity) {
		productsInCart.add(product);
		product.setDesiredQuantity(quantity);

		return "Item(s) added to cart.";
	}

	@Override
	public String deleteItems(Product product, int quantity) {
		if (product.getDesiredQuantity() >= quantity) {
			product.setDesiredQuantity(product.getDesiredQuantity() - quantity);
			if (product.getDesiredQuantity() == 0) {
				productsInCart.remove(product);
			}
		}
		return "Item(s) deleted.";
	}

	@Override
	public String updateItems(Product product, int desiredQuantity) {
		if (!(product.getAvailableQuantity() < desiredQuantity)) {
			int index = productsInCart.indexOf(product);
			productsInCart.get(index).setDesiredQuantity(desiredQuantity);
		}
		return "Items modified.";
	}

	/*
	 * The method calculateTotalPrice() iterates through the product list and calculates to total price
	 * for total quantity of items
	 */
	
	@Override
	public int calculateTotalPrice() {
		int price = 0;
		for (Product product : productsInCart) {

			price += product.getPrice() * product.getDesiredQuantity();

		}
		return price;
	}

	public ArrayList<Product> getProductList() {
		return this.productsInCart;
	}

	public int getTotalPrice() {

		return calculateTotalPrice();
	}
}
