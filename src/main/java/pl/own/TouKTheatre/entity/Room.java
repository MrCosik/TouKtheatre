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
    private int roomNumber;
    @Column(name = "number_of_seats")
    private int numberOfSeats;

    @Transient
    int[][] layout;



    public Room() {
    }

    public Room(int number, int numberOfSeats) {
        this.roomNumber = number;
        this.numberOfSeats = numberOfSeats;
    }

    public Room(int roomNumber, int numberOfSeats, int[][] layout) {
        this.roomNumber = roomNumber;
        this.numberOfSeats = numberOfSeats;
        this.layout = layout;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long id) {
        this.roomId = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int number) {
        this.roomNumber = number;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int[][] getLayout() {
        return layout;
    }

    public void setLayout(int[][] layout) {
        this.layout = layout;
    }
}
