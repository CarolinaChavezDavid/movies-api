package com.academy.moviesapi.services;

import com.academy.moviesapi.entities.Serie;

import java.util.List;

public interface SerieService {
    List<Serie> getSerieList();
    void saveSerie(Serie serie);
}
