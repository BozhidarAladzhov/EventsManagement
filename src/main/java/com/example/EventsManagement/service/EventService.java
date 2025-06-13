package com.example.EventsManagement.service;

import com.example.EventsManagement.models.Event;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class EventService {


    private final List<Event> events = new ArrayList<>();

    public void addEvent(Event event){
        events.add(event);
    }

    public List<Event> getFilteredAndSortedEvents() {
        return events.stream()
                .filter(e -> (
                        (e.getCity().equalsIgnoreCase("Plovdiv") && e.getDate().getMonthValue() == 9) || // септември
                                ((e.getCity().equalsIgnoreCase("Varna") || e.getCity().equalsIgnoreCase("Stara Zagora")) &&
                                        isInSpring(e.getDate()))
                ))
                .sorted(Comparator
                        .comparing((Event e) -> !e.getTitle().equalsIgnoreCase("Dev Bites"))
                        .thenComparing(Event::getTitle)
                        .thenComparing(Event::getDate)
                        .thenComparing(Event::getType)
                        .thenComparing(Event::getCity)
                )
                .collect(Collectors.toList());
    }

    private boolean isInSpring(LocalDate date) {
        int month = date.getMonthValue();
        return month >= 3 && month <= 5;
    }

    public List<Event> getAllEvents() {
        return events;
    }


}
