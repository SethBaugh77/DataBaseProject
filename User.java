import java.util.ArrayList;

public class User {
	protected int id;
	protected boolean admin;
	protected String firstName;
	protected String lastName;
	protected String username;
	protected String email;
	protected String password;
	protected String phone;
	private ArrayList<Criminal> criminals = new ArrayList<>();
	private ArrayList<Case> cases = new ArrayList<>();
	private ArrayList<User> users = new ArrayList<>();

	public User(int id, boolean admin, String fname, String lname, String username, String email, String password,
			String phone, ArrayList<Criminal> Criminals, ArrayList<Case> _cases) {
		this.id = id;
		this.admin = admin;
		this.firstName = fname;
		this.lastName = lname;
		this.username = username;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.criminals = Criminals;
		this.cases = _cases;
		this.users = users;

	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getAdmin() {
		return this.admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// public private get() {
	// return this.;
	// }
	// public void set(private ) {
	// this. = ;
	// }

	// public private get() {
	// return this.;
	// }
	// public void set(private ) {
	// this. = ;
	// }

	// public private get() {
	// return this.;
	// }
	// public void set(private ) {
	// this. = ;
	// }

	public boolean checkDuplicates(String str1, String str2, String str3, int num) {
		return true;
	}

	public void addCriminal(Criminal crim) {

	}

	public void addUser(User user) {

	}

	public void searchCase(Case _case) {

	}

}
