package pl.own.TouKTheatre.entity;

import javax.persistence.*;

@Entity
@Table(name = "screening")
public class Screening{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //different name for id in table here is because in Ticket entity I joinColumns in two places by
    //id column and it confuses id with the one in entity so I changed the name of id here
    @Column(name = "screening_id")
    private Long id;
    @Column(name = "movie_id")
    private int movieId;
    @Column(name = "room_id")
    private int roomId;
    @Column
    private String timeOfStart;



    public Screening() {
    }

    public Screening(int movieId, int roomId, String timeOfStart) {
        this.movieId = movieId;
        this.roomId = roomId;
        this.timeOfStart = timeOfStart;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getTimeOfStart() {
        return timeOfStart;
    }

    public void setTimeOfStart(String timeOfStart) {
        this.timeOfStart = timeOfStart;
    }
}
