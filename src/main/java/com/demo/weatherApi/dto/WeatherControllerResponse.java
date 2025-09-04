package com.demo.weatherApi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherControllerResponse implements Serializable {
    private String name;
    private String temperature;
    private String weather;
    private String description;
    private String wind;
    private String pressure;
    private String humidity;
}
