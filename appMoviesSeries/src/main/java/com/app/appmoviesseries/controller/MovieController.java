package com.app.appmoviesseries.controller;

import com.app.appmoviesseries.dto.MovieDTO;
import com.app.appmoviesseries.dto.SeriesDTO;
import com.app.appmoviesseries.entity.Movie;
import com.app.appmoviesseries.entity.Series;
import com.app.appmoviesseries.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies/api")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/all")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @PostMapping("/add")
    public Movie addMovie(@RequestBody MovieDTO movieDTO) {
        return movieService.addMovie(movieDTO);
    }



}