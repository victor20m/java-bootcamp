package ShoppingCart;


public class CartProxy implements ShoppingCart {

	ShoppingCart cart;

	protected CartProxy(ShoppingCart requestCartService) {
		cart = requestCartService;
	}

	@Override
	public String putItems(Product product, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteItems(Product product, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateItems(Product product, int desiredQuantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int calculateTotalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
