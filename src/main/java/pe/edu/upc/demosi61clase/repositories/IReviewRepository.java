package pe.edu.upc.demosi61clase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demosi61clase.entities.Review;

import java.util.List;
//Este es el repositorio de reviewjj
@Repository
public interface IReviewRepository extends JpaRepository<Review, Integer> {
    @Query(value = "select m.title_movie as Pelicula, count(*) as cantidad \n" +
            "from Movie m inner join Review r on \n" +
            "m.id_movie=r.movie_id \n" +
            "group by m.title_movie ", nativeQuery = true)
    public List<String[]> quantityReviewByMovie();

    @Query(value = "select m.title_movie as Pelicula, sum(r.points_review) as Suma \n" +
            "from Movie m inner join Review r  on \n" +
            "m.id_movie=r.movie_id \n" +
            "group by m.title_movie ", nativeQuery = true)
    public List<String[]> sumPoints();

    //Lista de criticas por pelicula
    @Query("from Review r where r.movie.titleMovie =:titulo")
    List<Review> listReviews(@Param("titulo")String titulo);


}
