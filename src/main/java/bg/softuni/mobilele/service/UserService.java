package bg.softuni.mobilele.service;

import bg.softuni.mobilele.models.dto.LoginUserDTO;
import bg.softuni.mobilele.models.dto.RegisterUserDTO;

public interface UserService {

    void registerUser(RegisterUserDTO registerUserDto);

    boolean loginUser(LoginUserDTO loginUserDto);

    void logout();
}
