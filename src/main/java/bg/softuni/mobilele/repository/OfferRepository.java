package bg.softuni.mobilele.repository;

import bg.softuni.mobilele.models.entity.OfferEntity;
import bg.softuni.mobilele.models.enums.EngineTypeEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OfferRepository extends JpaRepository<OfferEntity, Long> {

    Optional<OfferEntity> findByEngineType(EngineTypeEnum engineType);

    Optional<OfferEntity> findAllByPrice(Double price);
}
