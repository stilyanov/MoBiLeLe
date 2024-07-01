package bg.softuni.mobilele.models.dto;

import bg.softuni.mobilele.models.enums.EngineTypeEnum;
import jakarta.validation.constraints.*;

public class AddOfferDTO {

    @NotEmpty(message = "{add.offer.description.not.empty}")
    @Size(message = "Description should be between 5 and 500 symbols.",
            min = 5,
            max = 500)
    String description;
    @NotNull
    @PositiveOrZero
    Integer mileage;
    @NotNull
    EngineTypeEnum engineType;

    public AddOfferDTO() {
    }

    public @NotEmpty(message = "{add.offer.description.not.empty}") @Size(message = "Description should be between 5 and 500 symbols.",
            min = 5,
            max = 500) String getDescription() {
        return description;
    }

    public void setDescription(@NotEmpty(message = "{add.offer.description.not.empty}") @Size(message = "Description should be between 5 and 500 symbols.",
            min = 5,
            max = 500) String description) {
        this.description = description;
    }

    public @NotNull @PositiveOrZero Integer getMileage() {
        return mileage;
    }

    public void setMileage(@NotNull @PositiveOrZero Integer mileage) {
        this.mileage = mileage;
    }

    public @NotNull EngineTypeEnum getEngineType() {
        return engineType;
    }

    public void setEngineType(@NotNull EngineTypeEnum engineType) {
        this.engineType = engineType;
    }
}