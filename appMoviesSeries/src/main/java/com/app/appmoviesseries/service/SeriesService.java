package com.app.appmoviesseries.service;

import com.app.appmoviesseries.dto.SeriesDTO;
import com.app.appmoviesseries.entity.Series;
import com.app.appmoviesseries.repository.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeriesService {
    @Autowired
    private SeriesRepository seriesRepository;

    public List<Series> getAllSeries() {
        return seriesRepository.findAll();
    }

    public Series addSeries(SeriesDTO seriesDTO) {
        Series series = new Series();
        series.setTitle(seriesDTO.getTitle());
        series.setStartDate(seriesDTO.getStartDate());
        series.setEndDate(seriesDTO.getEndDate());
        series.setGenre(seriesDTO.getGenre());
        series.setCreator(seriesDTO.getCreator());
        series.setRating(seriesDTO.getRating());
        return seriesRepository.save(series);
    }


}