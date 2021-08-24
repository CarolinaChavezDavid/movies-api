package com.academy.moviesapi.api;

import com.academy.moviesapi.entities.Movie;
import com.academy.moviesapi.entities.Releases;
import com.academy.moviesapi.services.MovieService;
import com.academy.moviesapi.services.ReleasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/releases")
public class ReleasesAPI {
    @Autowired
    ReleasesService releasesService;

    @GetMapping("/")
    public List<Releases> getReleases(){
        return releasesService.getReleasesList();
    }

    @PostMapping(path = "/{id}")
    public void saveReleases (@RequestBody Releases releases){releasesService.saveRelease(releases);}

}
