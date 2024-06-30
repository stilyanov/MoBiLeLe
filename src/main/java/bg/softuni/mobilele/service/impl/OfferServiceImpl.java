package bg.softuni.mobilele.service.impl;

import bg.softuni.mobilele.models.dto.AddOfferDTO;
import bg.softuni.mobilele.models.dto.OfferDetailsDTO;
import bg.softuni.mobilele.models.dto.OfferSummaryDTO;
import bg.softuni.mobilele.models.entity.OfferEntity;
import bg.softuni.mobilele.repository.OfferRepository;
import bg.softuni.mobilele.service.OfferService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferServiceImpl implements OfferService {

    private final OfferRepository offerRepository;
    private final ModelMapper modelMapper;

    public OfferServiceImpl(OfferRepository offerRepository, ModelMapper modelMapper) {
        this.offerRepository = offerRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public long createOrder(AddOfferDTO addOfferDTO) {
        return offerRepository.save(modelMapper.map(addOfferDTO, OfferEntity.class)).getId();
    }

    @Override
    public OfferDetailsDTO getOfferDetails(Long id) {
        return this.offerRepository.findById(id)
                .map(o -> this.modelMapper.map(o, OfferDetailsDTO.class))
                .orElse(null);
    }

    @Override
    public void deleteOffer(long id) {
        this.offerRepository.deleteById(id);
    }

    @Override
    public List<OfferSummaryDTO> getAllOffersSummary() {
      return this.offerRepository.findAll()
              .stream()
              .map(o -> this.modelMapper.map(o, OfferSummaryDTO.class))
              .toList();
    }

}
