package pl.own.TouKTheatre.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Room {
    @Id
    @GeneratedValue
    private Long id;
    private int number;
    private int numberOfSeats;
}
