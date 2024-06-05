package bg.softuni.mobilele.service.impl;

import bg.softuni.mobilele.models.dto.RegisterUserDto;
import bg.softuni.mobilele.repository.UserRepository;
import bg.softuni.mobilele.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void registerUser(RegisterUserDto registerUserDto) {

    }
}
