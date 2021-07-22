package pl.own.TouKTheatre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import pl.own.TouKTheatre.entity.Movie;

@RepositoryRestResource
public interface TicketRepository extends JpaRepository<Movie, Long> {
}
