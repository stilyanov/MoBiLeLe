package bg.softuni.mobilele.repository;

import bg.softuni.mobilele.models.entity.UserRole;
import bg.softuni.mobilele.models.enums.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

    UserRole findByRoleType(RoleType role);
}
