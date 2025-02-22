package com.restapi.apihandling.uc8;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @PostMapping("/post")
    public String msg(@RequestParam String message){
        return greetingService.saveMessage(message);
    }
    @DeleteMapping("/delete")
    public String dlt(@RequestParam int id){
        return greetingService.deleteMessage(id);
    }

}
