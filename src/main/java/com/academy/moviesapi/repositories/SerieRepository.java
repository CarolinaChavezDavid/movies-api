package com.academy.moviesapi.repositories;

import com.academy.moviesapi.entities.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}
