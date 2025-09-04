package com.demo.weatherApi.service.impl;

import com.demo.weatherApi.dto.WeatherControllerResponse;
import com.demo.weatherApi.mapper.WeatherControllerMapper;
import com.demo.weatherApi.service.WeatherService;
import com.demo.weatherApi.service.client.OpenWeatherClient;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements WeatherService {
    private final OpenWeatherClient client;

    private final String apiKey;

    public WeatherServiceImpl(OpenWeatherClient client, Dotenv dotenv) {
        this.client = client;
        this.apiKey = dotenv.get("OPENWEATHER_API_KEY");
    }

    @Override
    @Cacheable(value = "weather", key = "#city")
    public WeatherControllerResponse getWeatherByCity(String city) {
        return WeatherControllerMapper.toControllerResponse(
                client.getWeather(city, apiKey, "metric")
        );
    }
}
