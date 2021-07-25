package pl.own.TouKTheatre.entity;

import javax.persistence.*;

@Entity
@Table(name = "screening")
public class Screening {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //different name for id in table here is because in Ticket entity I joinColumns in two places by
    //id column and it confuses id with the one in entity so I changed the name of id here
    @Column(name = "screening_id")
    private Long id;

    @Column(name = "time_of_start")
    private String timeOfStart;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movieId")
    Movie movie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roomId")
    Room room;

    public Screening() {
    }

    public Screening(String timeOfStart, Movie movie, Room room) {
        this.timeOfStart = timeOfStart;
        this.movie = movie;
        this.room = room;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTimeOfStart() {
        return timeOfStart;
    }

    public void setTimeOfStart(String timeOfStart) {
        this.timeOfStart = timeOfStart;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }


}


