package com.hrmanagement.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, Object> home() {
        return Map.of(
                "message", "HR Management Spring Boot backend is running",
                "endpoints", List.of(
                        "/users",
                        "/leaves",
                        "/api/users",
                        "/api/employees",
                        "/api/leaves"
                )
        );
    }
}
