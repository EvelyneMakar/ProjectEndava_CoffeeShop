package service;
import main.Recipe;
import javax.transaction.Transactional;

public interface RecipeService  {
    @Transactional
    Recipe addRecipe(Recipe recipe);
}
