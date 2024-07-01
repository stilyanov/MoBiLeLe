package bg.softuni.mobilele.service.impl;


import bg.softuni.mobilele.models.entity.UserEntity;
import bg.softuni.mobilele.models.entity.UserRoleEntity;
import bg.softuni.mobilele.models.enums.UserRoleEnum;
import bg.softuni.mobilele.models.user.MobileleUserDetails;
import bg.softuni.mobilele.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MobileleUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public MobileleUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return this.userRepository
                .findByEmail(email)
                .map(MobileleUserDetailsService::map)
                .orElseThrow(() -> new UsernameNotFoundException("UserEntity not found with email: " + email));

    }

    private static UserDetails map(UserEntity userEntity) {
        return new MobileleUserDetails(
                userEntity.getEmail(),
                userEntity.getPassword(),
                userEntity.getRoles().stream().map(UserRoleEntity::getRole).map(MobileleUserDetailsService::map).toList(),
                userEntity.getFirstName(),
                userEntity.getLastName()
        );

    }

    private static GrantedAuthority map(UserRoleEnum role) {
        return new SimpleGrantedAuthority(
                "ROLE_" + role
        );
    }

}
