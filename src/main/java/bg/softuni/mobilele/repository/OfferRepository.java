package bg.softuni.mobilele.repository;

import bg.softuni.mobilele.models.entity.Offer;
import bg.softuni.mobilele.models.enums.EngineType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Optional;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {

    Optional<Offer> findByEngineType(EngineType engineType);

    Optional<Offer> findAllByPrice(Double price);
}
