package bg.softuni.mobilele.models.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserLoginDTO {

    @NotNull
    @Size(min = 3, max = 20, message = "Username length must be between 3 and 20 characters!")
    private String email;

    @NotNull
    @Size(min = 3, max = 20, message = "Password length must be between 3 and 20 characters!")
    private String password;

    public UserLoginDTO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
