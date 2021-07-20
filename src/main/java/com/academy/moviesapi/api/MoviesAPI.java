package com.academy.moviesapi.api;

import com.academy.moviesapi.entities.Movie;
import com.academy.moviesapi.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
