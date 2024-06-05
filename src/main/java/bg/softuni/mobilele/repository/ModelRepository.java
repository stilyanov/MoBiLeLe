package bg.softuni.mobilele.repository;

import bg.softuni.mobilele.models.entity.Model;
import bg.softuni.mobilele.models.enums.CategoryType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {

    Optional<Model> findByName(String modelName);

    Optional<Model> findByCategoryType(CategoryType categoryType);

    Optional<Model> findAllByStartYear(int startYear);

}
