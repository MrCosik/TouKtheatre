package pl.own.TouKTheatre.entity;


import javax.persistence.*;


@Entity
@Table(name = "movie")
public class Movie {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Long movieId;
    @Column(name = "title")
    private String title;
    @Column(name = "length_in_minutes")
    private int lengthInMinutes;


    public Movie() {
    }

    public Movie(String title, int lengthInMinutes) {
        this.title = title;
        this.lengthInMinutes = lengthInMinutes;
    }

    public String getTitle() {
        return title;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }

    public void setMovieId(Long id) {
        this.movieId = id;
    }

}
