package com.restapi.apihandling.uc5;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class GreetingController {
   private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    @PostMapping("/post")
    public String post(@RequestParam String message){
        return greetingService.saveMessage(message);
    }
    @GetMapping("/get")
    public String get(@RequestParam int id){
        return greetingService.showMessage(id);
    }

}
