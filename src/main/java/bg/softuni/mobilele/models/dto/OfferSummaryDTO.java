package bg.softuni.mobilele.models.dto;

import bg.softuni.mobilele.models.enums.EngineType;

public record OfferSummaryDTO(Long id,
                              String description,
                              Integer mileage,
                              EngineType engineType) {
}
