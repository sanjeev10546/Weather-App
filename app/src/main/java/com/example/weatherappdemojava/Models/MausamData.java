package com.example.weatherappdemojava.Models;

import java.util.List;

public class MausamData {

    private List<weather> weather;
    private main main;
    private String name;

    public MausamData(List<com.example.weatherappdemojava.Models.weather> weather, com.example.weatherappdemojava.Models.main main, String name) {
        this.weather = weather;
        this.main = main;
        this.name = name;
    }

    public List<com.example.weatherappdemojava.Models.weather> getWeather() {
        return weather;
    }

    public void setWeather(List<com.example.weatherappdemojava.Models.weather> weather) {
        this.weather = weather;
    }

    public com.example.weatherappdemojava.Models.main getMain() {
        return main;
    }

    public void setMain(com.example.weatherappdemojava.Models.main main) {
        this.main = main;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


