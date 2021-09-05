package service;
import main.Ingredient;
import javax.transaction.Transactional;

public interface IngredientService {
    @Transactional
    Ingredient addIngredient(Ingredient ingredient);
}
