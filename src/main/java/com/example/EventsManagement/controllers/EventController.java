package com.example.EventsManagement.controllers;

import com.example.EventsManagement.models.Event;
import com.example.EventsManagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public void addEvent(@RequestBody Event event) {
        eventService.addEvent(event);
    }

    @GetMapping("/filtered")
    public List<Event> getFilteredSortedEvents() {
        return eventService.getFilteredAndSortedEvents();
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }



}
