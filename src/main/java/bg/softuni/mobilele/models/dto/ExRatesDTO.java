package bg.softuni.mobilele.models.dto;

import java.math.BigDecimal;
import java.util.Map;

public record ExRatesDTO(String base, Map<String, BigDecimal> rates) {
}
