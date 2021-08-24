package com.academy.moviesapi.services;

import com.academy.moviesapi.entities.Movie;
import com.academy.moviesapi.entities.Releases;

import java.util.List;

public interface ReleasesService {
    List<Releases> getReleasesList();
    void saveRelease(Releases releases);
}
