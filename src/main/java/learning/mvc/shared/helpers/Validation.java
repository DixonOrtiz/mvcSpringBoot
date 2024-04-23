package learning.mvc.shared.helpers;

public class Validation {
    static public void fieldIsRequired(String field, String value) {
        if (value == null || value.isEmpty())
            throw CustomErrors.fieldIsRequired(field);
    }
}
