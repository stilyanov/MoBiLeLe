package bg.softuni.mobilele.models.dto;

import bg.softuni.mobilele.models.enums.EngineTypeEnum;

public record OfferSummaryDTO(Long id,
                              String description,
                              Integer mileage,
                              EngineTypeEnum engineType) {
}
