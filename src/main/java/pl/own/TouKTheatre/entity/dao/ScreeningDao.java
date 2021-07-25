package pl.own.TouKTheatre.entity.dao;

public class ScreeningDao {

    private String timeOfStart;
    private Long movieId;
    private Long roomId;


    public ScreeningDao() {
    }

    public ScreeningDao(String timeOfStart, Long movieId, Long roomId) {
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
