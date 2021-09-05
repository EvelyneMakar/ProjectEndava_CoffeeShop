package main;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "BAVERAGE")
public class Bevarage {
    @Id
    @GeneratedValue
    @Column(name = "BAVERAGE_ID")
    private Long id;

    @Column(name = "BAVERAGE_NAME", nullable = false)
    private String name;

    @Column(name = "BAVERAGE_PRICE", nullable = false)
    private Integer price;


    @OneToOne
    @JoinColumn(name = "RECIPE_ID", referencedColumnName = "RECIPE_ID")
    private Recipe recipe;

    @OneToMany(mappedBy = "bevarage")
    @Column(name = "INGREDIENTS")
    private Set<BevarageIngredientList> bevarageIngredientList;

    public Bevarage() {
    }

    public Bevarage(Long id, String name, Integer price, Recipe recipe, Set<BevarageIngredientList> bevarageIngredientList) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.recipe = recipe;
        this.bevarageIngredientList = bevarageIngredientList;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Set<BevarageIngredientList> getCoffeeIngredients() {
        return bevarageIngredientList;
    }

    public void setCoffeeIngredients(Set<BevarageIngredientList> bevarageIngredientList) {
        this.bevarageIngredientList = bevarageIngredientList;
    }
}
