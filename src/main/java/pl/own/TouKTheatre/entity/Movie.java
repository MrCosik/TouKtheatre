package pl.own.TouKTheatre.entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "length_in_minutes")
    private int lengthInMinutes;


    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }, mappedBy = "movies")
    private Set<UserMovie> viewers = new HashSet<>();


    public Movie() {
    }

    public Movie(String title, int lengthInMinutes) {
        this.title = title;
        this.lengthInMinutes = lengthInMinutes;
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
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

    public Set<UserMovie> getViewers() {
        return viewers;
    }

    public void setViewers(Set<UserMovie> viewers) {
        this.viewers = viewers;
    }
}
