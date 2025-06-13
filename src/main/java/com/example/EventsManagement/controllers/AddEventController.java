package com.example.EventsManagement.controllers;

import com.example.EventsManagement.models.entity.Event;
import com.example.EventsManagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddEventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/add")
    public String showAddEventForm(Model model) {
        model.addAttribute("event", new Event());
        return "add-event";
    }

    @PostMapping("/add")
    public String addEvent(@ModelAttribute Event event) {
        eventService.saveEvent(event);
        return "redirect:/events";
    }

}
