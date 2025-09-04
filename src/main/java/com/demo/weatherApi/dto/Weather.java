package com.demo.weatherApi.dto;

import lombok.Data;

@Data
public class Weather {
    private String main;
    private String description;
}