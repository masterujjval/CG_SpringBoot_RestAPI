package com.restapi.apihandling.uc7;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @PostMapping("/post")
    public String msg(@RequestParam String message) {
        return greetingService.saveMessage(message);
    }


    // ✅ New API: Update (Edit) Message
    @PutMapping("/edit/{id}")
    public String edit(@PathVariable int id, @RequestParam String newMessage) {
        return greetingService.editMessage(id, newMessage);
    }
}
