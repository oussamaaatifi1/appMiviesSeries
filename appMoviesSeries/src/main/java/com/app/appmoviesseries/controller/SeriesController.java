package com.app.appmoviesseries.controller;

import com.app.appmoviesseries.dto.SeriesDTO;
import com.app.appmoviesseries.entity.Series;
import com.app.appmoviesseries.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/series/api")
public class SeriesController {
    @Autowired
    private SeriesService seriesService;

    @GetMapping("/all")
    public List<Series> getAllSeries() {
        return seriesService.getAllSeries();
    }

    @PostMapping("/add")
    public Series addSeries(@RequestBody SeriesDTO seriesDTO) {
        return seriesService.addSeries(seriesDTO);
    }

    // Additional REST endpoints for series operations can be added here
}