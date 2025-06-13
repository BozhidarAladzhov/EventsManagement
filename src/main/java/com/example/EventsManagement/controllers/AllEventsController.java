package com.example.EventsManagement.controllers;

import com.example.EventsManagement.models.entity.Event;
import com.example.EventsManagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
public class AllEventsController {

    @Autowired
    private EventService eventService;

    @GetMapping("/events")
    public String listEvents(
            @RequestParam(required = false) String eventName,
            @RequestParam(required = false) String eventTown,
            @RequestParam(required = false) String eventType,
            @RequestParam(required = false)
            @DateTimeFormat(pattern = "yyyy-MM-dd") Date eventDate,
            Model model) {

        List<Event> events = eventService.filterEvents(eventName, eventTown, eventType, eventDate);
        model.addAttribute("events", events);
        return "all-events";
    }

}
