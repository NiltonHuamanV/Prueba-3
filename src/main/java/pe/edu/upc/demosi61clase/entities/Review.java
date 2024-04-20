package pe.edu.upc.demosi61clase.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReview;
    @Column(name = "pointsReview", nullable = false)
    private int pointsReview;
    @Column(name = "descriptionReview", nullable = false, length = 200)
    private String descriptionReview;
    @Column(name = "datePublicationReview", nullable = false)
    private LocalDate datePublicationReview;
    @Column(name = "sourceReview", nullable = false, length = 40)
    private String sourceReview;
    @ManyToOne
    @JoinColumn(name = "movieId")
    private Movie movie;

    public Review() {
    }

    public Review(int idReview, int pointsReview, String descriptionReview, LocalDate datePublicationReview, String sourceReview, Movie movie) {
        this.idReview = idReview;
        this.pointsReview = pointsReview;
        this.descriptionReview = descriptionReview;
        this.datePublicationReview = datePublicationReview;
        this.sourceReview = sourceReview;
        this.movie = movie;
    }

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
