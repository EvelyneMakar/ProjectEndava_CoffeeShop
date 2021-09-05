package main;
import javax.persistence.*;

@Entity
@Table(name = "ADRESSES")
public class AdressClient {
    @Id
    @Column(name = "CLIENT_ID")
    private Long id;

    @Column(name = "ADRESS_NAME")
    private String adr;

    @Column(name = "ADRESS_NR")
    private int nr;

    @OneToOne
    @MapsId
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

    public AdressClient() {
    }

    public AdressClient(Long id, String adr, int nr) {
        this.id = id;
        this.adr = adr;
        this.nr = nr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

}
