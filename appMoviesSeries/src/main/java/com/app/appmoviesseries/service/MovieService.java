package com.app.appmoviesseries.service;

import com.app.appmoviesseries.dto.MovieDTO;
import com.app.appmoviesseries.entity.Movie;
import com.app.appmoviesseries.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie addMovie(MovieDTO movieDTO) {
        Movie movie = new Movie();
        movie.setTitle(movieDTO.getTitle());
        movie.setReleaseDate(movieDTO.getReleaseDate());
        movie.setGenre(movieDTO.getGenre());
        movie.setDirector(movieDTO.getDirector());
        movie.setRating(movieDTO.getRating());
        return movieRepository.save(movie);
    }



}
