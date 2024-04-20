package pe.edu.upc.demosi61clase.dtos;

public class MovieDTO {
    private int idMovie;
    private String titleMovie;
    private String genderMovie;
    private String synopsisMovie;
    private int durationMovie;
    private int yearLaunchMovie;

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public String getTitleMovie() {
        return titleMovie;
    }

    public void setTitleMovie(String titleMovie) {
        this.titleMovie = titleMovie;
    }

    public String getGenderMovie() {
        return genderMovie;
    }

    public void setGenderMovie(String genderMovie) {
        this.genderMovie = genderMovie;
    }

    public String getSynopsisMovie() {
        return synopsisMovie;
    }

    public void setSynopsisMovie(String synopsisMovie) {
        this.synopsisMovie = synopsisMovie;
    }

    public int getDurationMovie() {
        return durationMovie;
    }

    public void setDurationMovie(int durationMovie) {
        this.durationMovie = durationMovie;
    }

    public int getYearLaunchMovie() {
        return yearLaunchMovie;
    }

    public void setYearLaunchMovie(int yearLaunchMovie) {
        this.yearLaunchMovie = yearLaunchMovie;
    }
}
