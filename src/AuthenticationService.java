import java.util.ArrayList;

public class AuthenticationService implements IAuthenticationService
{
    private ArrayList<User> users;
    public AuthenticationService(ArrayList<User> users) {
        this.users = users;
    }
    @Override
    public User signUp(String username, String password) {
        for (User user : users) {
            if ((user.getUsername()).compareTo(username) == 0) {
                return null;
            }
        }
        User validUser = new User(username, password);
        this.users.add(validUser);
        return validUser;
    }

    @Override
    public User logIn(String username, String password) {
        for (User user : users) {
            if ((user.getUsername()).compareTo(username) == 0) {
                if ((user.getPassword()).compareTo(password) == 0) {
                    return user;
                } else {
                    return null;
                }
            }
        }
        return null;
    }
}
