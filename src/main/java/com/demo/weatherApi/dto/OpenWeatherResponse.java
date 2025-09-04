package com.demo.weatherApi.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenWeatherResponse {
    private String name;
    private Main main;
    private List<Weather> weather;
    private Wind wind;
}
