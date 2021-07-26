package pl.own.TouKTheatre.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.own.TouKTheatre.entity.Screening;
import pl.own.TouKTheatre.entity.dto.ScreeningDto;
import pl.own.TouKTheatre.repository.ScreeningRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScreeningService {

    ScreeningRepository screeningRepository;

    public ScreeningService(ScreeningRepository screeningRepository) {
        this.screeningRepository = screeningRepository;
    }

    public List<ScreeningDto> getAllScreenings(){

        List<ScreeningDto> allScreenings = new ArrayList<>();

        if(screeningRepository.findAll().size() == 0)
            return null;

        for(Screening screening : screeningRepository.findAll()){
            allScreenings.add(new ScreeningDto(screening.getTimeOfStart(),screening.getDay(),screening.getMovie().getMovieId(),screening.getRoom().getRoomId()));
        }
        return allScreenings;
    }

    public ResponseEntity<ScreeningDto> getSeatsForScreening(Long id) {

        return null;
    }
}
