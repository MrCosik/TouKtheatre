package pl.own.TouKTheatre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.own.TouKTheatre.entity.Movie;
import pl.own.TouKTheatre.entity.Room;

@RepositoryRestResource
public interface RoomRepository extends JpaRepository<Room, Long> {
}
