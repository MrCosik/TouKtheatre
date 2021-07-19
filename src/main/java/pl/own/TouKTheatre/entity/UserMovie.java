package pl.own.TouKTheatre.entity;

import javax.persistence.*;

@Entity
public class UserMovie {

    @EmbeddedId
    private UserMovieKey id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    Movie movie;


    private String seatRow;
    private int seatNumber;

    public UserMovie() {
    }

    public UserMovie(String seatRow, int seatNumber) {
        this.seatRow = seatRow;
        this.seatNumber = seatNumber;
    }



    public UserMovie(User user, Movie movie, String seatRow, int seatNumber) {
        this.id = new UserMovieKey(user.getId(), movie.getId());
        this.user = user;
        this.movie = movie;
        this.seatRow = seatRow;
        this.seatNumber = seatNumber;
    }

    public UserMovieKey getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getSeatRow() {
        return seatRow;
    }

    public void setSeatRow(String seatRow) {
        this.seatRow = seatRow;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
