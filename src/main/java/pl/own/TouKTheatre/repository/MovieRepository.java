package pl.own.TouKTheatre.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;
import pl.own.TouKTheatre.entity.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}
