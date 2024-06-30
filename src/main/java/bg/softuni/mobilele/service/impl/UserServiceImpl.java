package bg.softuni.mobilele.service.impl;

import bg.softuni.mobilele.models.dto.UserRegisterDTO;
import bg.softuni.mobilele.models.entity.UserEntity;
import bg.softuni.mobilele.repository.UserRepository;
import bg.softuni.mobilele.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public void registerUser(UserRegisterDTO registerUserDto) {
        UserEntity user = this.modelMapper.map(registerUserDto, UserEntity.class);
        user.setPassword(this.passwordEncoder.encode(user.getPassword()));

        this.userRepository.save(user);
    }

}
