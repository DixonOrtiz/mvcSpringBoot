package learning.mvc.helpers;

import java.util.Arrays;
import java.util.List;

import learning.mvc.models.User;

public class UserData {

    public static List<User> getUsers() {
        return Arrays.asList(
                new User(1, "Dixon", "Ortiz", "dixon.ortiz@gmail.com"),
                new User(2, "Sabrina", "Da Silva", "sabrina.dasilva@gmail.com"),
                new User(3, "Pepe", "Da Silva", null));
    }

    public static User getUserById(int id) {
        for (User user : getUsers())
            if (user.getId() == id)
                return user;
        throw Errors.userNotFound(id);
    }
}
