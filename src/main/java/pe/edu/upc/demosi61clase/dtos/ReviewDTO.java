package pe.edu.upc.demosi61clase.dtos;
import pe.edu.upc.demosi61clase.entities.Movie;

import java.time.LocalDate;

public class ReviewDTO {
    private int idReview;
    private int pointsReview;
    private String descriptionReview;
    private LocalDate datePublicationReview;
    private String sourceReview;
    private Movie movie;

    public int getIdReview() {
        return idReview;
    }

    public void setIdReview(int idReview) {
        this.idReview = idReview;
    }

    public int getPointsReview() {
        return pointsReview;
    }

    public void setPointsReview(int pointsReview) {
        this.pointsReview = pointsReview;
    }

    public String getDescriptionReview() {
        return descriptionReview;
    }

    public void setDescriptionReview(String descriptionReview) {
        this.descriptionReview = descriptionReview;
    }

    public LocalDate getDatePublicationReview() {
        return datePublicationReview;
    }

    public void setDatePublicationReview(LocalDate datePublicationReview) {
        this.datePublicationReview = datePublicationReview;
    }

    public String getSourceReview() {
        return sourceReview;
    }

    public void setSourceReview(String sourceReview) {
        this.sourceReview = sourceReview;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
