package com.example.springdependency.config;

import com.example.springdependency.service.TimeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExtraConfig {

    @Bean
    public TimeService timeZone(){
        return new TimeService();
    }
}