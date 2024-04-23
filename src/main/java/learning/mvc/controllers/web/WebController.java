package learning.mvc.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import learning.mvc.helpers.UserData;

@Controller
@RequestMapping("/web")
public class WebController {

    @GetMapping("/users")
    public String getUsers(Model model) {
        model.addAttribute("users", UserData.getUsers());
        return "getUsers";
    }
}
