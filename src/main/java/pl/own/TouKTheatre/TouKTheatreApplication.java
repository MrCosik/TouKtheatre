package pl.own.TouKTheatre;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.own.TouKTheatre.entity.Movie;
import pl.own.TouKTheatre.entity.Room;
import pl.own.TouKTheatre.entity.Screening;
import pl.own.TouKTheatre.repository.MovieRepository;
import pl.own.TouKTheatre.repository.RoomRepository;
import pl.own.TouKTheatre.repository.ScreeningRepository;

import java.util.Arrays;

@SpringBootApplication
public class TouKTheatreApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouKTheatreApplication.class, args);
	}
//	@Bean
//	public ApplicationRunner movieInitializer(MovieRepository repository){
//
//		return args -> repository.saveAll(Arrays.asList(
//				new Movie("Ciche miejsca 2", 120),
//				new Movie("Kosmiczny mecz: Nowa era", 120),
//				new Movie("Luca", 120)
//		));
//	}
//
//
//	@Bean
//	public ApplicationRunner roomInitializer(RoomRepository repository){
//
//		return args -> repository.saveAll(Arrays.asList(
//				new Room(1,20),
//				new Room(2,20),
//				new Room(3,20)
//		));
//	}
//
//
////
//	@Bean
//	public ApplicationRunner screeningInitializer(ScreeningRepository repository){
//
//		return args -> repository.saveAll(Arrays.asList(
//				new Screening(1,1,"12:00"),
//				new Screening(3,2,"12:00"),
//				new Screening(2,1,"14:15")
//		));
//	}



}
