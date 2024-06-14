package com.app.appmoviesseries.dto;

import lombok.Data;

@Data
public class SeriesDTO {
    private String title;
    private String startDate;
    private String endDate;
    private String genre;
    private String creator;
    private double rating;
}