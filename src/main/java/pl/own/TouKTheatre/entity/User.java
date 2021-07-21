package pl.own.TouKTheatre.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "username")
    private String surname;
    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    Set<Ticket> tickets = new HashSet<>();



    public User() {
    }

    public User(String username, String name) {
        this.surname = username;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String username) {
        this.surname = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void buyTicket(Ticket ticket){
        tickets.add(ticket);
    }


}
