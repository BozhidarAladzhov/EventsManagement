package com.example.EventsManagement.models.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String eventName;
    private String eventTown;
    private Date eventDate;
    private String eventType;
    private String lectors;

    public Event(){}

    public Event(String eventName, String eventTown, Date eventDate, String eventType, String lectors) {
        this.eventName = eventName;
        this.eventTown = eventTown;
        this.eventDate = eventDate;
        this.eventType = eventType;
        this.lectors = lectors;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventTown() {
        return eventTown;
    }

    public void setEventTown(String eventTown) {
        this.eventTown = eventTown;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getLectors() {
        return lectors;
    }

    public void setLectors(String lectors) {
        this.lectors = lectors;
    }
}
