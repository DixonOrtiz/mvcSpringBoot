package learning.mvc.types.dto;

public class HelloDto {
    private String title;
    private String userFullName;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getTitle() {
        return title;
    }

    public String getUserFullName() {
        return userFullName;
    }

}
