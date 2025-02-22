package com.restapi.apihandling.uc4;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // Save greeting message
    @PostMapping("/save")
    public String saveGreeting(@RequestParam String message) {
        return greetingService.saveGreeting(message);
    }

    // Get all greeting messages
    @GetMapping("/all")
    public List<String> getAllGreetings() {
        return greetingService.getAllGreetings();
    }
}
