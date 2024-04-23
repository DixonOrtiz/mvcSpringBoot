package learning.mvc.modules.user.layers.service.helpers.createUser;

import java.util.List;

import learning.mvc.modules.user.types.dto.CreateUserInputDto;
import learning.mvc.modules.user.types.models.User;
import learning.mvc.shared.helpers.Validation;

public class CreateUser {
    private final List<User> users;
    private final CreateUserInputDto input;

    public CreateUser(List<User> users, CreateUserInputDto input) {
        this.users = users;
        this.input = input;
    }

    public void validateInput() {
        Validation.fieldIsRequired("name", input.getName());
        Validation.fieldIsRequired("lastname", input.getLastname());
        Validation.fieldIsRequired("email", input.getEmail());
    }

    public User buildUser() {
        final int id = users.size() + 1;
        final String name = input.getName();
        final String lastname = input.getLastname();
        final String email = input.getEmail();
        return new User(id, name, lastname, email);
    }

}
