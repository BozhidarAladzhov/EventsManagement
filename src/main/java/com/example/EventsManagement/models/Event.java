package com.example.EventsManagement.models;

import java.time.LocalDate;
import java.util.List;

public class Event {

    private String title;
    private String city;
    private LocalDate date;
    private String type;
    private List<String> lectors;


    public Event(String title, String city, LocalDate date, String type, List<String> lectors) {
        this.title = title;
        this.city = city;
        this.date = date;
        this.type = type;
        this.lectors = lectors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getLectors() {
        return lectors;
    }

    public void setLectors(List<String> lectors) {
        this.lectors = lectors;
    }
}
