package com.demo.weatherApi.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class WeatherEventResponse {
    private String city;
    private LocalDateTime dateTime;
}
