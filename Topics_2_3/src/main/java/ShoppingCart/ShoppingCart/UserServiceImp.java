package ShoppingCart;


public class UserServiceImp implements UserService {

	Database databaseConnection;

	@Override
	public User registerUser(String name, String password, String document, String telephone, String email) {

		return new User(name, password, document, telephone, email);
	}

	@Override
	public String showUserData(String userName) {
		String userInfo = "User doesn't exist";
		for (User user : databaseConnection.userDatabase) {
			if (user.getName().equals(userName)) {
				userInfo = user.toString();
			}
		}
		return userInfo;
	}

	@Override
	public void updateInfo(String userName, String password, String newTelephone, String newEmail) {
		for (User user : databaseConnection.userDatabase) {
			if (user.getName().equals(userName) && user.getPassword().equals(password)) {
				user.setEmail(newEmail);
				user.setTelephone(newTelephone);
			}
		}
	}

	@Override
	public void deleteUser(String userName, String password) {
		for (User user : databaseConnection.userDatabase) {
			if (user.getName().equals(userName) && user.getPassword().equals(password)) {
				databaseConnection.userDatabase.remove(user);
			}
		}

	}

}
