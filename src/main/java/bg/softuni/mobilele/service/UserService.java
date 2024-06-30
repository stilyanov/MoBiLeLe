package bg.softuni.mobilele.service;

import bg.softuni.mobilele.models.dto.UserLoginDTO;
import bg.softuni.mobilele.models.dto.UserRegisterDTO;

public interface UserService {

    void registerUser(UserRegisterDTO registerUserDto);

}
