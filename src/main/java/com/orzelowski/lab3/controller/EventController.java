package com.orzelowski.lab3.controller;

import com.orzelowski.lab3.model.Event;
import com.orzelowski.lab3.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping("/events")
    public List<Event> getEvents() throws FileNotFoundException, ParseException {
        return eventService.readDataFromFile();
    }
}
