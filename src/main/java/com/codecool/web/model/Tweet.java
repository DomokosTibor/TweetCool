package com.codecool.web.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tweet {

    private String name;
    private String date;
    private String message;

    public Tweet(String name, String message) {
        this.name = name;
        this.date = getCurrentDate();
        this.message = message;
    }

    private String getCurrentDate() {
        Date now = new Date();
        SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd.' - 'hh:mm");
        return date.format(now);
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }
}
