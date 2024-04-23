package learning.mvc.modules.user.layers.controller.api;

import org.springframework.web.bind.annotation.RestController;

import learning.mvc.modules.user.layers.service.UserService;
import learning.mvc.modules.user.types.dto.CreateUserInputDto;
import learning.mvc.modules.user.types.models.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/users")
public class UserApiController {
    private final UserService userService;

    @Autowired
    private Environment environment;

    public UserApiController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }

    @GetMapping()
    public List<User> getUsers() {
        System.err.println(environment.getProperty("name"));
        return userService.getUsers();
    }

    @PostMapping()
    public User createUser(@RequestBody CreateUserInputDto input) {
        return userService.createUser(input);
    }
}
