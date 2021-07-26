package pl.own.TouKTheatre.entity.dto;

public class ScreeningDto {

    private String timeOfStart;
    private String day;
    private Long movieId;
    private Long roomId;


    public ScreeningDto() {
    }

    public ScreeningDto(String timeOfStart, String day, Long movieId, Long roomId) {
        this.timeOfStart = timeOfStart;
        this.day = day;
        this.movieId = movieId;
        this.roomId = roomId;
    }

    public String getTimeOfStart() {
        return timeOfStart;
    }

    public String getDay() {
        return day;
    }

    public Long getMovieId() {
        return movieId;
    }

    public Long getRoomId() {
        return roomId;
    }
}
