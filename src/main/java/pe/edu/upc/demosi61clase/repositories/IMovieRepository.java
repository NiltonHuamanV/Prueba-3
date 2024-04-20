package pe.edu.upc.demosi61clase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demosi61clase.entities.Movie;

import java.util.List;

@Repository
public interface IMovieRepository extends JpaRepository<Movie,Integer> {

    public List<Movie> findByYearLaunchMovie(int anio);

}
