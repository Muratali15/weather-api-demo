package com.demo.weatherApi.service.impl;

import com.demo.weatherApi.model.WeatherEvent;
import com.demo.weatherApi.repository.WeatherEventRepository;
import com.demo.weatherApi.service.WeatherEventService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WeatherEventServiceImpl implements WeatherEventService {
    private final WeatherEventRepository repository;

    @Override
    public void save(WeatherEvent event) {
        repository.save(event);
    }

    @Override
    public List<WeatherEvent> findAll() {
        return repository.findAll();
    }

    @Override
    public List<WeatherEvent> findByCity(String city) {
        return repository.findByCity(city);
    }
}