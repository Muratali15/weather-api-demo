package com.demo.weatherApi.dto;

import lombok.Data;

@Data
public class Main {
    private Double temp;
    private Integer pressure;
    private Integer humidity;
}
