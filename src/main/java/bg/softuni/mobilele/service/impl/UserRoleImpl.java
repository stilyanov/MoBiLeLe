package bg.softuni.mobilele.service.impl;

import bg.softuni.mobilele.repository.UserRoleRepository;
import bg.softuni.mobilele.service.UserRole;
import org.springframework.stereotype.Service;

@Service
public class UserRoleImpl implements UserRole {

    private final UserRoleRepository userRoleRepository;

    public UserRoleImpl(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

}
