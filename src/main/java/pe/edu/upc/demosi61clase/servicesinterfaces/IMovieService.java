package pe.edu.upc.demosi61clase.servicesinterfaces;

import pe.edu.upc.demosi61clase.entities.Movie;

import java.util.List;

public interface IMovieService {
    public void insert(Movie movie);

    public List<Movie> list();
    public void delete(int id);
    public Movie listId(int id);
    public List<Movie> findByYearLaunchMovie(int anio);

}
