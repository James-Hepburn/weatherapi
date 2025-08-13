package com.example.weatherapi.controller;

import com.example.weatherapi.service.WeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherController {
    private WeatherService weatherService;

    public WeatherController (WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/")
    public String home () {
        return "index";
    }

    // implement this later
    @GetMapping("/weather")
    public String getWeather (Model model) {
        return "index";
    }
}
