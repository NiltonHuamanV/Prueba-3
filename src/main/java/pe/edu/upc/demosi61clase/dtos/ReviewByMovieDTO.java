package pe.edu.upc.demosi61clase.dtos;

public class ReviewByMovieDTO {
    private String nameMovie;
    private int quantityReview;

    public String getNameMovie() {
        return nameMovie;
    }
    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }
    public int getQuantityReview() {
        return quantityReview;
    }
    public void setQuantityReview(int quantityReview) {
        this.quantityReview = quantityReview;
    }
}
