package com.example.springdependency.config;

import com.example.springdependency.service.MessageService;
import com.example.springdependency.service.TimeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ExtraConfig.class)
public class AppConfig {

    @Bean
    public MessageService messageService(TimeService timeService) {
        return new MessageService(timeService);
    }
}