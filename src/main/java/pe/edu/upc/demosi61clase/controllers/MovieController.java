package pe.edu.upc.demosi61clase.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demosi61clase.dtos.MovieDTO;
import pe.edu.upc.demosi61clase.entities.Movie;
import pe.edu.upc.demosi61clase.servicesinterfaces.IMovieService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/peliculas")
public class MovieController {
    @Autowired
    private IMovieService mS;

    @PostMapping
    public void insertar(@RequestBody MovieDTO movieDTO) {
        ModelMapper d = new ModelMapper();
        Movie movie = d.map(movieDTO, Movie.class);
        mS.insert(movie);
    }

    //aquí
    @PutMapping
    public void modificar(@RequestBody MovieDTO movieDTO) {
        ModelMapper d = new ModelMapper();
        Movie movie = d.map(movieDTO, Movie.class);
        mS.insert(movie);
    }

    @GetMapping
    public List<MovieDTO> listar() {
        return mS.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, MovieDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        mS.delete(id);
    }

    @GetMapping("/{id}")
    public MovieDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        MovieDTO dto = m.map(mS.listId(id), MovieDTO.class);
        return dto;
    }

    @GetMapping("/find")
    public List<MovieDTO> buscar(@RequestParam int anio) {
        return mS.findByYearLaunchMovie(anio).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, MovieDTO.class);
        }).collect(Collectors.toList());
    }


}
