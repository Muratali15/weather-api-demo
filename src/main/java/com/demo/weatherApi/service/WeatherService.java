package com.demo.weatherApi.service;

import com.demo.weatherApi.dto.WeatherControllerResponse;

public interface WeatherService {

    WeatherControllerResponse getWeatherByCity(String city);
}
