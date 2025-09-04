package com.demo.weatherApi.mapper;

import com.demo.weatherApi.dto.OpenWeatherResponse;
import com.demo.weatherApi.dto.WeatherControllerResponse;

public class WeatherControllerMapper {
    public static WeatherControllerResponse toControllerResponse(OpenWeatherResponse dto){
        String dir = convertWindDirection(dto.getWind().getDeg());
        return WeatherControllerResponse.builder()
                .name(dto.getName())
                .temperature(dto.getMain().getTemp().toString() + "°")
                .weather(dto.getWeather().getFirst().getMain())
                .description(dto.getWeather().getFirst().getDescription())
                .wind(dto.getWind().getSpeed().toString() + " m/s, dir - " + dir)
                .pressure(dto.getMain().getPressure().toString() + " hPa")
                .humidity(dto.getMain().getHumidity().toString() + " %")
                .build();
    }

    private static String convertWindDirection(Integer deg){
        if (deg >= 338 || deg < 23) return "N";
        if (deg >= 23 && deg < 68) return "NE";
        if (deg >= 68 && deg < 113) return "E";
        if (deg >= 113 && deg < 158) return "SE";
        if (deg >= 158 && deg < 203) return "S";
        if (deg >= 203 && deg < 248) return "SW";
        if (deg >= 248 && deg < 293) return "W";
        return "NW";
    }
}
