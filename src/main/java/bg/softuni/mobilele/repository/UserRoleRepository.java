package bg.softuni.mobilele.repository;

import bg.softuni.mobilele.models.entity.UserRoleEntity;
import bg.softuni.mobilele.models.enums.UserRoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRoleEntity, Long> {

}
