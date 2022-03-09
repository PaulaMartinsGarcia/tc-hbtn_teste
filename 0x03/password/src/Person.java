
public class Person {

	public boolean checkUser(String user) {
		return user.length() >=8 && user.matches("[a-zA-Z].*[a-zA-Z0-9]");
	}
	
	public boolean checkPassword(String password) {
		return password.length() >=8 && password.matches("(?=.*[}{,.@$^?~=+\\-_\\/*\\-+.\\|])(?=.*[a-zA-Z])(?=.*[0-9])");
	}
}
