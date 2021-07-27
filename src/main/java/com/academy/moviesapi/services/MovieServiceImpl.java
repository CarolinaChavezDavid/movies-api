package com.academy.moviesapi.services;

import com.academy.moviesapi.entities.Movie;
import com.academy.moviesapi.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public List<Movie> getMovieList() {
        return movieRepository.findAll();
    }

    @Override
    public void saveMovie(Movie movie) { movieRepository.save(movie); }


}
