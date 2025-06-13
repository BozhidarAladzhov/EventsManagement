package com.example.EventsManagement.models.dto;

import java.util.Date;

public class AddEventForm {

    private String eventName;
    private String eventTown;
    private Date eventDate;
    private String eventType;
    private String lectors;

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
