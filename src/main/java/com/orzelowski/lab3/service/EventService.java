package com.orzelowski.lab3.service;

import com.orzelowski.lab3.model.Event;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

@Service
public class EventService {


    public List<Event> readDataFromFile() throws FileNotFoundException, ParseException {
        File file = new File("src/main/resources/static/data.txt");
        Scanner reader = new Scanner(file);
        List<Event> events = new ArrayList<>();
        while(reader.hasNext()){
            String[] textLineSepparatedByComma = reader.nextLine().split(",");
            events.add(createEventFromTextLine(textLineSepparatedByComma));
        }
        return events;
    }

    public Event createEventFromTextLine(String[] text) throws ParseException {
        Date startTime = new SimpleDateFormat("yyyy-MM-dd").parse(text[0]);
        String time = text[1];
        String name = text[2];
        return new Event(name,startTime,time);
    }
}
