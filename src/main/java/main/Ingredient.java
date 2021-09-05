package main;
import javax.persistence.*;

@Entity
@Table(name="INGREDIENTS")
public class Ingredient {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE")
    private Integer price;


    public Ingredient() {
    }

    public Ingredient(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }

    public Ingredient(String name, Integer price, Boolean custom) {
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

}
