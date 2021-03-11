package groupproj;

import java.util.ArrayList;

public class NormalUser {

    public NormalUser(String ID, boolean Admin, String firstname, String lastname, String username, String email, 
    String password, int phone, ArrayList<Criminal> Criminals, ArrayList<Case> Cases, ArrayList<User> Users) {
		this.ID = ID;
		this.admin = Admin;
		this.firstname = firstname;
		this.lastname = lastname;
		this.usename = username;
		this.email = email;
		this.password = password;
        this.phone = phone;
        this.criminals = Criminals;
        this.case = Cases;
        this.user = Users;
	
		
	}
	
}
