package bg.softuni.mobilele.service;

import bg.softuni.mobilele.models.dto.AddOfferDTO;
import bg.softuni.mobilele.models.dto.OfferDetailsDTO;

public interface OfferService {

    long createOrder(AddOfferDTO addOfferDTO);

    OfferDetailsDTO getOfferDetails(Long id);
}
