import java.util.ArrayList;

public class User{
protected String id;
protected boolean admin;
protected String firstName;
protected String lastName;
protected String username;
protected String email;
protected String password;
protected String phone;
private   ArrayList<Criminal> criminals = new ArrayList<>();
private   ArrayList<Case> cases = new ArrayList<>();
private   ArrayList<User> users = new ArrayList<>();
public User(String id, boolean admin, String fname, String lname, String username, String email, String password, String phone, 
ArrayList<Criminal> Criminals,ArrayList<Case> _cases, ArrayList<User> users)
{
    this.id =id;
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

public boolean checkDuplicates(String str1, String str2, String str3, int num)
{
    return true;
}
    
public void addCriminal(Criminal crim)
{

}

public void addUser(User user)
{

}

public void searchCase(Case _case)
{

}

}
