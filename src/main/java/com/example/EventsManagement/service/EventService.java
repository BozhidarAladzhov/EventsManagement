package com.example.EventsManagement.service;

import com.example.EventsManagement.models.entity.Event;
import com.example.EventsManagement.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public void saveEvent(Event event) {
        eventRepository.save(event);
    }

    public List<Event> filterEvents(String eventName, String eventTown, String eventType, Date eventDate) {
        List<Event> allEvents = eventRepository.findAll();

        return allEvents.stream()
                .filter(e -> eventName == null || e.getEventName().toLowerCase().contains(eventName.toLowerCase()))
                .filter(e -> eventTown == null || e.getEventTown().toLowerCase().contains(eventTown.toLowerCase()))
                .filter(e -> eventType == null || e.getEventType().toLowerCase().contains(eventType.toLowerCase()))
                .filter(e -> eventDate == null || sameDay(e.getEventDate(), eventDate))
                .toList();
    }

    private boolean sameDay(Date d1, Date d2) {
        return d1.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate()
                .isEqual(d2.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate());
    }



}
