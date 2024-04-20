package pe.edu.upc.demosi61clase.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demosi61clase.entities.Movie;
import pe.edu.upc.demosi61clase.repositories.IMovieRepository;
import pe.edu.upc.demosi61clase.servicesinterfaces.IMovieService;

import java.util.List;

@Service
public class MovieServiceImplement implements IMovieService {
    @Autowired
    private IMovieRepository mR;

    @Override
    public void insert(Movie movie) {
        mR.save(movie);
    }

    @Override
    public List<Movie> list() {
        return mR.findAll();
    }

    @Override
    public void delete(int id) {
        mR.deleteById(id);
    }

    @Override
    public Movie listId(int id) {
        return mR.findById(id).orElse(new Movie());
    }

    @Override
    public List<Movie> findByYearLaunchMovie(int anio) {
        return mR.findByYearLaunchMovie(anio);
    }
}
