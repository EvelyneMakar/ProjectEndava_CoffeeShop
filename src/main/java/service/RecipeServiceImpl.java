package service;
import main.Recipe;
import org.springframework.stereotype.Service;
import repository.RecipeRepository;
import javax.transaction.Transactional;

@Service
public class RecipeServiceImpl implements  RecipeService{
    public final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    @Transactional
    public Recipe addRecipe(Recipe recipe){
        recipe = recipeRepository.save(recipe);

        return recipe;
    }
}
