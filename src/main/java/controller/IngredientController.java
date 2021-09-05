package controller;
import main.Ingredient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import repository.IngredientRepository;
import service.IngredientService;
import java.util.List;
import java.util.Optional;

@Controller
public class IngredientController {
    public final IngredientRepository ingredientRepository;
    public final IngredientService ingredientService;

    public IngredientController(IngredientRepository ingredientRepository,IngredientService ingredientService) {
        this.ingredientRepository = ingredientRepository;
        this.ingredientService = ingredientService;
    }

    @GetMapping("/ingredient")
    List<Ingredient> all() {
        return ingredientRepository.findAll();
    }


    @GetMapping("/ingredients/{id}")
    Optional<Ingredient> one(@PathVariable Long id) {

        return ingredientRepository.findById(id);
    }


}
