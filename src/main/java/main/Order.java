package main;
import javax.persistence.*;


@Entity
@Table(name = "ORDERS")
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name = "AMOUNT")
    private int amount;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID", nullable = false)
    private Client client;

    @Column(name = "DELIVERY")
    private boolean delivery;



    public Order() {
    }

    public Order(Long id, int amount, Client client, boolean delivery) {
        this.id = id;
        this.amount = amount;
        this.client = client;
        this.delivery = delivery;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

}
