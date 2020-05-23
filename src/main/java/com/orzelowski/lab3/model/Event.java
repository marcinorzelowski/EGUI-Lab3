package com.orzelowski.lab3.model;

import java.util.Date;

public class Event {
    private String name;
    private Date startDate;
    private String time;

    public Event(String name, Date startDate, String time) {
        this.name = name;
        this.startDate = startDate;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
