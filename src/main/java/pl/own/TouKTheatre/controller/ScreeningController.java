package pl.own.TouKTheatre.controller;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
}
