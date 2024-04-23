package learning.mvc.helpers;

import java.util.Arrays;
import java.util.List;

import learning.mvc.types.models.User;

public class Helpers {
    public static User getUser() {
        return new User("Dixon", "Ortiz", "dixon.ortiz@gmail.com");
    }

    public static List<User> getUsers() {
        return Arrays.asList(
                new User("Dixon", "Ortiz", "dixon.ortiz@gmail.com"),
                new User("Sabrina", "Da Silva", "sabrina.dasilva@gmail.com"),
                new User("Pepe", "Da Silva", null));
    }
}
