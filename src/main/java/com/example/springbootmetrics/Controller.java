package com.example.springbootmetrics;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/event")
public class Controller {


    @GetMapping
    @Timed(value = "event.time", description = "Time taken to get an event")
    public String getEvent() {
        return "Event";
    }
}
