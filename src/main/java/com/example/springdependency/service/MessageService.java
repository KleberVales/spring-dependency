package com.example.springdependency.service;

import java.util.TimeZone;

public class MessageService {
    private final TimeService timeZone;

    public MessageService(TimeService timeZone) {
        this.timeZone = timeZone;
    }

    public String getMessage() {
        return "Hello World!" + timeZone.getTime();
    }
}