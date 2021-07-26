package pl.own.TouKTheatre.controller;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.own.TouKTheatre.entity.dto.ScreeningDto;
import pl.own.TouKTheatre.service.ScreeningService;
import pl.own.TouKTheatre.entity.Screening;

import java.util.List;

@RestController
public class ScreeningController {

    ScreeningService screeningService;

    public ScreeningController(ScreeningService screeningService) {
        this.screeningService = screeningService;
    }

    @GetMapping("/screenings")
    public ResponseEntity<List<ScreeningDto>> getAllScreenings(){

        return new ResponseEntity<>(screeningService.getAllScreenings(), HttpStatus.OK);
    }

    @GetMapping("/screenings/{id}")
    public ResponseEntity<ScreeningDto> getSeatsForSpecificScreening(@PathVariable Long id){
        return screeningService.getSeatsForScreening(id);
    }
}
