package pl.own.TouKTheatre.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "name")
    private String name;


    @OneToMany(mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true )
    private Set<UserMovie> seats = new HashSet<>();


    public User() {
    }

    public User(String username, String name) {
        this.username = username;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UserMovie> getSeats() {
        return seats;
    }

    public void setSeats(Set<UserMovie> seats) {
        this.seats = seats;
    }

    public void reserveSeat(Movie movie, String seatRow, int seatNumber) {
        UserMovie userMovie = new UserMovie(this, movie, seatRow, seatNumber);
        seats.add(userMovie);
        movie.getViewers().add(userMovie);
    }
}
