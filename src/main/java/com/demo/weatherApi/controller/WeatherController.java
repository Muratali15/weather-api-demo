package com.demo.weatherApi.controller;

import com.demo.weatherApi.dto.WeatherControllerResponse;
import com.demo.weatherApi.dto.WeatherEventResponse;
import com.demo.weatherApi.mapper.WeatherEventMapper;
import com.demo.weatherApi.model.WeatherEvent;
import com.demo.weatherApi.service.WeatherEventService;
import com.demo.weatherApi.service.WeatherService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/weather")
@AllArgsConstructor
public class WeatherController {
    private final WeatherService service;
    private final WeatherEventService eventService;

    @GetMapping()
    @Operation(summary = "Получить погоду по городу",
            description = "Возвращает данные о погоде из OpenWeather API")
    public ResponseEntity<WeatherControllerResponse> getWeatherByCity(
            @RequestParam String city,
            @RequestParam (required = false) String country
    ){
        String request = city + "," + country;
        eventService.save(WeatherEventMapper.createWeatherEvent(request.toLowerCase()));
        WeatherControllerResponse response = service.getWeatherByCity(request.toLowerCase());

        return ResponseEntity.ok(response);
    }

    @GetMapping("/requests")
    public ResponseEntity<List<WeatherEventResponse>> getWeatherEvents(
            @RequestParam (required = false) String city
    ){
        List<WeatherEvent> requests = (city == null) ? eventService.findAll() : eventService.findByCity(city);

        return ResponseEntity.ok(requests.stream().map(WeatherEventMapper::fromEntity).toList());
    }
}
