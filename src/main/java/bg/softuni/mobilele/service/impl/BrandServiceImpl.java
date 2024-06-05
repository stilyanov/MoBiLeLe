package bg.softuni.mobilele.service.impl;

import bg.softuni.mobilele.repository.BrandRepository;
import bg.softuni.mobilele.service.BrandService;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;

    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }
}
