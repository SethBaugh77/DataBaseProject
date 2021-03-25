
import java.util.ArrayList;

public class User {
	protected long id;
	protected boolean admin;
	protected String firstName;
	protected String lastName;
	protected String username;
	protected String email;
	protected String password;
	protected String phone;
	
	

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

	public long getId() {
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

	// public boolean checkDuplicates(String str1) {
	// 	for(int i= 0; i<criminals.length; i++) {
    //         if (str1 == criminals[i].getName) {
    //             return true;
    //         }
    //     }
    //     return false;
	// }

	// public void addCriminal(Criminal crim) {
    //     criminals.add(crim);
	// }

	// public void addUser(User user) {
    //     users.add(user);
	// }

	// public Case searchCase(int caseID) {
    //     for(int i= 0; i<cases.length; i++) {
    //         if (caseID == cases[i].getCaseID) {
    //             return cases[i];
    //         }
    //     }
    //     return null;

	// }

}
