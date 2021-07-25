package pl.own.TouKTheatre.configuration;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.own.TouKTheatre.entity.Movie;
import pl.own.TouKTheatre.entity.Room;
import pl.own.TouKTheatre.entity.Screening;
import pl.own.TouKTheatre.repository.MovieRepository;
import pl.own.TouKTheatre.repository.RoomRepository;
import pl.own.TouKTheatre.repository.ScreeningRepository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@Component
@Transactional
public class ScreeningAdd implements CommandLineRunner {

    MovieRepository movieRepository;
    RoomRepository roomRepository;
    ScreeningRepository screeningRepository;


    public ScreeningAdd(MovieRepository movieRepository, RoomRepository roomRepository, ScreeningRepository screeningRepository) {
        this.movieRepository = movieRepository;
        this.roomRepository = roomRepository;
        this.screeningRepository = screeningRepository;

    }

    @Override
    public void run(String... args) throws Exception {
        List<Room> rooms = Arrays.asList(
                new Room(1, 20),
                new Room(2, 20),
                new Room(3, 20)
        );

        List<Movie> movies = Arrays.asList(
                new Movie("Ciche miejsca 2", 120),
                new Movie("Kosmiczny mecz: Nowa era", 120),
                new Movie("Luca", 120)
        );


        Screening screening = new Screening("12:00", movies.get(1), rooms.get(1));
        roomRepository.saveAll(rooms);
        movieRepository.saveAll(movies);
        screeningRepository.save(screening);
    }
}
