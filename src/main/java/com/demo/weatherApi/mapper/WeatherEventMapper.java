package com.demo.weatherApi.mapper;

import com.demo.weatherApi.dto.WeatherEventResponse;
import com.demo.weatherApi.model.WeatherEvent;

import java.time.LocalDateTime;

public class WeatherEventMapper {
    public static WeatherEvent createWeatherEvent(String city){
        return WeatherEvent.builder()
                .city(city)
                .dateTime(LocalDateTime.now())
                .build();
    }

    public static WeatherEventResponse fromEntity(WeatherEvent entity){
        return WeatherEventResponse.builder()
                .city(entity.getCity())
                .dateTime(entity.getDateTime())
                .build();
    }
}