package com.example.springdependency.service;

import java.time.LocalDateTime;

public class TimeService{

    public String getTime(){
        return LocalDateTime.now().toString();
    }
}