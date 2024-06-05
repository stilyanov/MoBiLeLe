package bg.softuni.mobilele.models.entity;


import bg.softuni.mobilele.models.enums.RoleType;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class UserRole extends BaseEntity {

    @Column(name = "role", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private RoleType roleType;

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
}
