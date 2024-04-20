package pe.edu.upc.demosi61clase.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMovie;
    @Column(name = "titleMovie",nullable = false,length =25)
    private String titleMovie;
    @Column(name = "genderMovie",nullable = false,length =20)
    private String genderMovie;
    @Column(name = "synopsisMovie",nullable = false,length =300)
    private String synopsisMovie;
    @Column(name = "durationMovie",nullable = false)
    private int durationMovie;
    @Column(name = "yearLaunchMovie",nullable = false)
    private int yearLaunchMovie;

    public Movie() {
    }

    public Movie(int idMovie, String titleMovie, String genderMovie, String synopsisMovie, int durationMovie, int yearLaunchMovie) {
        this.idMovie = idMovie;
        this.titleMovie = titleMovie;
        this.genderMovie = genderMovie;
        this.synopsisMovie = synopsisMovie;
        this.durationMovie = durationMovie;
        this.yearLaunchMovie = yearLaunchMovie;
    }

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
