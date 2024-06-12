package bg.softuni.mobilele.service.impl;

import bg.softuni.mobilele.models.dto.RegisterUserDto;
import bg.softuni.mobilele.models.entity.User;
import bg.softuni.mobilele.repository.UserRepository;
import bg.softuni.mobilele.service.CurrentUser;
import bg.softuni.mobilele.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;
    private final CurrentUser currentUser;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper, PasswordEncoder passwordEncoder, CurrentUser currentUser) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
        this.currentUser = currentUser;
    }


    @Override
    public void registerUser(RegisterUserDto registerUserDto) {
        User user = this.modelMapper.map(registerUserDto, User.class);
        user.setPassword(this.passwordEncoder.encode(user.getPassword()));

        this.userRepository.save(user);
    }
}
