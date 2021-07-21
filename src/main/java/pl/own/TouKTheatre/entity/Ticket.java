package pl.own.TouKTheatre.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "price")
    private double price;

    @Column(name = "user_id")
    private Long userId;

    @OneToOne(mappedBy = "ticket", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Seat seat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "screening_id")
    private Screening screening;

    public Ticket() {
    }


    public Ticket(double price, Screening screening) {
        this.price = price;
        this.screening = screening;
    }

    public Ticket(double price, Long userId, Seat seat, Screening screening) {
        this.price = price;
        this.userId = userId;
        this.seat = seat;
        this.screening = screening;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Screening getScreening() {
        return screening;
    }

    public void setScreening(Screening screening) {
        this.screening = screening;
    }
}
