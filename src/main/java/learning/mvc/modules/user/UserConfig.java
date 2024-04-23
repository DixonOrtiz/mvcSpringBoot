package learning.mvc.modules.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import learning.mvc.modules.user.layers.service.UserService;

@Configuration
public class UserConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }
}