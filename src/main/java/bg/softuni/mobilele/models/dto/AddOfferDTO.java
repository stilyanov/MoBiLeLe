package bg.softuni.mobilele.models.dto;

import bg.softuni.mobilele.models.enums.EngineType;
import bg.softuni.mobilele.models.enums.TransmissionType;
import jakarta.validation.constraints.*;

public record AddOfferDTO(
        @NotEmpty(message = "{add.offer.description.not.empty}")
        @Size(message = "Description should be between 5 and 500 symbols.",
                min = 5,
                max = 500) String description,
        @NotNull @PositiveOrZero Integer mileage,
        @NotNull EngineType engineType
) {

}