package com.demo.weatherApi.service;

import com.demo.weatherApi.model.WeatherEvent;

import java.util.List;

public interface WeatherEventService {

    void save(WeatherEvent event);

    List<WeatherEvent> findAll();

    List<WeatherEvent> findByCity(String city);
}
