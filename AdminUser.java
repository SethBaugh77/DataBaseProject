import java.util.ArrayList;

public class AdminUser extends User {

    AdminUser(int id, boolean admin, String fname, String lname, String username, String email, String password,
            String phone, ArrayList<Criminal> Criminals, ArrayList<Case> _cases) {
        super(id, admin, fname, lname, username, email, password, phone, Criminals, _cases);
    }

    public void removeCriminal(Criminal _crim) {

    }

    public void removeCase(Case _case) {

    }

    public void removeUser(User _user) {

    }

}
