package service;
import main.Bevarage;
import org.springframework.stereotype.Service;
import repository.BevarageRepository;
import repository.IngredientRepository;
import javax.transaction.Transactional;

@Service
public class BevarageServiceImpl implements BevarageService {
    public final BevarageRepository bevarageRepository;
    public final IngredientRepository ingredientRepository;

    public BevarageServiceImpl(BevarageRepository bevarageRepository, IngredientRepository ingredientRepository ) {
        this.bevarageRepository = bevarageRepository;
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    @Transactional
    public Bevarage addBevarage(Bevarage bevarage) {
        bevarage = bevarageRepository.save(bevarage);

        return bevarage;
    }
}
