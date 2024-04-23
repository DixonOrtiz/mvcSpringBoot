package learning.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import learning.mvc.helpers.Helpers;

@Controller
@RequestMapping("/web")
public class WebController {

    @GetMapping("/users")
    public String getUsers(Model model) {
        model.addAttribute("users", Helpers.getUsers());
        return "getUsers";
    }
}
