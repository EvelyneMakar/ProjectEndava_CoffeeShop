package main;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Recipe {
    @Id
    @GeneratedValue
    @Column(name = "RECIPE_ID")
    private Long id;

    @Column(name = "REPICE_NAME")
    private String name;
    private Bevarage bevarage;

    @OneToMany(mappedBy = "recipe")
    @Column(name = "INGREDIENTS")
    private Set<IngredientList> ingredientList;

    public Recipe(String name, Bevarage bevarage, Set<IngredientList> ingredientList) {
        this.name = name;
        this.bevarage = bevarage;
        this.ingredientList = ingredientList;
    }

    public Recipe() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bevarage getBevarage() {
        return bevarage;
    }

    public void setBevarage(Bevarage bevarage) {
        this.bevarage = bevarage;
    }

    public Set<IngredientList> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(Set<IngredientList> recipeIngredients) {
        this.ingredientList = recipeIngredients;
    }
}
