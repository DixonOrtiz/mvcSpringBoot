package learning.mvc.modules.user.layers.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import learning.mvc.modules.user.layers.service.helpers.createUser.CreateUser;
import learning.mvc.modules.user.types.dto.CreateUserInputDto;
import learning.mvc.modules.user.types.models.User;
import learning.mvc.shared.helpers.CustomErrors;

@Component
public class UserService {
    private List<User> users;

    public UserService() {
        users = new ArrayList<>();
        users.add(new User(1, "Dixon", "Ortiz", "dixon.ortiz@gmail.com"));
        users.add(new User(2, "Sabrina", "Da Silva", "sabrina.dasilva@gmail.com"));
        users.add(new User(3, "Pepe", "Da Silva", "pepes@gmail.com"));
    }

    public List<User> getUsers() {
        return users;
    }

    public User getUserById(int id) {
        for (User user : users)
            if (user.getId() == id)
                return user;
        throw CustomErrors.userNotFound(id);
    }

    public User createUser(CreateUserInputDto input) {
        CreateUser createUser = new CreateUser(users, input);
        createUser.validateInput();
        User user = createUser.buildUser();
        users.add(user);
        return user;
    }
}
