
import java.util.ArrayList;

public class NormalUser extends User {

	public NormalUser(int ID, boolean Admin, String firstname, String lastname, String username, String email,
			String password, String phone, ArrayList<Criminal> Criminals, ArrayList<Case> Cases,
			ArrayList<User> Users) {
		super(ID, Admin, firstname, lastname, username, email, password, phone, Criminals, Cases);
	}

}
