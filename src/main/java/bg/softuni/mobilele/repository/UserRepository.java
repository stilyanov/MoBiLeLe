package bg.softuni.mobilele.repository;

import bg.softuni.mobilele.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    Optional<User> findAllByIsActive(Boolean isActive);

}
