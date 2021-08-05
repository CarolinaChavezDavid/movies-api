package com.academy.moviesapi.api;

import com.academy.moviesapi.entities.Movie;
import com.academy.moviesapi.entities.Serie;
import com.academy.moviesapi.services.MovieService;
import com.academy.moviesapi.services.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/series")
public class SeriesAPI {

    @Autowired
    SerieService serieService;

    @GetMapping("/")
    public List<Serie> getMovies(){
            return serieService.getSerieList();
        }

    @PostMapping(path = "/{id}")
    public void saveSerie (@RequestBody Serie serie){serieService.saveSerie(serie);}



}
