package main;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "CLIENTS")
public class Client {
    @Id
    @GeneratedValue
    @Column(name = "CLIENT_ID")
    private Long id;

    @Column(name = "USERNANME", nullable = false)
    private String username;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @OneToMany(mappedBy = "client")
    private Set<Order> orders;

    @OneToOne(mappedBy = "client")
    @PrimaryKeyJoinColumn
    private AdressClient adr;

    public Client() {
    }

    public Client(Long id, String username, String password, Set<Order> orders, AdressClient adr) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.orders = orders;
        this.adr = adr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public AdressClient getAdr() {
        return adr;
    }

    public void setAdr(AdressClient adr) {
        this.adr = adr;
    }
}
