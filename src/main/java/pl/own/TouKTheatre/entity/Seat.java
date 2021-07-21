package pl.own.TouKTheatre.entity;

import javax.persistence.*;

@Entity
@Table(name = "seat")
public class Seat {

    @Id
    @Column(name = "ticket_id")
    private Long id;
    @Column(name = "seat_row")
    private int seatRow;
    @Column(name = "seat_number")
    private int seatNumber;

    @OneToOne
    @MapsId
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    public Seat() {
    }

    public Seat(int seatRow, int seatNumber, Ticket ticket) {
        this.seatRow = seatRow;
        this.seatNumber = seatNumber;
        this.ticket = ticket;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSeatRow() {
        return seatRow;
    }

    public void setSeatRow(int seatRow) {
        this.seatRow = seatRow;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
