package ShoppingCart;

public interface ShoppingCart {

	// Load product into the cart
	String putItems(Product product, int quantity);

	// remove product from the cart
	String deleteItems(Product product, int quantity);

	// Modify product quantity
	String updateItems(Product product, int desiredQuantity);

	// Calculate total payment price
	int calculateTotalPrice();

}