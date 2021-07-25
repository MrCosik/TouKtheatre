package pl.own.TouKTheatre.controller;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.own.TouKTheatre.service.ScreeningService;
import pl.own.TouKTheatre.entity.Screening;

import java.util.List;

@RestController
public class ScreeningController {

    ScreeningService screeningService;


    @GetMapping("/screenings")
    public List<Screening> getAllScreenings(){
        List<Screening> allScreenings = screeningService.getAllScreenings();

        return allScreenings;
    }
}
