package ShoppingCart;

public interface UserService {

	User registerUser(String name,String password, String document, String telephone, String email);
	String showUserData(String userName);
	void updateInfo(String userName, String password, String newTelephone, String newEmail);
	void deleteUser(String userName, String password);
	
}
