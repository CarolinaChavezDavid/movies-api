package com.academy.moviesapi.services;

import com.academy.moviesapi.entities.Releases;
import com.academy.moviesapi.repositories.ReleasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReleasesServicelmpl implements  ReleasesService{

    @Autowired
    ReleasesRepository releasesRepository;

    @Override
    public List<Releases> getReleasesList() {
        return  releasesRepository.findAll();
    }

    @Override
    public void saveRelease(Releases releases) {
        releasesRepository.save(releases);
    }
}
