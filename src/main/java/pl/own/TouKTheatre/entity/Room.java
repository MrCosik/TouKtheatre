package pl.own.TouKTheatre.entity;

import javax.persistence.*;


@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "room_id")
    private Long roomId;
    @Column(name = "number")
    private int number;
    @Column(name = "number_of_seats")
    private int numberOfSeats;

    public Room() {
    }

    public Room(int number, int numberOfSeats) {
        this.number = number;
        this.numberOfSeats = numberOfSeats;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long id) {
        this.roomId = id;
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

}
