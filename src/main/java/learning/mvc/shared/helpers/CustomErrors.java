package learning.mvc.shared.helpers;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class CustomErrors {
    static public ResponseStatusException userNotFound(int id) {
        return new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                String.format("user with id: %d not found", id));
    }

    static public ResponseStatusException bodyIsRequired() {
        return new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                String.format("request body is required"));
    }

    static public ResponseStatusException fieldIsRequired(String field) {
        return new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                String.format("field '%s' is required in request body", field));
    }

}
