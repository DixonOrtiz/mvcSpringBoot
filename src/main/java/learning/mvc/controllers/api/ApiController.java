package learning.mvc.controllers.api;

import org.springframework.web.bind.annotation.RestController;

import learning.mvc.helpers.UserData;
import learning.mvc.models.User;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable("id") int id) {
        return UserData.getUserById(id);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return UserData.getUsers();
    }
}
