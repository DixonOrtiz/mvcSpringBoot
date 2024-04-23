package learning.mvc.controllers;

import org.springframework.web.bind.annotation.RestController;

import learning.mvc.helpers.Helpers;
import learning.mvc.types.models.User;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class ApiRestController {

    @GetMapping("/user")
    public User getUser() {
        return Helpers.getUser();

    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return Helpers.getUsers();
    }
}
