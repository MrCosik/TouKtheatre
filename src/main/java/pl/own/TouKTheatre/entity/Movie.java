package pl.own.TouKTheatre.entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "length_in_minutes")
    private int lengthInMinutes;

    @OneToMany
    @JoinColumn(name = "movie_id")
    private Set<Screening> screenings = new HashSet<>();

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

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Screening> getScreenings() {
        return screenings;
    }

    public void setScreenings(Set<Screening> screenings) {
        this.screenings = screenings;
    }

    public void addScreening(Screening screening){
        screenings.add(screening);
    }
}
