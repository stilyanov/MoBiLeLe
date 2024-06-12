package bg.softuni.mobilele.service;

import bg.softuni.mobilele.models.dto.AddOfferDTO;
import bg.softuni.mobilele.models.dto.OfferDetailsDTO;
import bg.softuni.mobilele.models.dto.OfferSummaryDTO;

import java.util.List;

public interface OfferService {

    long createOrder(AddOfferDTO addOfferDTO);

    OfferDetailsDTO getOfferDetails(Long id);

    void deleteOffer(long id);

    List<OfferSummaryDTO> getAllOffersSummary();
}
