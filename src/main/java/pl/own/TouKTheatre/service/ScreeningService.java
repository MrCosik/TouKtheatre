package pl.own.TouKTheatre.service;

import org.springframework.stereotype.Service;
import pl.own.TouKTheatre.entity.Screening;
import pl.own.TouKTheatre.repository.ScreeningRepository;

import java.util.List;

@Service
public class ScreeningService {

    ScreeningRepository screeningRepository;

    public List<Screening> getAllScreenings(){
        return screeningRepository.findAll();
    }
}
