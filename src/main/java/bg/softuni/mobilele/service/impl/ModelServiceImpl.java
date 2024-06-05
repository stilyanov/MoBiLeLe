package bg.softuni.mobilele.service.impl;

import bg.softuni.mobilele.repository.ModelRepository;
import bg.softuni.mobilele.service.ModelService;
import org.springframework.stereotype.Service;

@Service
public class ModelServiceImpl implements ModelService {

    private final ModelRepository modelRepository;

    public ModelServiceImpl(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

}
