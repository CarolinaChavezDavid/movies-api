package com.academy.moviesapi.services;

import com.academy.moviesapi.entities.Movie;
import com.academy.moviesapi.entities.Serie;
import com.academy.moviesapi.repositories.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieServicelmpl implements SerieService{
    @Autowired
    SerieRepository serieRepository;


    @Override
    public List<Serie> getSerieList() { return serieRepository.findAll();}

    @Override
    public void saveSerie(Serie serie) {  serieRepository.save(serie);}
}
