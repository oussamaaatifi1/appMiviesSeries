package com.app.appmoviesseries.dto;

import lombok.Data;

@Data
public class MovieDTO {
    private String title;
    private String releaseDate;
    private String genre;
    private String director;
    private double rating;
}