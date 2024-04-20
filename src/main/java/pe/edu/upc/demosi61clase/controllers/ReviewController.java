package pe.edu.upc.demosi61clase.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demosi61clase.dtos.PointByMovieDTO;
import pe.edu.upc.demosi61clase.dtos.ReviewByMovieDTO;
import pe.edu.upc.demosi61clase.dtos.ReviewDTO;
import pe.edu.upc.demosi61clase.entities.Review;
import pe.edu.upc.demosi61clase.servicesinterfaces.IReviewService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/criticas")
public class ReviewController {
    @Autowired
    private IReviewService rS;

    @PostMapping
    public void insertar(@RequestBody ReviewDTO reviewDTO) {
        ModelMapper m = new ModelMapper();
        Review r = m.map(reviewDTO, Review.class);
        rS.insert(r);
    }

    @GetMapping
    public List<ReviewDTO> listar() {
        return rS.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, ReviewDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/cantidades")
    public List<ReviewByMovieDTO> cantidadCriticasPelicula() {
        List<String[]> filaLista = rS.quantityReviewByMovie();
        List<ReviewByMovieDTO> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            ReviewByMovieDTO dto=new ReviewByMovieDTO();
            dto.setNameMovie(columna[0]);
            dto.setQuantityReview(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return  dtoLista;
    }

    @GetMapping("/sumas")
    public List<PointByMovieDTO> sumaPuntos() {
        List<String[]> filaLista = rS.sumPoints();
        List<PointByMovieDTO> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            PointByMovieDTO dto=new PointByMovieDTO();
            dto.setNameMovie(columna[0]);
            dto.setSumPoints(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return  dtoLista;
    }
    @GetMapping("/listacriticas")
    public List<ReviewDTO> listacriticas(@RequestParam String pelicula) {
        return rS.listReviews(pelicula).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, ReviewDTO.class);
        }).collect(Collectors.toList());
    }
}
