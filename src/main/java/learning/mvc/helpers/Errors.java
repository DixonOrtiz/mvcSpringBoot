package learning.mvc.helpers;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class Errors {
    static public ResponseStatusException userNotFound(int id) {
        return new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                String.format("user with id: %d not found.", id));
    }

}
