package com.academy.moviesapi.repositories;

import com.academy.moviesapi.entities.Releases;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleasesRepository extends JpaRepository<Releases, Long> {
}
