package com.academy.moviesapi.api;

import com.academy.moviesapi.entities.Movie;
import com.academy.moviesapi.repositories.MovieRepository;
import com.academy.moviesapi.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie")
public class MoviesAPI {

    @Autowired
    MovieService movieService;

    @GetMapping("/")
    public List<Movie> getMovies(){
        return movieService.getMovieList();
    }

    @PostMapping(path = "/{id}")
    public void saveMovie (@RequestBody Movie movie){movieService.saveMovie(movie);}


}
