package main;
import javax.persistence.*;

@Entity
@Table(name = "BEVARAGE_INGREDIENTS")
public class BevarageIngredientList {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "BEVARAGE_ID")
    private Bevarage bevarage;

    @ManyToOne
    @JoinColumn(name = "INGREDIENT_ID")
    private Ingredient ingredient;

    public BevarageIngredientList() {
    }

    public BevarageIngredientList(Long id, Bevarage bevarage, Ingredient ingredient) {
        this.id = id;
        this.bevarage = bevarage;
        this.ingredient = ingredient;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Bevarage getBevarage() {
        return bevarage;
    }

    public void setBevarage(Bevarage bevarage) {
        this.bevarage = bevarage;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
