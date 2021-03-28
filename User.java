
import java.util.ArrayList;

public class User {
	private long id;
	private boolean admin;
	private String firstName;
	private String lastName;
	private String username;
	private String email;
	private String password;
	private String phone;

	public User(long id, boolean admin, String fname, String lname, String username, String email, String password,
			String phone) {
		this.id = id;
		this.admin = admin;
		this.firstName = fname;
		this.lastName = lname;
		this.username = username;
		this.email = email;
		this.password = password;
		this.phone = phone;

	}

	 /**
   	* Gets the ID.
   	* @return this ID.
   	*/
	public long getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	 /**
   	* Gets the Admin.
   	* @return this Admin.
   	*/
	public boolean getAdmin() {
		return this.admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	 /**
   	* Gets the first name.
   	* @return this first name.
   	*/
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	 /**
   	* Gets the last name.
   	* @return this last name.
   	*/
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	 /**
   	* Gets the username.
   	* @return this username.
   	*/
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	 /**
   	* Gets the email.
   	* @return this email.
   	*/
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	 /**
   	* Gets the password.
   	* @return this password.
   	*/
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	 /**
   	* Gets the phone.
   	* @return this phone.
   	*/
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
