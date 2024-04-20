package pe.edu.upc.demosi61clase.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demosi61clase.entities.Review;
import pe.edu.upc.demosi61clase.repositories.IReviewRepository;
import pe.edu.upc.demosi61clase.servicesinterfaces.IReviewService;

import java.util.List;

@Service
public class ReviewServiceImplement implements IReviewService {
    @Autowired
    private IReviewRepository rR;

    @Override
    public void insert(Review review) {
        rR.save(review);
    }

    @Override
    public List<Review> list() {
        return rR.findAll();
    }

    @Override
    public List<String[]> quantityReviewByMovie() {
        return rR.quantityReviewByMovie();
    }

    @Override
    public List<String[]> sumPoints() {
        return rR.sumPoints();
    }

    @Override
    public List<Review> listReviews(String titulo) { return rR.listReviews(titulo); }
}
