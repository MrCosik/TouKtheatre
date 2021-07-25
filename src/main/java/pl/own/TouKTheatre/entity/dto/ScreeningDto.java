package pl.own.TouKTheatre.entity.dto;

public class ScreeningDto {

    private String timeOfStart;
    private Long movieId;
    private Long roomId;


    public ScreeningDto() {
    }

    public ScreeningDto(String timeOfStart, Long movieId, Long roomId) {
        this.timeOfStart = timeOfStart;
        this.movieId = movieId;
        this.roomId = roomId;
    }

    public String getTimeOfStart() {
        return timeOfStart;
    }

    public void setTimeOfStart(String timeOfStart) {
        this.timeOfStart = timeOfStart;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }
}
