package pl.own.TouKTheatre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.own.TouKTheatre.entity.Movie;

@Repository
public interface UserRepository extends JpaRepository<Movie, Long> {
}
