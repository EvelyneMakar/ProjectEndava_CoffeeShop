package main;
import javax.persistence.*;

@Entity
@Table(name = "INGREDIENT_LIST")
public class IngredientList {@Id
@GeneratedValue
private Long id;

    @ManyToOne
    @JoinColumn(name = "RECIPE_ID")
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(name = "INGREDIENT_ID")
    private Ingredient ingredient;

    public IngredientList() {
    }

    public IngredientList(Long id, Recipe recipe, Ingredient ingredient) {
        this.id = id;
        this.recipe = recipe;
        this.ingredient = ingredient;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
