package pl.own.TouKTheatre.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column
    private int number;
    @Column
    private int numberOfSeats;


    @OneToMany
    @JoinColumn(name = "room_id")
    private Set<Screening> screenings = new HashSet<>();


    public Room() {
    }

    public Room(int number, int numberOfSeats) {
        this.number = number;
        this.numberOfSeats = numberOfSeats;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Set<Screening> getScreenings() {
        return screenings;
    }



    public void addScreening(Screening screening){
        screenings.add(screening);
    }
}
