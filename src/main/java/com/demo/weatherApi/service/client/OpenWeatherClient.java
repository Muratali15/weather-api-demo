package com.demo.weatherApi.service.client;

import com.demo.weatherApi.dto.OpenWeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "openWeather",
        url = "https://api.openweathermap.org/data/2.5"
)
public interface OpenWeatherClient {

    @GetMapping("/weather")
    OpenWeatherResponse getWeather(
            @RequestParam("q") String city,
            @RequestParam("appid") String apiKey,
            @RequestParam("units") String units
    );
}
