package com.demo.weatherApi.repository;

import com.demo.weatherApi.model.WeatherEvent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WeatherEventRepository extends JpaRepository<WeatherEvent, Long> {
    List<WeatherEvent> findByCity(String city);
}
