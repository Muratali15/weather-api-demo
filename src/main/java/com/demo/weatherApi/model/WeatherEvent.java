package com.demo.weatherApi.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class WeatherEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "weather_seq")
    @SequenceGenerator(
            name = "weather_seq",
            sequenceName = "weather_sequence",
            allocationSize = 1
    )
    private Long id;

    private String city;
    private LocalDateTime dateTime;
}